package com.codeWith.firstApp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EmployeeRequestDTO {

    @NotBlank(message = "Employee Code is required")
    private String empCode;

    @NotBlank(message = "Employee Name is required")
    @Size(min = 3, max = 50)
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid Email")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 8, max = 20)
    private String password;

    @NotBlank(message = "Designation is required")
    private String designation;

    @NotBlank(message = "Domain is required")
    private String domain;
}