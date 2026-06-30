package com.codeWith.firstApp.dto;

import lombok.Data;

@Data
public class EmployeeResponseDTO {

    private Integer empId;

    private String empCode;

    private String name;

    private String email;

    private String designation;

    private String domain;
}