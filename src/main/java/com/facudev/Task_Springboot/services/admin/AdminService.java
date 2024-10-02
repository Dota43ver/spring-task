package com.facudev.Task_Springboot.services.admin;

import com.facudev.Task_Springboot.dto.UserDto;

import java.util.List;

public interface AdminService {

    List<UserDto> getUsers();
}
