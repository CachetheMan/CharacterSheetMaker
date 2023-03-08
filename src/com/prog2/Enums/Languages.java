package com.prog2.Enums;

public enum Languages {

    COMMON, DWARVISH, ELVISH, GIANT, GNOMISH, GOBLIN, HAFLING, ORC, ABYSSAL,
    CELESTIAL, DRACONIC, DEEP_SPEECH("Deep Speech"), INFERNAL, PRIMORDIAL, SYLVAN, UNDERCOMMON;


    private String displayName;

    Languages(){


        String s = name().toLowerCase();
        this.displayName = s.substring(0,1).toUpperCase() + s.substring(1);

    }
    Languages(String displayName){
        this.displayName = displayName;
    }


    @Override
    public String toString(){
        return displayName;
    }
}
