package com.paul.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paul.todo.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
