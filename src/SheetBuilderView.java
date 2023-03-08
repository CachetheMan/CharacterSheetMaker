import com.prog2.pannels.AbilityPanel;
import com.prog2.pannels.ClassPanel;
import com.prog2.pannels.InfoPanel;
import com.prog2.pannels.RacePanel;

import javax.swing.*;
import java.awt.*;

public class SheetBuilderView extends JFrame {

    private JTabbedPane tabs;
    private JPanel raceTab, classTab, infoTab, statsTab;

    public SheetBuilderView(){

        tabs = new JTabbedPane();

        raceTab = new RacePanel();
        classTab = new ClassPanel();
        infoTab = new InfoPanel();
        statsTab = new AbilityPanel();

        tabs.add("Choose a Race", raceTab);
        tabs.add("Choose a Class", classTab);
        tabs.add("Whats Your Name", infoTab);
        tabs.add("Roll Your Abilities", statsTab);

        this.add(tabs, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,800);
        setVisible(true);
    }

}
