package exercice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Cafe {
    public static void main(String[] args) {
        final Integer CAFE = 60;
        Integer piece = 0;
        Integer countPiece = 0;

        ArrayList<Integer> pieceOk = new ArrayList<>(Arrays.asList(200, 100, 50, 20, 10, 5));

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Entrer votre pièce pour un café");
            piece = sc.nextInt();
            if (pieceOk.contains(piece)) {
                countPiece += piece;
                System.out.println("Montant = " + countPiece);
            }else {
                System.out.println("Pièce invalide !");
            }
        }while (countPiece < CAFE);

        System.out.println("Voici votre café et votre monnaie " + (countPiece - CAFE) + "ct");
        countMonnaie(countPiece - CAFE);
    }
    public static void countMonnaie(int reste) {
        ArrayList<Integer> piecesARendre = new ArrayList<>();
        do {
            if (reste >= 200) {
                piecesARendre.add(200);
                reste = reste - 200;
            }
            else if (reste >= 100) {
                piecesARendre.add(100);
                reste = reste - 100;
            }
            else if (reste >= 50) {
                piecesARendre.add(50);
                reste = reste - 50;
            }
            else if (reste >= 20) {
                piecesARendre.add(20);
                reste = reste - 20;
            }
            else if (reste >= 10) {
                piecesARendre.add(10);
                reste = reste - 10;
            }
            else if (reste >= 5) {
                piecesARendre.add(5);
                reste = reste - 5;
            }
        }while (reste > 0);
        for (int piece : piecesARendre) {
            System.out.println("Le rendu de votre monnaie " + piece + "ct");
        }
    }
}
