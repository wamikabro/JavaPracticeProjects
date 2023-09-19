package javaBeginnersGuideProjects.SwingChapter16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldDemo implements ActionListener {

    JTextField jTextField;
    JButton jButton;
    JLabel jLabelPrompt, jLabelContents;

    TextFieldDemo(){
        JFrame frame = new JFrame("Use a Text Field");

        frame.setLayout(new FlowLayout());

        frame.setSize(240, 120);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jTextField = new JTextField(10);

        jTextField.setActionCommand("myTF");

        JButton jButtonReverse = new JButton("Reverse");

        // adding action listeners
        jTextField.addActionListener(this);
        jButtonReverse.addActionListener(this);

        // creating labels
        jLabelPrompt = new JLabel("Enter text: ");
        jLabelContents = new JLabel(" ");

        // adding components to the frame
        frame.add(jLabelPrompt);
        frame.add(jTextField);
        frame.add(jButtonReverse);
        frame.add(jLabelContents);

        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Reverse")){
            // The reverse button was pressed
            String orgStr = jTextField.getText();
            String reverseStr = "";

            // Reversing the string in the text field
            for(int i=orgStr.length()-1; i>=0; i--)
                reverseStr += orgStr.charAt(i);

            // set the text of JTextField
            jTextField.setText(reverseStr);
        } else{
           jLabelContents.setText("You pressed ENTER. Text is: " +
                   jTextField.getText());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextFieldDemo();
            }
        });
    }
}
