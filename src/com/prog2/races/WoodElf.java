package com.prog2.races;

public class WoodElf extends Elf{

    public WoodElf(){
        super("Wood Elf");

        this.wisdom += 1;

        this.proficiencies.add("Elf Weapon Training");
        this.proficiencies.add("Fleet of Foot");
        this.proficiencies.add("Mask of the Wild");


    }


}
