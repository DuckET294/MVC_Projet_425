package com.company;


import java.util.*;

public class Ouvrier {



    private String prenom;
    private String nom;
    private String titreEmploie;
    private float salaireAnnuel;

    private final ArrayList<Ouvrier> listeOuvrier = new ArrayList<>();


    public Ouvrier(String prenom, String nom, String titreEmploie, float salaireAnnuel) {
        this.prenom = prenom;
        this.nom = nom;
        this.titreEmploie = titreEmploie;
        this.salaireAnnuel = salaireAnnuel;

    }

    public Ouvrier(){}


    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTitreEmploie() {
        return titreEmploie;
    }

    public void setTitreEmploie(String titreEmploie) {
        this.titreEmploie = titreEmploie;
    }

    public double getSalaireAnnuel() {
        return salaireAnnuel;
    }

    public void setSalaireAnnuel(float salaireAnnuel) {
        this.salaireAnnuel = salaireAnnuel;
    }

    public ArrayList<Ouvrier> getListeOuvrier() {
        return listeOuvrier;
    }



    @Override
    public String toString() {
        return
                " Prénom :" +  " "  + prenom + " " +
                " Nom :" + nom + " " +
                " Emploie :" + titreEmploie + " " +
                " Salaire :" + salaireAnnuel;
    }
}
