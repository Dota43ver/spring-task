package com.facudev.Task_Springboot.repositories;

import com.facudev.Task_Springboot.dto.TaskDto;
import com.facudev.Task_Springboot.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
    List<Task> findAllByTitleContaining(String title);

    List<Task> findAllByUserId(Long id);
}
