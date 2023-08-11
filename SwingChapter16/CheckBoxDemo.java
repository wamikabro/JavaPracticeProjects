package javaBeginnersGuideProjects.SwingChapter16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxDemo implements ItemListener {
    JLabel jLabelSelected;
    JLabel jLabelChanged;
    JCheckBox jCheckBoxAlpha;
    JCheckBox jCheckBoxBeta;
    JCheckBox jCheckBoxGamma;

    CheckBoxDemo(){
        // Create a new JFrame container.
        JFrame jFrame = new JFrame("Check Boxes");

        jFrame.setLayout(new FlowLayout());

        jFrame.setSize(280, 120);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // creating empty labels
        jLabelChanged = new JLabel("");
        jLabelSelected = new JLabel("");

        // making checkboxes
        jCheckBoxAlpha = new JCheckBox("Alpha");
        jCheckBoxBeta = new JCheckBox("Beta");
        jCheckBoxGamma = new JCheckBox("Gamma");

        // adding item listeners
        jCheckBoxAlpha.addItemListener(this);
        jCheckBoxBeta.addItemListener(this);
        jCheckBoxGamma.addItemListener(this);

        // adding all to the frame
        jFrame.add(jCheckBoxAlpha);
        jFrame.add(jCheckBoxBeta);
        jFrame.add(jCheckBoxGamma);
        jFrame.add(jLabelChanged);
        jFrame.add(jLabelSelected);

        jFrame.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        String str = "";

        JCheckBox cb = (JCheckBox) e.getItem();

        if(cb.isSelected())
            jLabelChanged.setText(cb.getText() +
                    " was just selected. ");
        else
            jLabelChanged.setText(cb.getText() +
                    " was just cleared.");

        // Report all selected boxes
        if(jCheckBoxAlpha.isSelected())
            str += "Alpha";
        if(jCheckBoxBeta.isSelected())
            str += "Beta";
        if(jCheckBoxGamma.isSelected())
            str += "Gamma";

        jLabelSelected.setText("Selected check boxes: " + str);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CheckBoxDemo();
            }
        });
    }
}
