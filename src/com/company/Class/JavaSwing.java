package com.company.Class;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class JavaSwing {

    /**
     * Classe JavaSwing.
     */

    JFrame frame = new JFrame();

    /**
     * Créer un objet Java Swing à l'aide du constructeur vide.
     */

    public JavaSwing() {

    }

    /**
     * Cette méthode sert à afficher dans Java Swing tous les
     * ouvriers qui se trouve dans la liste de type ArrayList .
     *
     * @param listeOuvrier Représente une ArrayList d'objet Ouvrier.
     */

    void initializeJlistView(ArrayList<Ouvrier> listeOuvrier) {

        UIDefaults uiDefaults = UIManager.getDefaults();
        uiDefaults.put("activeCaption", new javax.swing.plaf.ColorUIResource(Color.gray));
        uiDefaults.put("activeCaptionText", new javax.swing.plaf.ColorUIResource(Color.white));
        JFrame.setDefaultLookAndFeelDecorated(true);


        JLabel label1;
        JLabel label2;
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JList<Ouvrier> displayList = new JList(listeOuvrier.toArray());

        label1 = new JLabel("Liste des employers");
        label2 = new JLabel(new ImageIcon("/Java/MVC_Projet_425/Image/kindpng_819689.png"));
        label1.setFont(new Font("Arial", Font.BOLD, 20));
        label1.setAlignmentX(Box.CENTER_ALIGNMENT);

        displayList.setFont(new Font("Arial", Font.BOLD, 16));
        displayList.setBorder(BorderFactory.createEmptyBorder(10, 300, 10, 300));
        displayList.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));


        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
        panel1.add(label2);
        panel1.add(label1);
        panel1.add(Box.createRigidArea(new Dimension(0, 1)));
        panel2.add(displayList);
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        panel3.add(panel1);
        panel3.add(panel2);


        frame = new JFrame("Liste des emmployers");
        frame.setLayout(new GridLayout(3, 1));
        frame.setPreferredSize(new Dimension(1200, 800));
        frame.add(panel3);
        frame.pack();
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    /**
     * Cette méthode sert à fermer la fenêtre Java Swing
     */

    void fermerJframe() {

        frame.dispose();
    }

}
