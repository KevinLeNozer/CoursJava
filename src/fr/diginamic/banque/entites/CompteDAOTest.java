package fr.diginamic.banque.entites;

import java.util.Scanner;

public class CompteDAOTest {

    public static void main(String[] args) {
        CompteDao compteDao = new CompteDaoMem();

        Compte compte = new Compte("154 487 154 744", 5810);

        compteDao.sauvegarder(compte);
        boolean suppSucces = compteDao.supprimer(compte.getNumeroCompte());

        System.out.println("Suppression réussi => " + suppSucces);
        System.out.println(compteDao.lister().size());
        Scanner sc = new Scanner(System.in);
        System.out.println("***Administration des comptes***");
        System.out.println("1. Lister les comptes");
        System.out.println("2. Ajouter un nouveau compte ");
        System.out.println("3. Ajouter une opération à un compte");
        System.out.println("4. Supprimer un compte");
        System.out.println("99. Sortir ");
        if (sc.nextInt() == 1) {
            System.out.println("1 => Liste des comptes :" + "\n" + compteDao.lister());
        } else if (sc.nextInt() == 2) {
            System.out.println("numéro de compte");
            String numeroCompte = sc.next();
            System.out.println("Solde du compte");
            int solde = sc.nextInt();
            Compte nextCompte = new Compte(numeroCompte, solde);
            System.out.println("Création de compte réussi !");
        }
    }
}