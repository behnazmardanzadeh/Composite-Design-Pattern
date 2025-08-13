package com.algocoding.hierarchy.rank;

import com.algocoding.hierarchy.Army;
import com.algocoding.hierarchy.MilitaryRank;

import java.util.ArrayList;

public class General implements MilitaryRank {
    private ArrayList<Army> army;
    private String description;

    public General() {
    }

    public General(ArrayList<Army> army, String description) {
        this.army = army;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setArmy(ArrayList<Army> army) {
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
    public ArrayList<Army> getArmy() {
        return this.army;
    }

    @Override
    public void execute() {
        army.forEach(Army::execute);
    }
}
