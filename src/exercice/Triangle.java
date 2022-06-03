package exercice;

import java.util.ArrayList;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");

        int userNbr = sc.nextInt();

        ArrayList<Integer> numberList = new ArrayList<>();

        for (int i = 1; i < userNbr +1; i++) {
            numberList.add(i);
            System.out.println(numberList);
        }
    }
}
