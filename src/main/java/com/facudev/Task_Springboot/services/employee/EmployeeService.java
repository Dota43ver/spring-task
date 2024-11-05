package com.facudev.Task_Springboot.services.employee;

import com.facudev.Task_Springboot.dto.TaskDto;

import java.util.List;

public interface EmployeeService {

    List<TaskDto> getTaskByUserId();

}
