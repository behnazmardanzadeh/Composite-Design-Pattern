package com.algocoding.hierarchy.rank;

import com.algocoding.hierarchy.Army;
import com.algocoding.hierarchy.MilitaryRank;

import java.util.List;

public class Sergeant implements MilitaryRank {
    private List<Army> army;
    private String task;

    public Sergeant() {
    }

    public Sergeant(List<Army> army, String task) {
        this.army = army;
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setArmy(List<Army> army) {
        this.army = army;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public void add(Army army) {
        this.army.add(army);
    }

    @Override
    public void remove(Army army) {
        this.army.remove(army);
    }

    @Override
    public List<Army> getArmy() {
        return this.army;
    }

    @Override
    public void execute() {
        System.out.println(task);
        army.forEach(Army::execute);
    }
}
