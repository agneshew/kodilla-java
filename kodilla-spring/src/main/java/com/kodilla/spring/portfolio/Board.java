package com.kodilla.spring.portfolio;

public class Board {
    public TaskList toDoList;
    public TaskList inProgressList;
    public TaskList doneList;

    public Board(TaskList taskList) {
        toDoList = new TaskList();
        inProgressList = new TaskList();
        doneList = new TaskList();
    }
}