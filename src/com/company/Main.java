package com.company;

import javax.swing.*;
import java.util.*;


public class Main {


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Scanner entrer = new Scanner(System.in);
        Ouvrier ouvrier = new Ouvrier();
        OuvrierView ouvrierView = new OuvrierView();
        OuvrierController ouvrierController = new OuvrierController(ouvrier, ouvrierView);
        int clavier = 0;


        while (clavier != 9) {
            System.out.println("Faites un choix parmis les options suivantes: ");
            System.out.println("#1 Afficher les Ouvriers");
            System.out.println("#2 Ajouter un Ouvrier");
            System.out.println("#3 Enlever un Ouvrier");
            System.out.println("#4 Mettre à jour les informations d'un Ouvrier");

            clavier = entrer.nextInt();

            switch (clavier) {

                case 1:

                    ouvrierController.updateView();
                    ouvrierController.updateJlistView(frame);

                    break;
                case 2:



                    break;

                case 3:



                    ouvrier.setOuvriers(creerOuvrier(entrer));
                    ouvrierController.updateView();


                    break;


                default:
                    break;

            }

        }

    }

    private static Ouvrier creerOuvrier(Scanner entrer) {

        System.out.println("Entrer un numéro d'identification");
        int numEmploye = entrer.nextInt();
        System.out.println("Entrer un prénom");
        String prenom = entrer.next();
        System.out.println("Entrer un nom");
        String nom = entrer.next();
        System.out.println("Entrer un métier");
        String titreEmploi = entrer.next();
        System.out.println("Entrer le salaire");
        double salaire = entrer.nextDouble();

        return new Ouvrier(numEmploye,prenom,nom,titreEmploi,salaire);
    }


}
