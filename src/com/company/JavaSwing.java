package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class JavaSwing {

    /** Classe JavaSwing.
     * @param frame Représente JFrame de Javaswing.
     * @param jtable Représente Jtable de Javaswing.
     */


    JFrame frame = new JFrame();
    JScrollPane jTable;


    /** Créer un objet Java Swing à l'aide du constructeur vide.
     */

    public JavaSwing() {

    }

    /**
     * Cette méthode sert à afficher dans Java Swing tous les
     * ouvriers qui se trouve dans la liste de type ArrayList .
     * @param listeOuvrier Représente une ArrayList d'objet Ouvrier.
     */

    void initializeJlistView(ArrayList<Ouvrier> listeOuvrier) {


        ArrayList<Ouvrier> liste = listeOuvrier;
        JList<Ouvrier> displayList = new JList(liste.toArray(new Ouvrier[100]));
        displayList.setBackground(Color.LIGHT_GRAY);
        displayList.setFont(new Font("Arial",Font.BOLD,16));
        displayList.setForeground(Color.BLACK);

        jTable = new JScrollPane(displayList);

        frame = new JFrame();
        frame.setPreferredSize(new Dimension(1000, 800));
        frame.add(new JScrollPane(jTable), BorderLayout.CENTER);
        frame.pack();
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    /**
     * Cette méthode sert à fermer la fenêtre Java Swing
     */

    void closeJFrame() {

        frame.dispose();
    }

}
