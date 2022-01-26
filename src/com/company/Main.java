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

        /** Menu de 4 choix.
         * @param clavier Cecil représente la variable qui va storer l'entrer au clavier.
         * @param entrer Représente l'entrer au clavier de l'utilisateur avec l'objet Scanner.
         * @param ouvrier Représente l'objet Ouvrier.
         * @param ouvrierView Représente l'objet OuvrierView.
         * @param ouvrierControlleur Représente l'objet OuvrierControlleur.
         */


        while (clavier != 9) {
            System.out.println("Faites un choix parmis les options suivantes: ");
            System.out.println("#1 Ajouter un Ouvrier / Create");
            System.out.println("#2 Afficher les Ouvriers / Read");
            System.out.println("#3 Mettre à jour les informations d'un Ouvrier / Update");
            System.out.println("#4 Enlever un Ouvrier / Delete");

            clavier = entrer.nextInt();

            switch (clavier) {

                case 1:

                    javaSwing.closeJFrame(); //Appel la Méthode de fermeture de JavaSwing
                    ouvrierController.ajoutOuvrier(creerOuvrier(entrer)); // Appel la Méthode de création d'ouvrier
                    ouvrierController.miseAJour(); //Appel la méthode de mise à jour
                    javaSwing.initializeJlistView(ouvrier.getListeOuvrier()); //Appel la méthode d'initialisation de la vue Javaswing

                    break;

                case 2:



                    break;


                case 3:

                    ouvrierController.miseAJour(); //Appel la méthode de mise à jour
                    javaSwing.initializeJlistView(ouvrier.getListeOuvrier()); //Appel la méthode d'initialisation de la vue Javaswing

                    break;

                case 4:

                    javaSwing.closeJFrame(); //Appel la Méthode de fermeture de JavaSwing
                    ouvrierController.effacerOuvrier(retirerOuvrier(entrer)); // Appel la Méthode d'effacement d'un ouvrier
                    ouvrierController.miseAJour(); //Appel la méthode de mise à jour
                    javaSwing.initializeJlistView(ouvrier.getListeOuvrier()); //Appel la méthode d'initialisation de la vue Javaswing

                    break;



                default:

                    break;

            }

        }

    }

    /** Méthode d'entrer d'information pour création d'un ouvrier.
     * @param entrer Représente l'entrer de l'utilisateur en utilisant l'objet Scanner.
     * @return
     * Retourne la création d'un objet ouvrier.
     */


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

    /** Méthode d'entrer d'information pour création d'un ouvrier.
     * @param entrer Représente l'entrer au clavier du numéro d'identification client.
     * @return
     * Retourne le numOuvrier entrer par l'utilisateur
     */
    private static int retirerOuvrier(Scanner entrer) {

        System.out.println("Entrer le numéro d'identification");

        int numOuvrier = entrer.nextInt();

        return numOuvrier;


    }


}
