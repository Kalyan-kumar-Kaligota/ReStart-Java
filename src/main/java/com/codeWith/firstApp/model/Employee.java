package com.codeWith.firstApp.model;


import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "Employee")
public class Employee {
    
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;

    private String empCode;

    private String name;

    private String email;

    private String password;

    private String designation;

    private String domain; 
}
