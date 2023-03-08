package com.prog2.races;

import com.prog2.Enums.CreatureSize;
import com.prog2.Enums.Languages;

import javax.swing.*;
import java.awt.*;

public class Elf extends Race{

    public Elf(){
    this.subRaces.add(new WoodElf());
    this.subRaces.add(new DarkElf());

    this.raceName = "Elf";
    }


    protected Elf(String subRaceName){
        this.raceName = subRaceName;
        this.size = CreatureSize.MEDIUM;
        this.speed = 30;
        this.constitution = 2;

        this.languages.add("Elvish");
        this.languages.add("Common");

        this.traits.add("Darkvision");
        this.traits.add("Keen Senses");
        this.traits.add("Fey Ancestry");
        this.traits.add("Trance");



    }

    private String[] langs = {
            "Common", "Halfling"
    };
    
    @Override
    public JPanel getSpecialUI() {
        JPanel specialBoy = new JPanel(new GridLayout(0, 2));

        JLabel langLabel = new JLabel("Choose a Language to be Proficient In: ");

        JComboBox<String> langBox = new JComboBox<>();
        for (String s:langs) {
            langBox.addItem(s);
        }
        langBox.addActionListener(e -> {
            proficiencies.add(e.getActionCommand());
            System.out.println(e.getActionCommand());
        });

        specialBoy.add(langLabel);
        specialBoy.add(langBox);
        return specialBoy;
    }


}
