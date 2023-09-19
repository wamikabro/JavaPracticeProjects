package javaBeginnersGuideProjects.SwingChapter16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo implements ActionListener {
    JLabel jLabel;

    ButtonDemo(){
        JFrame frame = new JFrame("A Button Example");
        frame.setLayout(new FlowLayout());

        frame.setSize(220, 90);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make two buttons
        JButton button1 = new JButton("Up");
        JButton button2 = new JButton("Down");

        // Adding action listeners to the buttons
        button1.addActionListener(this);
        button2.addActionListener(this);

        // add the buttons to the content pane
        frame.add(button1);
        frame.add(button2);

        // create the label
        jLabel = new JLabel("Press a button");

        // label
        frame.add(jLabel);

        // display the frame
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Up"))
            jLabel.setText("You Pressed Up");
        else
            jLabel.setText("You Pressed Down");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo();
            }
        });
    }
}
