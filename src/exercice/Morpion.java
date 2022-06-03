package exercice;

import java.util.HashMap;
import java.util.Scanner;

public class Morpion {
    static String player = "";
    static String player2 = "";
    static int placement = 0;
    static String currentPlayer = "";
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, String> square = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("joueur 1 est :");
        square.put(1, "1");
        square.put(2, "2");
        square.put(3, "3");
        square.put(4, "4");
        square.put(5, "5");
        square.put(6, "6");
        square.put(7, "7");
        square.put(8, "8");
        square.put(9, "9");

        //Si player n'est pas égale à X et O alors on redemande
        while (!player.equals("X") && !player.equals("O")) {
            player = sc.nextLine();
            //Si player n'est pas égale à X et O afficher une erreur
            if (!player.equals("X") && !player.equals("O")) {
                System.out.println("Entrée incorrecte");
                System.out.println("Tu ne peu utilisé que le X ou le O");
            }
        }
        //Si le player est égale à X alors playe2 est égale à O
        player2 = (player.equals("X") ? "O":"X");
        currentPlayer = player;
        while (true) {
            do {
                if (askPlacement()) {
                    break;
                }

            }while (true);
            if (checkwinner()) {
                System.out.println("Bravo vous avez gagner : " + currentPlayer);
                drawMap();
                break;
            }
            changePlayer();
        }
    }
    public static void drawMap() {
        for (int i = 0; i <= square.size(); i++) {
            if (i % 3 == 0) {
                System.out.println(square.get(i-2) + " " + square.get(i-1) + " " + square.get(i));
            }
        }
    }
    public static boolean askPlacement() {
        //System.out.println("Quelle " + currentPlayer + "");
        System.out.println("Quelle place voulez vous ? :");
        drawMap();
        placement = sc.nextInt();
        if (square.containsValue(String.valueOf(placement))) {
            square.put(placement, currentPlayer);
            return true;
        } else {
            System.out.println("Place prise");
            return false;
        }
    }
    public static void changePlayer() {
        currentPlayer = (currentPlayer.equals("X") ? "O":"X");
    }
    public static boolean checkwinner(){
        // check for X and O
        if(square.get(1).equals(currentPlayer)  && square.get(2).equals(currentPlayer) && square.get(3).equals(currentPlayer)){
            return  true;
        }
        if(square.get(4).equals(currentPlayer) && square.get(5).equals(currentPlayer) && square.get(6).equals(currentPlayer)){
            return  true;
        }
        if(square.get(7).equals(currentPlayer) && square.get(8).equals(currentPlayer) && square.get(9).equals(currentPlayer)){
            return  true;
        }
        if(square.get(1).equals(currentPlayer) && square.get(4).equals(currentPlayer) && square.get(7).equals(currentPlayer)){
            return  true;
        }
        if(square.get(2).equals(currentPlayer) && square.get(5).equals(currentPlayer) && square.get(8).equals(currentPlayer)){
            return true;
        }
        if(square.get(3).equals(currentPlayer) && square.get(6).equals(currentPlayer) && square.get(9).equals(currentPlayer)){
            return true;
        }
        if(square.get(1).equals(currentPlayer) && square.get(5).equals(currentPlayer) && square.get(9).equals(currentPlayer)){
            return true;
        }
        if(square.get(3).equals(currentPlayer) && square.get(5).equals(currentPlayer) && square.get(7).equals(currentPlayer)){
            return true;
        }
        return false;
    }
}
