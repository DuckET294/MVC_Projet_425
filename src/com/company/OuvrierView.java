package com.company;



import java.util.ArrayList;

public class OuvrierView{


    public void afficherOuvrier(ArrayList<Ouvrier> listeOuvrier) {


        for(int i = 0; i < listeOuvrier.size(); i++) {

            System.out.println("************** Ouvrier: ****************");
            System.out.println("Numéro d'ouvrier : " + listeOuvrier.size());
            System.out.println("Prénom : " + listeOuvrier.get(i).getPrenom());
            System.out.println("Nom : " + listeOuvrier.get(i).getNom());
            System.out.println("Titre d'emploi : " + listeOuvrier.get(i).getTitreEmploie());
            System.out.println("Salaire Annuel : " + listeOuvrier.get(i).getSalaireAnnuel());

        }

    }

}