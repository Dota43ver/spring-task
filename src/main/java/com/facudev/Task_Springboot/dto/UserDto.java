package com.facudev.Task_Springboot.dto;

import com.facudev.Task_Springboot.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {


    private Long id;
    private String name;
    private String email;
    private String password;
    private UserRole userRole;


}
