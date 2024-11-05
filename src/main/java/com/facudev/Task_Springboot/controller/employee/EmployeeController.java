package com.facudev.Task_Springboot.controller.employee;

import com.facudev.Task_Springboot.dto.TaskDto;
import com.facudev.Task_Springboot.services.employee.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;


    @GetMapping("/tasks")
    public ResponseEntity<List<TaskDto>> getTaskByUserId(){
        return ResponseEntity.ok(employeeService.getTaskByUserId());
    }

}
