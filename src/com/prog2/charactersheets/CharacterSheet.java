package com.prog2.charactersheets;

import com.prog2.Enums.Alignment;
import com.prog2.pannels.BackGround;
import com.prog2.races.Race;

import java.util.ArrayList;

public class CharacterSheet {

    public int strength,  wisdom,  dexterity,  constitution, intelligence,  charisma, hitDice, hitPointMax, speed, initiative, armorClass, proficiencyBonus, exp, level, maxHp, currentHp, hitTypeDice, passivePerception;
    public String playerName, characterName;
    public Alignment alignment;
    public BackGround backGround;
    public Race characterRace;

    // * Features and Traits

    public ArrayList<String> traits;

    // * Proficiencies
    public ArrayList<String> languages;
    public ArrayList<String> proficiencies;

    // * Equipment
    public ArrayList<String> equipment;
    public ArrayList<String> weapons;
    public ArrayList<String> armor;
    public ArrayList<String> spells;

    // * Money
    public int copper;
    public int silver;
    public int electrum;
    public int gold;
    public int platinum;
}
