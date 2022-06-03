package exercice;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nom binaire : ");
        String binaire = sc.nextLine();

        System.out.println(Integer.parseInt(binaire, 2));
    }
}
