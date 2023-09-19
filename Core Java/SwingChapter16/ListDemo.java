package javaBeginnersGuideProjects.SwingChapter16;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ListDemo implements ListSelectionListener {

    JList<String> jList;
    JLabel jLabel;
    JScrollPane jScrollPane;
    // array of names
    String names[] = {"Sherry", "Jon", "Wamique",
    "Tommy", "Toddler", "Randy", "Tate", "Mark", "Ken"};

    ListDemo(){
        JFrame frame = new JFrame("JList Demo");

        frame.setLayout(new FlowLayout());

        frame.setSize(200, 160);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jList = new JList<>(names);

        // Set the list selection mode to single selection
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Wrapping the jList with jScrollPane
        // so in the case of increase in list elements
        // scroller is there to scroll down
        jScrollPane = new JScrollPane(jList);

        jScrollPane.setPreferredSize(new Dimension(120, 90));

        jLabel = new JLabel("Please choose a name");

        // adding list selection listener to the list
        jList.addListSelectionListener(this);

        // adding stuff
        frame.add(jScrollPane);
        frame.add(jLabel);

        frame.setVisible(true);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int index = jList.getSelectedIndex();

        if(index != -1)
            jLabel.setText("Current Selection: " + names[index]);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListDemo();
            }
        });
    }
}
