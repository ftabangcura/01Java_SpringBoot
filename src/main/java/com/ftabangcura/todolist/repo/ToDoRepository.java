package com.ftabangcura.todolist.repo;

import com.ftabangcura.todolist.model.ToDoListItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDoListItem, Integer> {

}