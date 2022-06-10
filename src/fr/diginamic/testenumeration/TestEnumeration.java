package fr.diginamic.testenumeration;

public class TestEnumeration {
    public static void main(String[] args) {
        Saison[] saisons = Saison.values();

        for (Saison saison : saisons) {
            System.out.println(saison);
        }

        String e = "ETE";
        System.out.println(Saison.valueOf(e));

        String libelleRecherche = "Hiver";
        System.out.println("from libelle: " + Saison.fromLibelle(libelleRecherche));

    }
}
