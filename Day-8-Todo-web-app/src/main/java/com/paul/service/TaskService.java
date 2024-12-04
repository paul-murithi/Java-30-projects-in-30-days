package com.paul.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paul.repository.TaskRepository;
import com.paul.todo.entity.Task;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Optional<Task> getAllTasksFoCurrentrUser(Long userId) {
        return taskRepository.findById(userId);
    }

}