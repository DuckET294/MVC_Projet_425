package com.company;

import java.util.*;


public class Main {


    public static void main(String[] args) {
        Scanner entrer = new Scanner(System.in);
        Ouvrier ouvrier = new Ouvrier();
        JavaSwing javaSwing = new JavaSwing();
        OuvrierView ouvrierView = new OuvrierView();
        OuvrierController ouvrierController = new OuvrierController(ouvrier, ouvrierView);
        int clavier = 0;
        int id;


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
                    javaSwing.initializeJlistView(ouvrier.getListeOuvrier());
                    break;

                case 2:

                    System.out.println(listeSize());

                    break;


                case 3:
                    javaSwing.closeJFrame();
                    ouvrierController.ajoutOuvrier(creerOuvrier(entrer));
                    ouvrierController.updateView();
                    javaSwing.initializeJlistView(ouvrier.getListeOuvrier());
                    break;

                case 4:

                    javaSwing.closeJFrame();
                    ouvrierController.effacerOuvrier(retirerOuvrier(entrer));
                    ouvrierController.updateView();
                    javaSwing.initializeJlistView(ouvrier.getListeOuvrier());

                    break;

                default:
                    break;

            }

        }

    }

    private static int listeSize() {

        Ouvrier ouvrier = new Ouvrier();

      int size =  ouvrier.getListeOuvrier().size();

        return size;
    }


    private static Ouvrier creerOuvrier(Scanner entrer) {


        System.out.println("Entrer un prénom");
        String prenom = entrer.next();
        System.out.println("Entrer un nom");
        String nom = entrer.next();
        System.out.println("Entrer un métier");
        String titreEmploi = entrer.next();
        System.out.println("Entrer le salaire");
        float salaire = entrer.nextFloat();

       Ouvrier ouvrier = new Ouvrier( prenom, nom, titreEmploi, salaire);

        return ouvrier;


    }

    private static int retirerOuvrier(Scanner entrer) {

        System.out.println("Entrer le numéro d'identification");

        int numOuvrier = entrer.nextInt();

        return numOuvrier;


    }


}
