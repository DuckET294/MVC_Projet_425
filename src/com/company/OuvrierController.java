package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class OuvrierController {

    private Ouvrier ouvrier;
    private OuvrierView ouvrierVu;
    private final ArrayList<Ouvrier> liste = new ArrayList<>();

    public OuvrierController() {

    }

    public OuvrierController(Ouvrier ouvrier, OuvrierView ouvrierVu) {
        this.ouvrier = ouvrier;
        this.ouvrierVu = ouvrierVu;
    }


    public int getNumOuvrier() {
        return ouvrier.getNumOuvrier();
    }

    public void setNumOuvrier(int numOuvrier) {
        ouvrier.setNumOuvrier(numOuvrier);
    }

    public String getPrenom() {
        return ouvrier.getPrenom();
    }

    public void setPrenom(String prenom) {
        ouvrier.setPrenom(prenom);
    }

    public String getTitreEmploie() {
        return ouvrier.getTitreEmploie();
    }

    public void setTitreEmploie(String titreEmploie) {
        ouvrier.setTitreEmploie(titreEmploie);
    }

    public String getNom() {
        return ouvrier.getNom();
    }

    public void setNom(String nom) {
        ouvrier.setNom(nom);
    }

    public double getSalaireAnnuel() {
        return ouvrier.getSalaireAnnuel();
    }

    public void setSalaireAnnuel(double salaireAnnuel) {
        ouvrier.setSalaireAnnuel(salaireAnnuel);
    }

    // méthode pour afficher les ouvriers
    public void updateView() {

        ouvrierVu.afficherOuvrier(ouvrier.getListeOuvrier());


    }

    void updateJlistView(JFrame frame) {

        JList<Ouvrier> displayList = new JList(ouvrier.getListeOuvrier().toArray(new Ouvrier[0]));

        frame.setPreferredSize(new Dimension(800, 800));
        frame.add(displayList);
        SwingUtilities.updateComponentTreeUI(displayList);
        frame.pack();
        frame.setVisible(true);
        frame.setLayout(null);

    }

}
