package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    // Attributes
    private String name;
    private Map<String, Integer> taskList = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getTaskList() {
        return taskList;
    }

    public void setTaskList(Map<String, Integer> taskList) {
        this.taskList = taskList;
    }
    public void addToTaskList(String task, Integer rating){
        taskList.put(task, rating);
    }
}
