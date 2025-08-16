package com.algocoding.hierarchy.rank;

import com.algocoding.hierarchy.Army;
import com.algocoding.hierarchy.MilitaryRank;

import java.util.ArrayList;
import java.util.List;

public class Sergeant implements MilitaryRank {
    private List<Army> army;
    private String description;

    public Sergeant() {
    }

    public Sergeant(List<Army> army, String description) {
        this.army = army;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setArmy(List<Army> army) {
        this.army = army;
    }

    public void setDescription(String description) {
        this.description = description;
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
        System.out.println(description);
        army.forEach(Army::execute);
    }
}
