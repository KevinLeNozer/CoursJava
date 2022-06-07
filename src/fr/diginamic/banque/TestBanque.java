package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte(150, 25487);
        CompteTaux compteTaux = new CompteTaux(50, 150,1.8);

        //Création des tableaux
        Compte[] comptes = new Compte[2];
        comptes[0] = compte;
        comptes[1] = compteTaux;

        //Boucle afinn d'afficher les informations des comptes
        for (Compte compteCourant : comptes) {
            System.out.println(compteCourant);
        }

    }
}
