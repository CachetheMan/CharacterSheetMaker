package com.prog2.races;

import com.prog2.Enums.CreatureSize;

import java.util.ArrayList;

public class HillDwarf extends Dwarf {

    public ArrayList<String> toolChoices;

   public HillDwarf(){
       super("Hill Dwarf");

       this.raceName = "Hill Dwarf";
       this.size = CreatureSize.MEDIUM;
       this.speed = 25;
       this.hp = 1;
       this.constitution = 2;
       this.wisdom = 3;

       this.languages.add("Dwarvish");
       this.languages.add("Common");
       this.traits.add("Darkvision");
       this.traits.add("Poison Resistance");

   }
}
