package com.facudev.Task_Springboot.dto;


import lombok.Data;

@Data
public class AuthenticationRequest {

    private String email;
    private String password;

}
