package com.paul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paul.todo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
