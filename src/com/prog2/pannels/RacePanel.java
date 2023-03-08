package com.prog2.pannels;

import com.prog2.races.Dwarf;
import com.prog2.races.Elf;
import com.prog2.races.HillDwarf;
import com.prog2.races.Race;

import javax.swing.*;

public class RacePanel extends JPanel {

    private JPanel raceChoicePanel;
    private JComboBox<Race> raceCombo;
    public JComboBox<Race> subCombo;
    private JLabel raceChoiceLabel;
    private JLabel subChoiceLabel;



    public RacePanel(){
        raceChoicePanel = new JPanel();



       initRaceCombo();
       initSubRaceCombo();

        raceChoiceLabel = new JLabel("Choose Your Race");
        subChoiceLabel = new JLabel("Choose A Sub-Race");

        raceChoicePanel.add(raceChoiceLabel);
        raceChoicePanel.add(raceCombo);
        raceChoicePanel.add(subChoiceLabel);
        raceChoicePanel.add(subCombo);

        this.add(raceChoicePanel);
        onRaceSelected();
    }
    private void initRaceCombo(){
        raceCombo = new JComboBox<>();

        raceCombo.addItem(new Dwarf());
        raceCombo.addItem(new Elf());

        raceCombo.addActionListener(e -> onRaceSelected());
    }
    private void initSubRaceCombo(){
        subCombo = new JComboBox<>();


    }

    private void onRaceSelected(){

        if()
        // clear the sub combo

        subCombo.removeAllItems();

        // store the chosen race into a local variable
        Race chosen = (Race)raceCombo.getSelectedItem();
        // add all the subraces of the cosen race to the sub combo box
        for (Race sub: chosen.subRaces) {
            subCombo.addItem(sub);
        }

        add(chosen.getSpecialUI());

    }
}
