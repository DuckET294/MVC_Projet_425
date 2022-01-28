package com.company.Class;

import com.company.Interface.Iterator;

import java.util.*;


public class Ouvrier {


    /**
     * Représente un objet Ouvrier.
     */
    private Ouvrier ouvrier;

    /**
     * Représente la liste d'ouvrier.
     */
    private final ArrayList<Ouvrier> listeOuvrier = new ArrayList<>();

    /**
     * Représente le prénom de l'ouvrier.
     */
    private String prenom;

    /**
     * Représente le nom de l'ouvrier.
     */
    private String nom;
    /**
     * Représente l'emploi de l'ouvrier.
     */
    private String titreEmploie;
    /**
     * Représente le salaire de l'ouvrier.
     */
    private float salaireAnnuel;


    /**
     * Créer un objet Ouvrier vide à l'aide du constructeur.
     */

    public Ouvrier() {
    }

    /**
     * Créer un objet Ouvrier à l'aide du constructeur.
     *
     * @param prenom        Le prénom de l'ouvrier.
     * @param nom           Le nom de l'ouvrier.
     * @param salaireAnnuel Le salaire Annuel de l'ouvrier.
     * @param titreEmploie  Le nom de l'emploi.
     */

    public Ouvrier(String prenom, String nom, String titreEmploie, float salaireAnnuel) {
        this.prenom = prenom;
        this.nom = nom;
        this.titreEmploie = titreEmploie;
        this.salaireAnnuel = salaireAnnuel;

    }

    /**
     * Ici est un setter qui modifie la
     * la valeur du ouvrier
     *
     * @param ouvrier - l'ouvrier qui sera donné
     */

    public void setOuvrier(Ouvrier ouvrier) {
        this.ouvrier = ouvrier;

    }

    /**
     * Ici est un setter qui modifie la
     * la valeur du nom
     *
     * @param nom - le nom qui sera donné
     */
    public void setNom(String nom) {
        this.nom = nom;
    }


    /**
     * Ici est un setter qui modifie la
     * la valeur du prénom
     *
     * @param prenom - le prénom qui sera donné
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    /**
     * Ici est un setter qui modifie la
     * la valeur du titre d'emploi
     *
     * @param titreEmploie - le titre d'emploi qui sera donné
     */
    public void setTitreEmploie(String titreEmploie) {
        this.titreEmploie = titreEmploie;
    }

    /**
     * Ici est un setter qui modifie la
     * la valeur du salaire annuel
     *
     * @param salaireAnnuel - le salaire annuel qui sera donné
     */
    public void setSalaireAnnuel(float salaireAnnuel) {
        this.salaireAnnuel = salaireAnnuel;
    }


    /**
     * Récupère un ouvrier.
     *
     * @return Retourne un ouvrier
     */

    public Ouvrier getOuvrier() {
        return ouvrier;
    }

    /**
     * Récupère le prénom de l'ouvrier.
     *
     * @return Retourne un String qui représente le
     * prénom de l'ouvrier.
     */

    public String getPrenom() {
        return prenom;
    }

    /**
     * Récupère le nom de l'ouvrier.
     *
     * @return Retourne un String qui représente le
     * nom de l'ouvrier.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Récupère le titre d'emploi de l'ouvrier.
     *
     * @return Retourne un String qui représente le
     * titre d'emploi de l'ouvrier.
     */
    public String getTitreEmploie() {
        return titreEmploie;
    }

    /**
     * Récupère le salaire annuel de l'ouvrier.
     *
     * @return Retourne un String qui représente le
     * salaire annuel de l'ouvrier.
     */
    public double getSalaireAnnuel() {
        return salaireAnnuel;
    }

    /**
     * Récupère la liste d'ouvrier.
     *
     * @return Retourne une ArrayList qui représente les
     * ouvriers.
     */
    public ArrayList<Ouvrier> getListeOuvrier() {
        return listeOuvrier;
    }

    /**
     * Récupère l'itérateur.
     *
     * @return Retourne un itérateur pour la liste d'ouvrier.
     */
    public Iterator getIterator() {
        return new OuvrierIterateur(listeOuvrier);
    }

    /**
     * Méthode qui fait appel la conversion de l'objet en String.
     */


    @Override
    public String toString() {


        return "\n" + " Prénom :" + " " + prenom + " " + "\n" + " Nom :" + nom + " " + "\n" + " Emploie :" + titreEmploie + " " + "\n" + " Salaire :" + salaireAnnuel + "$/an";
    }


}
