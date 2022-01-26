package com.company;

import java.util.*;

/** Représente un ouvrier.
 * @author Etienne Houle
 * @version 2.0
 * @since 1.0
 */

public class Ouvrier {

    /** Représente le prénom de l'ouvrier.
     */
    private String prenom;
    /** Représente le nom de l'ouvrier.
     */
    private String nom;
    /** Représente l'emploi de l'ouvrier.
     */
    private String titreEmploie;
    /** Représente le salaire de l'ouvrier.
     */
    private float salaireAnnuel;
    /** Représente la liste d'ouvrier.
     */
    private final ArrayList<Ouvrier> listeOuvrier = new ArrayList<>();

    /** Créer un objet Ouvrier à l'aide du constructeur.
     * @param prenom Le prénom de l'ouvrier.
     * @param nom Le nom de l'ouvrier.
     * @param salaireAnnuel Le salaire Annuel de l'ouvrier.
     * @param titreEmploie Le nom de l'emploi.
     */

    public Ouvrier(String prenom, String nom, String titreEmploie, float salaireAnnuel) {
        this.prenom = prenom;
        this.nom = nom;
        this.titreEmploie = titreEmploie;
        this.salaireAnnuel = salaireAnnuel;

    }

    /** Créer un objet Ouvrier vide à l'aide du constructeur.
     */

    public Ouvrier() {
    }

    /** Récupère le prénom de l'ouvrier.
     * @return Retourne un String qui représente le
     * prénom de l'ouvrier.
     */
    public String getPrenom() {
        return prenom;
    }

    /** Récupère le nom de l'ouvrier.
     * @return Retourne un String qui représente le
     * nom de l'ouvrier.
     */
    public String getNom() {
        return nom;
    }
    /** Récupère le titre d'emploi de l'ouvrier.
     * @return Retourne un String qui représente le
     * titre d'emploi de l'ouvrier.
     */
    public String getTitreEmploie() {
        return titreEmploie;
    }
    /** Récupère le salaire annuel de l'ouvrier.
     * @return Retourne un String qui représente le
     * salaire annuel de l'ouvrier.
     */
    public double getSalaireAnnuel() {
        return salaireAnnuel;
    }
    /** Récupère la liste d'ouvrier.
     * @return Retourne une ArrayList qui représente les
     * ouvriers.
     */
    public ArrayList<Ouvrier> getListeOuvrier() {
        return listeOuvrier;
    }


    /** Méthode faisant la conversion de l'objet en String.
     * @return
     * Retourne le contenu de la méthode to String.
     */

    @Override
    public String toString() {
        return
                " Prénom :" + " " + prenom + " " +
                        " Nom :" + nom + " " +
                        " Emploie :" + titreEmploie + " " +
                        " Salaire :" + salaireAnnuel;
    }
}
