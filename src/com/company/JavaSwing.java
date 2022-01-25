package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class JavaSwing{


    JFrame frame = new JFrame();
    JScrollPane jTable;

    public JavaSwing() {

    }

     void initializeJlistView(ArrayList<Ouvrier> listeOuvrier) {

        frame = new JFrame();
        ArrayList<Ouvrier> liste = listeOuvrier;
        JList<Ouvrier> displayList = new JList(liste.toArray(new Ouvrier[100]));
        displayList.setBackground(Color.LIGHT_GRAY);
        displayList.setFont(new Font("Arial",Font.BOLD,16));
        displayList.setForeground(Color.BLUE);
        jTable = new JScrollPane(displayList);
        frame.setPreferredSize(new Dimension(1000, 800));
        frame.add(new JScrollPane(jTable), BorderLayout.CENTER);
        frame.pack();
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }


    void closeJFrame(){

        frame.dispose();

    }



}
