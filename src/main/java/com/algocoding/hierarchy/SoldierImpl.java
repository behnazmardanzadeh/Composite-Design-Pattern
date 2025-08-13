package com.algocoding.hierarchy;

import java.util.Objects;

public class SoldierImpl implements Soldier{
    private int id;
    private String name;
    private String task;
    private MilitaryRank militaryRank;

    public SoldierImpl() {
    }

    public SoldierImpl(int id, String name, String task, MilitaryRank militaryRank) {
        this.id = id;
        this.name = name;
        this.task = task;
        this.militaryRank = militaryRank;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTask() {
        return task;
    }

    @Override
    public MilitaryRank getMilitaryRank() {
        return this.militaryRank;
    }

    @Override
    public void execute() {
        System.out.println(task);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoldierImpl soldier = (SoldierImpl) o;
        return id == soldier.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
