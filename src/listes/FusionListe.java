package listes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FusionListe {
    public static void main(String[] args) {

        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");


        List<String> resultList = Stream.concat(liste1.stream(), liste2.stream()).collect(Collectors.toList());

        System.out.println(resultList);



    }
}
