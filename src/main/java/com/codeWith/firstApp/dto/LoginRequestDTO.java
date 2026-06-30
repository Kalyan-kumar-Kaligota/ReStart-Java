package com.codeWith.firstApp.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequestDTO {

    @NotBlank(message = "Login id is required")
    private String loginId;

    @NotBlank(message = "Password is Mandatory")
    private String password;
}
