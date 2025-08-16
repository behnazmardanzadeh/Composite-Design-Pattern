package com.algocoding.hierarchy;

import java.util.ArrayList;
import java.util.List;

public interface MilitaryRank extends Army {
    void add(Army army);
    void remove(Army army);
    List<Army> getArmy();
}
