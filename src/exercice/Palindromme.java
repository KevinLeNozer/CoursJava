package exercice;

import java.util.Scanner;

public class Palindromme {
    public static void main(String[] args) {
        String original = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un mot");
        original = sc.nextLine();

        if (pal(original)) {
            System.out.println("'" + original + "' est un palindromme");
        }else {
            System.out.println("'" + original + "' n'est un palindromme");
        }

    }

    public static boolean pal(String mot) {
        int i = 0, longueur = mot.length()-1;
        boolean egale = true;

        while(i<longueur/2 && egale) {
            egale = mot.charAt(i) == mot.charAt(longueur - i);
            i++;
        }
        return egale;
    }
}
