package com.prog2.classes;

import com.prog2.Enums.Skill;

import javax.swing.*;
import java.util.HashMap;

public abstract class CharacterClass {

    public HashMap<Skill, Boolean> skills;

    public abstract JPanel getSpecialUI();

}
