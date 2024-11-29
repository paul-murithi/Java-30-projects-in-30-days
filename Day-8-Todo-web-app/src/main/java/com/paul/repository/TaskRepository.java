package com.paul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paul.todo.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
