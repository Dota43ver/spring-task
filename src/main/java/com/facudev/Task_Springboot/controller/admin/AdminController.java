package com.facudev.Task_Springboot.controller.admin;

import com.facudev.Task_Springboot.dto.TaskDto;
import com.facudev.Task_Springboot.services.admin.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/admin")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class AdminController {

    private final AdminService adminService;

    @GetMapping("/users")
    public ResponseEntity<?> getUsers(){
        return ResponseEntity.ok(adminService.getUsers());
    }


    @PostMapping("/task")
    public ResponseEntity<TaskDto> createTask(@RequestBody TaskDto taskDto){
        TaskDto createdTaskDTO = adminService.createTask(taskDto);
        if(createdTaskDTO == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTaskDTO);
    }
}
