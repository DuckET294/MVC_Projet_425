package com.company;


public class OuvrierController {

    /** Controlleur Ouvrier.
     * @param ouvrier Représente l'objet Ouvrier.
     * @param ouvrierView Représente l'objet OuvrierView.
     */

    private final Ouvrier ouvrier;
    private final OuvrierView ouvrierVu;

    /** Créer un objet de type OuvrierControlleur.
     * @param ouvrier Représente l'objet Ouvrier.
     * @param ouvrierVu Représente l'objet OuvrierView.
     */

    public OuvrierController(Ouvrier ouvrier, OuvrierView ouvrierVu) {
        this.ouvrier = ouvrier;
        this.ouvrierVu = ouvrierVu;
    }

    /**
     * Cette méthode sert à mettre à jour l'affichage de la vue.
     */

    public void miseAJour() {

        ouvrierVu.afficherOuvrier(ouvrier.getListeOuvrier());

    }

    /**
     * Cette méthode sert à afficher tous les ouvriers
     * qui se trouve dans la liste de type ArrayList.
     * @param ouvrier Représente un objet Ouvrier afin d'effacer l'ouvrier.
     */

    public void ajoutOuvrier(Ouvrier ouvrier) {

        this.ouvrier.getListeOuvrier().add(ouvrier);

    }

    /**
     * Cette méthode sert à effacer l'ouvrier spécifique au
     * au numéro d'identification entrer.
     * @param id Représente lde numéro d'ouvrier afin de l'effacer dans la liste.
     */

    public void effacerOuvrier(int id) {

        this.ouvrier.getListeOuvrier().remove(id - 1);

    }
}