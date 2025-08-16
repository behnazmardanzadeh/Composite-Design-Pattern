package com.algocoding.hierarchy;

import com.algocoding.hierarchy.rank.Sergeant;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {


        Army soldierAli = new Soldier(1, "Ali", "Shoot the enemy!");
        Army soldierNaghi = new Soldier(2, "Naghi", "Peel the onions.");
        Army soldierHasan = new Soldier(3, "Hasan", "Mop the floor.");
        Army soldierHamid = new Soldier(4, "Hamid", "Guard the watchtower.");

        List<Army> armyList = new ArrayList<Army>();
        armyList.add(soldierAli);
        armyList.add(soldierNaghi);
        armyList.add(soldierHasan);
        armyList.add(soldierHamid);

        MilitaryRank sergeant = new Sergeant(armyList, "Command Soldiers!");
        sergeant.execute();

    }
}