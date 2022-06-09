package maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class mapVilles {
    public static void main(String[] args) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(59, "Lille");
        mapVilles.put(33, "Bordeaux");
        mapVilles.put(69, "Lyon");

        Iterator<Integer> keysIte = mapVilles.keySet().iterator();
        while (keysIte.hasNext()) {
            Integer integer = keysIte.next();
            System.out.println(integer);
        }

        Iterator<String> valeurVilles = mapVilles.values().iterator();
        while (valeurVilles.hasNext()) {
            String string = valeurVilles.next();
            System.out.println(string);
        }

        System.out.println(mapVilles.size());
    }
}
