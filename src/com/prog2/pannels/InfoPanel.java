package com.prog2.pannels;

import com.prog2.Enums.Skill;

import javax.swing.*;

public class InfoPanel extends JPanel {

    JLabel demo;

    public InfoPanel(){

        demo = new JLabel(Skill.ACROBATICS.toString());
    }

}
