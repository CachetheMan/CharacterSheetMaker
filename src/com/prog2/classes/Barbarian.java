package com.prog2.classes;

import com.prog2.listeners.LimitedCheckBoxListener;
import com.prog2.pannels.ClassPanel;

import javax.swing.*;
import java.awt.*;

public class Barbarian extends ClassPanel {


    private String[] skillOptions = {
            "Animal Handling",
            "Athletics",
            "Survival"
    };
    private JCheckBox[] skillCheckBoxes;


    public JPanel getSpecialUI(){
        JPanel specialUI = new JPanel(new GridLayout(0,2));

        JLabel skillChoiceLabel = new JLabel("Choose two of the following skills:");

        JPanel skillChoicePanel = new JPanel();
        skillChoicePanel.setLayout(new BoxLayout(skillChoicePanel, BoxLayout.PAGE_AXIS));


        skillCheckBoxes = new JCheckBox[skillOptions.length];

        LimitedCheckBoxListener listener = new LimitedCheckBoxListener(2, skillCheckBoxes);
        for (int i = 0; i < skillCheckBoxes.length; i++) {
            skillCheckBoxes[i] = new JCheckBox(skillOptions[i]);
            skillCheckBoxes[i].addItemListener(listener);
            skillChoicePanel.add(skillCheckBoxes[i]);
        }
        specialUI.add(skillChoiceLabel);
        specialUI.add(skillChoicePanel);
        return specialUI;
    }

}
