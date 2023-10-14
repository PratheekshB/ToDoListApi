package com.example.ToDoList.Models;

import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Task {
    private long id;
    private  String task;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    private  boolean completed;

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", completed=" + completed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task1 = (Task) o;
        return id == task1.id && completed == task1.completed && Objects.equals(task, task1.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, task, completed);
    }
}
