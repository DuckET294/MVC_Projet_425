package com.company.Class;


public class OuvrierController {


    /**
     * Représente un objet Ouvrier.
     */
    private final Ouvrier ouvrier;

    /**
     * Représente un objet OuvrierVu.
     */
    private final OuvrierView ouvrierVu;

    /**
     * Créer un objet de type OuvrierControlleur.
     *
     * @param ouvrier   Représente l'objet Ouvrier.
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

        this.ouvrierVu.afficherOuvrier(ouvrier.getIterator());
    }

    /**
     * Cette méthode sert à afficher tous les ouvriers
     * qui se trouve dans la liste de type ArrayList.
     *
     * @param ouvrier Représente un objet Ouvrier afin d'effacer l'ouvrier.
     */

    public void ajoutOuvrier(Ouvrier ouvrier) {

        this.ouvrier.getListeOuvrier().add(ouvrier);

    }

    /**
     * Cette méthode sert à effacer l'ouvrier spécifique au
     * au numéro d'identification entrer.
     *
     * @param id Représente lde numéro d'ouvrier afin de l'effacer dans la liste.
     */

    public void effacerOuvrier(int id) {

        this.ouvrier.getListeOuvrier().remove(id);

    }


    public void mettreAJourOuvrier(int id, Ouvrier ouvrier) {


        this.ouvrier.getListeOuvrier().get(id).setPrenom(ouvrier.getPrenom());
        this.ouvrier.getListeOuvrier().get(id).setNom(ouvrier.getNom());
        this.ouvrier.getListeOuvrier().get(id).setTitreEmploie(ouvrier.getTitreEmploie());
        this.ouvrier.getListeOuvrier().get(id).setSalaireAnnuel((float) ouvrier.getSalaireAnnuel());

    }


}