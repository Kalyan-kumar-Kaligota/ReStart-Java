package com.codeWith.firstApp.service;

import java.util.List;

import com.codeWith.firstApp.dto.EmployeeRequestDTO;
import com.codeWith.firstApp.dto.EmployeeResponseDTO;
import com.codeWith.firstApp.dto.LoginRequestDTO;
import com.codeWith.firstApp.dto.LoginResponseDTO;

public interface EmployeeService {

    EmployeeResponseDTO saveEmployee(EmployeeRequestDTO dto);

    List<EmployeeResponseDTO> getEmployees();

    EmployeeResponseDTO updateEmployee(String empCode, EmployeeRequestDTO dto);

    List<EmployeeResponseDTO> updateAllEmployees(List<EmployeeRequestDTO> employees);

    EmployeeResponseDTO getEmpById(Integer id);

    void deleteEmp(Integer id);

    EmployeeResponseDTO getEmpByEmail(String email);

    EmployeeResponseDTO getEmpByEmpCode(String empCode);

    EmployeeResponseDTO getEmpByName(String name);

    //login
    LoginResponseDTO login(LoginRequestDTO dto);


    //encryt all
    public void encryptExistingPasswords();
}