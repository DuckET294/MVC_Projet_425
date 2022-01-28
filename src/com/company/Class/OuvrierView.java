package com.company.Class;

import com.company.Interface.Iterator;

public class OuvrierView {

    /**
     * Cette méthode sert à afficher tous les ouvriers
     * qui se trouve dans la liste de type ArrayList.
     *
     * @param iterator Permet de performer l'action jusqu'au dernier élément.
     */

    public void afficherOuvrier(Iterator iterator) {
        int index = 1;

        while (iterator.hasNext()) {

            Ouvrier mi = (Ouvrier) iterator.next();
            System.out.println("************** Ouvrier: ****************");
            System.out.println(" Numéro d'ouvrier : " + index + mi + "\n");
            index++;

        }

    }

}