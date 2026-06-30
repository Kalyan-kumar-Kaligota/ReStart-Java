package com.codeWith.firstApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.codeWith.firstApp.dto.EmployeeRequestDTO;
import com.codeWith.firstApp.dto.EmployeeResponseDTO;
import com.codeWith.firstApp.dto.LoginRequestDTO;
import com.codeWith.firstApp.dto.LoginResponseDTO;
import com.codeWith.firstApp.exceptions.EmployeeNotFoundException;
import com.codeWith.firstApp.model.Employee;
import com.codeWith.firstApp.repository.EmployeeRepository;
import com.codeWith.firstApp.security.JwtUtil;

@Service
public class EmployeeServiceImp implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public EmployeeServiceImp(
            EmployeeRepository employeeRepository,
            PasswordEncoder passwordEncoder,
            JwtUtil jwtUtil) {

        this.employeeRepository = employeeRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    private EmployeeResponseDTO mapToResponse(Employee employee) {

        EmployeeResponseDTO dto = new EmployeeResponseDTO();

        dto.setEmpId(employee.getEmpId());
        dto.setEmpCode(employee.getEmpCode());
        dto.setName(employee.getName());
        dto.setEmail(employee.getEmail());
        dto.setDesignation(employee.getDesignation());
        dto.setDomain(employee.getDomain());

        return dto;
    }

    // RequestDTO -> Entity
    private Employee mapToEntity(EmployeeRequestDTO dto) {

        Employee employee = new Employee();

        employee.setEmpCode(dto.getEmpCode());
        employee.setName(dto.getName());
        employee.setEmail(dto.getEmail());
        employee.setPassword(passwordEncoder.encode(dto.getPassword()));
        employee.setDesignation(dto.getDesignation());
        employee.setDomain(dto.getDomain());

        return employee;
    }

    @Override
    public EmployeeResponseDTO saveEmployee(EmployeeRequestDTO dto) {

        Employee employee = mapToEntity(dto);

        Employee savedEmployee = employeeRepository.save(employee);

        return mapToResponse(savedEmployee);
    }

    @Override
    public List<EmployeeResponseDTO> getEmployees() {

        return employeeRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    @Override
    public EmployeeResponseDTO updateEmployee(String empCode, EmployeeRequestDTO dto) {

        Employee existingEmp = employeeRepository.findByEmpCode(empCode)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found"));

        existingEmp.setEmpCode(dto.getEmpCode());
        existingEmp.setName(dto.getName());
        existingEmp.setEmail(dto.getEmail());

        // Password only if provided
        if (dto.getPassword() != null && !dto.getPassword().isBlank()) {
            existingEmp.setPassword(passwordEncoder.encode(dto.getPassword()));
        }

        existingEmp.setDesignation(dto.getDesignation());
        existingEmp.setDomain(dto.getDomain());

        Employee updatedEmployee = employeeRepository.save(existingEmp);

        return mapToResponse(updatedEmployee);
    }

    @Override
    public List<EmployeeResponseDTO> updateAllEmployees(List<EmployeeRequestDTO> employees) {

        List<EmployeeResponseDTO> updatedEmployees = new ArrayList<>();

        for (EmployeeRequestDTO dto : employees) {

            Employee existingEmp = employeeRepository.findByEmpCode(dto.getEmpCode())
                    .orElseThrow(() -> new EmployeeNotFoundException("Employee Not Found"));

            existingEmp.setEmpCode(dto.getEmpCode());
            existingEmp.setName(dto.getName());
            existingEmp.setEmail(dto.getEmail());

            if (dto.getPassword() != null && !dto.getPassword().isBlank()) {
                existingEmp.setPassword(passwordEncoder.encode(dto.getPassword()));
            }

            existingEmp.setDesignation(dto.getDesignation());
            existingEmp.setDomain(dto.getDomain());

            Employee updatedEmployee = employeeRepository.save(existingEmp);

            updatedEmployees.add(mapToResponse(updatedEmployee));
        }

        return updatedEmployees;
    }

    @Override
    public EmployeeResponseDTO getEmpById(Integer id) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee Id Not Found"));

        return mapToResponse(employee);
    }

    @Override
    public EmployeeResponseDTO getEmpByEmail(String email) {

        Employee employee = employeeRepository.findByEmail(email)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee Email Not Found"));

        return mapToResponse(employee);
    }

    @Override
    public EmployeeResponseDTO getEmpByEmpCode(String empCode) {

        Employee employee = employeeRepository.findByEmpCode(empCode)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee Code Not Found"));

        return mapToResponse(employee);
    }

    @Override
    public EmployeeResponseDTO getEmpByName(String name) {

        Employee employee = employeeRepository.findByName(name)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee Name Not Found"));

        return mapToResponse(employee);
    }

    @Override
    public void deleteEmp(Integer id) {

        if (!employeeRepository.existsById(id)) {
            throw new EmployeeNotFoundException("Employee Id Not Found");
        }

        employeeRepository.deleteById(id);
    }

    // login
    @Override
    public LoginResponseDTO login(LoginRequestDTO dto) {
        Employee employee = employeeRepository.findByEmailOrEmpCodeOrName(
                        dto.getLoginId(),
                        dto.getLoginId(),
                        dto.getLoginId())
                .orElseThrow(() -> new EmployeeNotFoundException("Invalid Username or Email or Employee Code"));

        if (!passwordEncoder.matches(dto.getPassword(), employee.getPassword())) {
            throw new EmployeeNotFoundException("Invalid Credentials");
        }

        String token = jwtUtil.generateToken(employee.getEmail());
        LoginResponseDTO response = new LoginResponseDTO();

        response.setEmpId(employee.getEmpId());
        response.setEmpCode(employee.getEmpCode());
        response.setName(employee.getName());
        response.setEmail(employee.getEmail());
        response.setDesignation(employee.getDesignation());
        response.setDomain(employee.getDomain());
        response.setToken(token);
        response.setMessage("Login Successful");

        return response;
    }

    @Override
    public void encryptExistingPasswords() {
        List<Employee> employees = employeeRepository.findAll();
        for (Employee emp : employees) {
            if (!emp.getPassword().startsWith("$2")) {
                emp.setPassword(passwordEncoder.encode(emp.getPassword()));
                employeeRepository.save(emp);
            }
        }
    }

}