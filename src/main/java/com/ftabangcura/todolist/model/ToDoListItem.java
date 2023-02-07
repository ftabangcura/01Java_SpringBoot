package com.ftabangcura.todolist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class ToDoListItem {
    private Integer id;
    @NotBlank               // Annotation: We want to make sure there is at least a value for the To Do list item
    private String title;
    private boolean done;

    public ToDoListItem() {
    }

    public ToDoListItem(Integer id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }

    @Id                 // Annotation: Id is autogenerated by creation of item
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
