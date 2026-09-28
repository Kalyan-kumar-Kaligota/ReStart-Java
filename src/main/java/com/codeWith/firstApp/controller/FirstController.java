package com.codeWith.firstApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codeWith.firstApp.dto.EmployeeRequestDTO;
import com.codeWith.firstApp.dto.EmployeeResponseDTO;
import com.codeWith.firstApp.dto.LoginRequestDTO;
import com.codeWith.firstApp.dto.LoginResponseDTO;
import com.codeWith.firstApp.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/firstApp")
public class FirstController {

    @Autowired
    private EmployeeService empService;

    @GetMapping("/welcome")
    public String welcome(@RequestParam String name) {
        return "Welcome to Spring Boot Application, " + name + "!";
    }

    @GetMapping("/test")
    public String getMethodName() {
        return "show print";
    }

    @PostMapping("/save")
    public ResponseEntity<EmployeeResponseDTO> saveEmployee(
            @Valid @RequestBody EmployeeRequestDTO dto) {
        return ResponseEntity.ok(empService.saveEmployee(dto));
    }

    @GetMapping("/get")
    public ResponseEntity<List<EmployeeResponseDTO>> getEmployee() {
        return ResponseEntity.ok(empService.getEmployees());
    }

    @PutMapping("/update")
    public ResponseEntity<EmployeeResponseDTO> updateEmployee(
            @RequestParam String empCode, @Valid @RequestBody EmployeeRequestDTO dto) {
        return ResponseEntity.ok(empService.updateEmployee(empCode, dto));
    }

    @PutMapping("/updateAll")
    public ResponseEntity<List<EmployeeResponseDTO>> updateAllEmployees(
            @Valid @RequestBody List<EmployeeRequestDTO> employees) {
        return ResponseEntity.ok(empService.updateAllEmployees(employees));
    }

    @GetMapping("/getById")
    public ResponseEntity<EmployeeResponseDTO> getEmployeeById(@RequestParam Integer id) {
        return ResponseEntity.ok(empService.getEmpById(id));
    }

    @GetMapping("/getByEmpCode")
    public ResponseEntity<EmployeeResponseDTO> getEmployeeCode(@RequestParam String empCode) {
        return ResponseEntity.ok(empService.getEmpByEmpCode(empCode));
    }

    @GetMapping("/getByEmail")
    public ResponseEntity<EmployeeResponseDTO> getByEmail(@RequestParam String email) {
        return ResponseEntity.ok(empService.getEmpByEmail(email));
    }

    @GetMapping("/getByName")
    public ResponseEntity<EmployeeResponseDTO> getByName(@RequestParam String name) {
        return ResponseEntity.ok(empService.getEmpByName(name));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteEmployee(@RequestParam Integer id) {
        empService.deleteEmp(id);
        return ResponseEntity.ok("Employee Deleted Successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@Valid @RequestBody LoginRequestDTO dto) {
        return ResponseEntity.ok(empService.login(dto));
    }

    @PostMapping("/encryptAllPasswords")
    public String encryptAllPasswords() {
        empService.encryptExistingPasswords();
        return "All Passwords Encrypted Successfully";
    }
}