package com.company.Class;

import java.util.*;

/**
 * Représente un ouvrier.
 *
 * @author Etienne Houle
 * @version 2.0
 * @since 1.0
 */

public class Main {


    public static void main(String[] args) {

        /** Menu de 4 choix.
         * @param clavier Cecil représente la variable qui va storer l'entrer au clavier.
         * @param entrer Représente l'entrer au clavier de l'utilisateur avec l'objet Scanner.
         * @param ouvrier Représente l'objet Ouvrier.
         * @param ouvrierView Représente l'objet OuvrierView.
         * @param ouvrierControlleur Représente l'objet OuvrierControlleur.
         **/

        Scanner entrer = new Scanner(System.in);
        Ouvrier ouvrier = new Ouvrier();
        OuvrierView ouvrierView = new OuvrierView();
        OuvrierController ouvrierController = new OuvrierController(ouvrier, ouvrierView);
        JavaSwing javaSwing = new JavaSwing();

        int clavier = 0;


        while (clavier != 9) {
            System.out.println("******************Menu Principal**************");
            System.out.println("Faites un choix parmis les options suivantes: ");
            System.out.println();
            System.out.println("#1 Ajouter un Ouvrier / Create");
            System.out.println("#2 Afficher les Ouvriers / Read");
            System.out.println("#3 Mettre à jour les informations d'un Ouvrier / Update");
            System.out.println("#4 Enlever un Ouvrier / Delete");
            System.out.println("#5 Fermer écran GUI");
            System.out.println("#6 Quitter l'application");
            clavier = entrer.nextInt();

            switch (clavier) {

                case 1:
                    javaSwing.fermerJframe(); //Appel de la méthode Java Swing qui ferme l'écran GUI
                    ouvrierController.ajoutOuvrier(creerModifierOuvrier(entrer)); // Appel la Méthode de création d'ouvrier
                    ouvrierController.miseAJour(); //Appel de la méthode mise à jour de la liste
                    javaSwing.initializeJlistView(ouvrier.getListeOuvrier()); //Appel la méthode d'initialisation de la vue Javaswing

                    break;

                case 2:
                    javaSwing.fermerJframe(); //Appel de la méthode Java Swing qui ferme l'écran GUI
                    ouvrierController.miseAJour(); //Appel de la méthode mise à jour de la liste
                    javaSwing.initializeJlistView(ouvrier.getListeOuvrier()); //Appel la méthode d'initialisation de la vue Javaswing
                    break;


                case 3:

                    javaSwing.fermerJframe(); //Appel de la méthode Java Swing qui ferme l'écran GUI
                    ouvrierController.miseAJour();//Appel de la méthode mise à jour de la liste
                    javaSwing.initializeJlistView(ouvrier.getListeOuvrier()); //Appel la méthode d'initialisation de la vue Javaswing
                    ouvrierController.mettreAJourOuvrier(trouverOuvrier(entrer), creerModifierOuvrier(entrer)); // Appel la méthode mettre à jour ouvrier
                    javaSwing.fermerJframe(); //Appel de la méthode Java Swing qui ferme l'écran GUI
                    ouvrierController.miseAJour(); //Appel de la méthode mise à jour de la liste
                    javaSwing.initializeJlistView(ouvrier.getListeOuvrier()); //Appel la méthode d'initialisation de la vue Javaswing


                    break;

                case 4:
                    javaSwing.fermerJframe(); //Appel de la méthode Java Swing qui ferme l'écran GUI
                    ouvrierController.miseAJour(); //Appel de la méthode mise à jour de la liste
                    javaSwing.initializeJlistView(ouvrier.getListeOuvrier()); //Appel la méthode d'initialisation de la vue Javaswing
                    ouvrierController.effacerOuvrier(trouverOuvrier(entrer)); // Appel la Méthode d'effacement d'un ouvrier
                    javaSwing.fermerJframe(); //Appel de la méthode Java Swing qui ferme l'écran GUI
                    ouvrierController.miseAJour(); //Appel de la méthode mise à jour de la liste
                    javaSwing.initializeJlistView(ouvrier.getListeOuvrier()); //Appel la méthode d'initialisation de la vue Javaswing

                    break;


                case 5:

                    javaSwing.fermerJframe(); //Appel de la méthode Java Swing qui ferme l'écran GUI

                    break;


                case 6:

                    System.out.println("À la prochaine");

                    System.exit(0); //Ici l'application se ferme

                    break;

                default:

                    break;


            }

        }

    }

    /**
     * Méthode d'entrer d'information pour la création ou modification d'un ouvrier.
     *
     * @param entrer Représente l'entrer de l'utilisateur en utilisant l'objet Scanner.
     * @return Retourne la création d'un objet ouvrier.
     */


    public static Ouvrier creerModifierOuvrier(Scanner entrer) {


        System.out.println("Entrer un prénom");
        String prenom = entrer.next();
        System.out.println("Entrer un nom");
        String nom = entrer.next();
        System.out.println("Entrer un métier");
        String titreEmploi = entrer.next();
        System.out.println("Entrer le salaire");
        float salaire = entrer.nextFloat();

        return new Ouvrier(prenom, nom, titreEmploi, salaire);


    }

    /**
     * Méthode d'entrer d'information pour création d'un ouvrier.
     *
     * @param entrer Représente l'entrer au clavier du numéro d'identification client.
     * @return Retourne le numOuvrier entrer par l'utilisateur
     */

    public static int trouverOuvrier(Scanner entrer) {

        System.out.println("Entrer le numéro d'identification");

        return entrer.nextInt() - 1;

    }

}