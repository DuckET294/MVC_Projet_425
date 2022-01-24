package com.company;


import javax.swing.*;
import java.util.ArrayList;

public class OuvrierView{


    public void afficherOuvrier(ArrayList<Ouvrier> listeOuvrier) {

        for(Ouvrier ouvrier : listeOuvrier) {

            System.out.println("************** Ouvrier: ****************");
            System.out.println("Numéro d'ouvrier : " + ouvrier.getNumOuvrier());
            System.out.println("Prénom : " + ouvrier.getPrenom());
            System.out.println("Nom : " + ouvrier.getNom());
            System.out.println("Titre d'emploi : " + ouvrier.getTitreEmploie());
            System.out.println("Salaire Annuel : " + ouvrier.getSalaireAnnuel());



        }

    }

}