package maps;

import java.util.HashMap;

public class CreationMap {
    public static void main(String[] args) {
        HashMap<String, String> mapSalaire = new HashMap<>();

        mapSalaire.put("Paul", "1750 €");
        mapSalaire.put("Hicham", "1825 €");
        mapSalaire.put("Yu", "2250 €");
        mapSalaire.put("Ingrid", "2015 €");
        mapSalaire.put("Chantal", "2418 €");

        System.out.println(mapSalaire.size());
    }
}
