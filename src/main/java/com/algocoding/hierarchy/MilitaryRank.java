package com.algocoding.hierarchy;

import java.util.ArrayList;

public interface MilitaryRank extends Army {
    void add(Army army);
    void remove(Army army);
    ArrayList<Army> getArmy();
}
