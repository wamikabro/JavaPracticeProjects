package javaBeginnersGuideProjects.SwingChapter16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SwingFileComparison implements ActionListener {

    JTextField jTextField1;
    JTextField jTextField2;
    JButton jButtonCompare;
    JLabel jLabel1, jLabel2;
    JLabel jLabelResult;

    SwingFileComparison(){
        JFrame frame = new JFrame("Compare Files");
        frame.setLayout(new FlowLayout());
        frame.setSize(200, 190);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLocationRelativeTo(null);
        jTextField1 = new JTextField(14);
        jTextField2 = new JTextField(14);

        jTextField1.setActionCommand("fileA");
        jTextField2.setActionCommand("fileB");

        jButtonCompare = new JButton("Compare");
        jButtonCompare.addActionListener(this);

        jLabel1 = new JLabel("First file: ");
        jLabel2 = new JLabel("Second file: ");
        jLabelResult = new JLabel("");

        // adding stuff
        frame.add(jLabel1);
        frame.add(jTextField1);

        frame.add(jLabel2);
        frame.add(jTextField2);

        frame.add(jButtonCompare);
        frame.add(jLabelResult);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int i = 0, j = 0;

        if(jTextField1.getText().equals("")){
            jLabelResult.setText("First file name missing.");
            return;
        }
        if(jTextField2.getText().equals("")){
            jLabelResult.setText("Second file name missing.");
            return;
        }

        // compare files
        try(FileInputStream f1 = new FileInputStream(jTextField1.getText());
            FileInputStream f2 = new FileInputStream(jTextField2.getText())){

            // checking contents of each file
            do{
                i = f1.read();
                j = f2.read();
                if(i != j) break;
            }while(i != -1 && j != -1);

            if(i != j)
                jLabelResult.setText("Files are not the same");
            else
                jLabelResult.setText("Files are same.");
        }catch(IOException exception){
            jLabelResult.setText("File Error");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingFileComparison();
            }
        });
    }
}
