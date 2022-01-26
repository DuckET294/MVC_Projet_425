package com.company;


import java.util.ArrayList;

public class OuvrierView {

    /**
     * Cette méthode sert à afficher tous les ouvriers
     * qui se trouve dans la liste de type ArrayList.
     * @param listeOuvrier C'est le paramètre qui sert à faire un for loop.
     */

    public void afficherOuvrier(ArrayList<Ouvrier> listeOuvrier) {


        for (int i = 0; i < listeOuvrier.size(); i++) {

            System.out.println("************** Ouvrier: ****************");
            System.out.println("Numéro d'ouvrier : " + listeOuvrier.size());
            System.out.println("Prénom : " + listeOuvrier.get(i).getPrenom());
            System.out.println("Nom : " + listeOuvrier.get(i).getNom());
            System.out.println("Titre d'emploi : " + listeOuvrier.get(i).getTitreEmploie());
            System.out.println("Salaire Annuel : " + listeOuvrier.get(i).getSalaireAnnuel());

        }

    }

}