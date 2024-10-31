package com.facudev.Task_Springboot.services.admin;

import com.facudev.Task_Springboot.dto.TaskDto;
import com.facudev.Task_Springboot.dto.UserDto;

import java.util.List;

public interface AdminService {

    List<UserDto> getUsers();

    TaskDto createTask(TaskDto taskDto);

    List <TaskDto> getALlTask();

    void deleteTask(Long id);

    TaskDto getTaskById(Long id);
}
