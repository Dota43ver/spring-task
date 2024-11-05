package com.facudev.Task_Springboot.services.employee;

import com.facudev.Task_Springboot.dto.TaskDto;
import com.facudev.Task_Springboot.entities.Task;
import com.facudev.Task_Springboot.entities.User;
import com.facudev.Task_Springboot.repositories.TaskRepository;
import com.facudev.Task_Springboot.utils.JwtUtil;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final TaskRepository taskRepository;
    private final JwtUtil jwtUtil;

    @Override
    public List<TaskDto> getTaskByUserId() {
        User user = jwtUtil.getLoggedInUser();
        System.out.println("User retrieved in EmployeeServiceImpl: " + user);

        if (user != null) {
            List<TaskDto> tasks = taskRepository.findAllByUserId(user.getId())
                    .stream()
                    .sorted(Comparator.comparing(Task::getDueDate).reversed())
                    .map(Task::getTaskDTO)
                    .collect(Collectors.toList());

            System.out.println("Tasks retrieved for user " + user.getEmail() + ": " + tasks);

            return tasks;
        }

        System.out.println("User not found or is null in getTaskByUserId");
        throw new EntityNotFoundException("User not found");
    }
}
