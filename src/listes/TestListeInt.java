package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> listeEntier = new ArrayList<>(List.of(new Integer[]{-1, 5, 7, 3, -2,
        4, 8, 5}));
        //Affichez tous les éléments de la liste
        System.out.println(listeEntier);
        //Affichez la taille de la liste
        System.out.println(listeEntier.size());
        //Affichez le plus grand élément le la liste
        System.out.println(Collections.max(listeEntier));
        //Supprime le plus petit élément de la liste
        for (Iterator<Integer> iterator = listeEntier.iterator(); iterator.hasNext();) {
            Integer integer = iterator.next();
            if (integer == Collections.min(listeEntier)) {
                iterator.remove();
            }
        }
        //Affiche le résultat de la suppression ci-dessus
        System.out.println(listeEntier);

    }
}
