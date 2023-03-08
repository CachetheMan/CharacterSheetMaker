package com.prog2.races;

import javax.swing.*;

public class DarkElf extends Race{

    public DarkElf(){

        this.charisma += 1;
        this.proficiencies.add("Superior Darkvision");
        this.proficiencies.add("Sunlight Sensitivity");
        this.proficiencies.add("Drow Magic");
        this.proficiencies.add("Drow Magic Training");

    }

    @Override
    public JPanel getSpecialUI() {
        return null;
    }
}
