package com.prog2.races;

import com.prog2.Enums.CreatureSize;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class Race implements Serializable {

    public String raceName;
    public CreatureSize size;
    public int speed;

    public int hp;

    public int strength;

    public int dexterity;

    public int constitution;

    public int intelligence;

    public int wisdom;

    public int charisma;

    public ArrayList<Race> subRaces;


    public ArrayList<String> traits;

    // * Proficiencies
    public ArrayList<String> languages;
    public ArrayList<String> proficiencies;

    // * Equipment
    public ArrayList<String> equipment;
    public ArrayList<String> weapons;
    public ArrayList<String> armor;
    public ArrayList<String> spells;

    public Race(){

        subRaces = new ArrayList<Race>();
        traits = new ArrayList<>();
        languages  = new ArrayList<>();
        proficiencies = new ArrayList<>();
        equipment = new ArrayList<>();
        weapons = new ArrayList<>();
        armor = new ArrayList<>();
        spells = new ArrayList<>();
    }

    public abstract JPanel getSpecialUI();

    @Override
    public String toString(){return raceName;}

}
