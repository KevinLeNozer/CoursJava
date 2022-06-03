package entities;

import entities2.Personne;

public class TestPersonne {

    public static void main(String[] args) {
        Personne user1 = new Personne("Jean", "Dupond");
        /*user1.nom = "Jean";
        user1.prenom = "Dupond";
        user1.adressePostale.numeroDeRue = 19;
        user1.adressePostale.libelleDeLaRue = "rue jean dupond";
        user1.adressePostale.codePostal = 45187;
        user1.adressePostale.ville = "Neuville";*/

        Personne user2 = new Personne("Maverick", "Charles",
                new AdressePostale(
                22,
                "rue Maverick Charles",
                15789,
                "Inconnue"
                ));

        user2.ajoutNomFamille();
        /*user2.nom = "Maverick";
        user2.prenom = "Charles";
        user2.adressePostale.numeroDeRue = 22;
        user2.adressePostale.libelleDeLaRue = "rue Maverick Charles";
        user2.adressePostale.codePostal = 15789;
        user2.adressePostale.ville = "Inconnnue";*/
    }
}
