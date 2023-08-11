package javaBeginnersGuideProjects.SwingChapter16;

import javax.swing.*;
import java.awt.*;

public class SwingDemo {
    SwingDemo(){
        // new JFrame Container
        JFrame frame = new JFrame("Swing Application");

        // Initial Frame Size
        frame.setSize(275, 100);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("GUI programming with Swing.");

        frame.add(label);
        frame.setLayout(new FlowLayout());

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
