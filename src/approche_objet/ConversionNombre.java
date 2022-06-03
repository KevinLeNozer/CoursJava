package approche_objet;

public class ConversionNombre {
    public static void main(String[] args) {
        String chaine = "12";

        int resultat = Integer.parseInt(chaine);
        System.out.println("Le résultat est  : " + resultat);

        int a = 12;
        int b = 5;

        int resultat2 = Integer.max(a,b);
        System.out.println(resultat2);
    }
}
