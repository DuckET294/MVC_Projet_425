package com.company;


import javax.swing.*;
import java.util.*;

public class Ouvrier {


    private int numOuvrier;
    private String prenom;

    @Override
    public String toString() {
        return "Numéro identification =" + numOuvrier +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", titreEmploie='" + titreEmploie + '\'' +
                ", salaireAnnuel=" + salaireAnnuel;
    }

    private String nom;
    private String titreEmploie;
    private double salaireAnnuel;
    private Ouvrier ouvrier;
    private ArrayList <Ouvrier> listeOuvrier = new ArrayList<>();

    public Ouvrier(){


    }

    public Ouvrier(int numOuvrier, String prenom, String nom, String titreEmploie,  double salaireAnnuel){
        super();
        this.numOuvrier = numOuvrier;
        this.prenom = prenom;
        this.nom = nom;
        this.titreEmploie = titreEmploie;
        this.salaireAnnuel = salaireAnnuel;

    }

    public ArrayList<Ouvrier> getListeOuvrier() {
        return listeOuvrier;
    }

    public int getNumOuvrier() {
        return numOuvrier;
    }

    public void setNumOuvrier(int numOuvrier) {
        this.numOuvrier = numOuvrier;
    }

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

    public void setSalaireAnnuel(double salaireAnnuel) {
        this.salaireAnnuel = salaireAnnuel;
    }

    public void setOuvriers(Ouvrier ouvrier){

        this.listeOuvrier.add(ouvrier);

    }



}
