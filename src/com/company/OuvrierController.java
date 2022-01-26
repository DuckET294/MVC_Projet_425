package com.company;


public class OuvrierController {

    private final Ouvrier ouvrier;
    private final OuvrierView ouvrierVu;


    public OuvrierController(Ouvrier ouvrier, OuvrierView ouvrierVu) {
        this.ouvrier = ouvrier;
        this.ouvrierVu = ouvrierVu;
    }

    // méthode pour afficher les ouvriers
    public void updateView() {

        ouvrierVu.afficherOuvrier(ouvrier.getListeOuvrier());

    }

    // méthode pour ajouter des ouvriers
    public void ajoutOuvrier(Ouvrier ouvrier) {

        this.ouvrier.getListeOuvrier().add(ouvrier);

    }

    //méthode pour effacer un ouvrier par numéro d'identification
    public void effacerOuvrier(int id) {

        this.ouvrier.getListeOuvrier().remove(id - 1);


    }
}