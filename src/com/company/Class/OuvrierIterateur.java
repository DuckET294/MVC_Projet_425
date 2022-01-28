package com.company.Class;

import com.company.Interface.Iterator;

import java.util.ArrayList;

public class OuvrierIterateur implements Iterator {

    /**
     * Représente la liste d'ouvrier.
     */

    ArrayList<Ouvrier> liste;

    /**
     * Représente l'index qui sera comparé à la
     * taille de la liste d'ouvrier.
     */
    int index = 0;

    public OuvrierIterateur(ArrayList<Ouvrier> liste) {
        this.liste = liste;
    }

    /**
     * Méthode boolean hasNext renvoie vrai si l'itération
     * comporte plusieurs éléments.
     *
     * @return true si l’itération comporte plus d’éléments.
     */

    public boolean hasNext() {

        return this.index < this.liste.size() && this.liste.get(this.index) != null;

    }

    /**
     * Méthode next() Renvoie l’élément suivant de l’itération.
     *
     * @return l'élément suivant dans l'itération.
     */

    public Object next() {
        Ouvrier ouvrier = liste.get(this.index);
        this.index++;
        return ouvrier;
    }
}
