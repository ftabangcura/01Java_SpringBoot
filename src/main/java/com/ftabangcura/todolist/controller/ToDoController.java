package com.ftabangcura.todolist.controller;

import com.ftabangcura.todolist.model.ToDoListItem;
import com.ftabangcura.todolist.repo.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value = "/todolist")
public class ToDoController {

    @Autowired
    private ToDoRepository todoRepository;

    // Create
    @PostMapping
    public ToDoListItem save(@Valid @NotNull @RequestBody ToDoListItem toDoListItem){
        return todoRepository.save(toDoListItem);
    }

    // Read
    @GetMapping
    public List<ToDoListItem> findAll(){
        return todoRepository.findAll();
    }

    // Update
    @PutMapping
    public ToDoListItem update(@Valid @NotNull @RequestBody ToDoListItem toDoListItem){
        return todoRepository.save(toDoListItem);
    }

    // Delete
    @DeleteMapping(value = "/{id}")             // Delete provided id value from list
    public void delete(@PathVariable Integer id){
        todoRepository.deleteById(id);
    }
}
