package com.codeWith.firstApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codeWith.firstApp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Optional<Employee> findByEmail(String email);
    Optional<Employee> findByEmpCode(String empCode);
    Optional<Employee> findByName(String name);    
    Optional<Employee> findByEmailOrEmpCodeOrName(String email, String empCode, String name);
    
}
