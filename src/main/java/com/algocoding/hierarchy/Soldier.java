package com.algocoding.hierarchy;

public class Soldier implements Army{
    private int id;
    private String name;
    private String task;

    public Soldier() {
    }

    public Soldier(int id, String name, String task) {
        this.id = id;
        this.name = name;
        this.task = task;
    }

    @Override
    public void execute() {
        System.out.printf("Soldier %d, %s, %s\n", id, name, task);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
