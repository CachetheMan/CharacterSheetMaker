package com.prog2.races;

import com.prog2.Enums.CreatureSize;

public class MountainDwarf extends Dwarf{



    public MountainDwarf(){
        super("Mountain Dwarf");

        this.raceName = "Mountain Dwarf";
        this.size = CreatureSize.MEDIUM;
        this.speed = 25;
        this.hp = 1;
        this.constitution = 2;
        this.wisdom = 3;
        this.strength = 2;


        this.languages.add("Dwarvish");
        this.languages.add("Common");
        this.traits.add("Darkvision");
        this.traits.add("Poison Resistance");
        this.traits.add("Dwarven Resilience");
        this.traits.add("Dwarven Combat Training");
        this.traits.add("Tool Proficiency");
        this.traits.add("Stonecunning");
        this.traits.add("Dwarven Armor Training");

    }
}
