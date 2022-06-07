package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteDaoMem;
import fr.diginamic.banque.entites.CompteTaux;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBanque extends CompteDaoMem {
    public static void main(String[] args) {
        /*Compte compte = new Compte(150, 25487);
        CompteTaux compteTaux = new CompteTaux(50, 150,1.8);

        //Création des tableaux
        Compte[] comptes = new Compte[2];
        comptes[0] = compte;
        comptes[1] = compteTaux;*/

        //Boucle afinn d'afficher les informations des comptes
        /*for (Compte compteCourant : comptes) {
            System.out.println(compteCourant);
        }*/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("***Administration des comptes***");
        System.out.println("1. Lister les comptes");
        System.out.println("2. Ajouter un nouveau compte ");
        System.out.println("3. Ajouter une opération à un compte");
        System.out.println("4. Supprimer un compte");
        System.out.println("99. Sortir ");
        if (sc.nextInt() == 1) {
            System.out.println("1 => Liste des comptes");
        } else if (sc.nextInt() == 2) {
            System.out.println("2. Ajouter un nouveau compte ");
        }*/

    }
}
