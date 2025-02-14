package com.task.tracker.task.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.tracker.task.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
    
    List<Todo> findByUsername(String username);

}