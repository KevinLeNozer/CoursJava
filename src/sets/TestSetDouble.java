package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TestSetDouble {
    public static void main(String[] args) {
        //Exo1
        HashSet<Double> listDouble = new HashSet<>(List.of(new Double[]{1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01}));
        //Afficher tous les éléments de la liste Double
        System.out.println(listDouble);
        //Afficher l'élément le plus grand de la liste double
        System.out.println(Collections.max(listDouble));
        //Suppimez le plus petit élément de la collection
        for (Iterator<Double> iterator = listDouble.iterator(); iterator.hasNext();) {
            Double doubleList = iterator.next();
            if (doubleList == Collections.min(listDouble)) {
                iterator.remove();
            }
        }
        //Affiche la suppression de l'élément le plus petit de la liste double
        System.out.println(listDouble);

        //Exo2
        HashSet<Pays> listPays = new HashSet<>();
        listPays.add(new Pays("USA", 334805.00, 55805));
        listPays.add(new Pays("France", 65889.00, 55805));
        listPays.add(new Pays("Allemagne", 83884.00, 55805));
        listPays.add(new Pays("UK", 68585.00, 55805));
        listPays.add(new Pays("Italie", 60263.00, 55805));
        listPays.add(new Pays("Japon", 12585.00, 55805));
        listPays.add(new Pays("Chine", 1448470.00, 55805));
        listPays.add(new Pays("Russie", 145806.00, 55805));
        listPays.add(new Pays("Inde", 1406632.00, 55805));
    }
}
