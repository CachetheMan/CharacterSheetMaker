package com.prog2.Enums;

import java.util.Locale;

public enum Skill {

    ACROBATICS, ANIMAL_HANDLING("Animal Handling"), ARCANA, ATHLETICS, DECEPTION, HISTORY, INSIGHT, INTIMIDATION,
    INVESTIGATION, MEDICINE, NATURE, PERCEPTION, PERFORMANCE, PERSUASION, RELIGION, SLIGHT_OF_HAND("Slight of Hand"), SURVIVAL;

    private String displayName;

    Skill(){
        String s = name().toLowerCase();
        this.displayName = s.substring(0,1).toUpperCase() + s.substring(1);

    }

    Skill(String displayName){
        this.displayName = displayName;
    }


    @Override
    public String toString(){
        return displayName;
    }


}
