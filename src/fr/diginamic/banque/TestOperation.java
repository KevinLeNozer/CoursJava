package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Operation operations[] = new Operation[4];

        operations[0]  = new Credit("16-10-2010", 200);
        operations[1]  = new Credit("05-06-2011", 100);
        operations[2]  = new Debit("21-01-2012", 300);
        operations[3]  = new Debit("10-08-2013", 400);

        int totalOperation = 0;
        for (Operation showOpe : operations) {
            if (showOpe.getType().equals("CREDIT")) {
                totalOperation += showOpe.getMontantOperation();
            } else if (showOpe.getType().equals("DEBIT")) {
                totalOperation -= showOpe.getMontantOperation();
            }
            System.out.println(showOpe + " " +showOpe.getType());
        }

        System.out.println("Montant des opérations : " + totalOperation);
    }
}
