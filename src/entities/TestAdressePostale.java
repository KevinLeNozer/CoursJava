package entities;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(25, "rue des grissois", 86170, "Avanton");
        /*adresse1.numeroDeRue = 25;
        adresse1.libelleDeLaRue = "rue des grissois";
        adresse1.codePostal = 86170;
        adresse1.ville = "Avanton";*/

        AdressePostale adresse2 = new AdressePostale(74, "rue du puits du gue", 77144, "Montévrain");
        /*adresse2.numeroDeRue = 74;
        adresse2.libelleDeLaRue = "rue du puits du gue";
        adresse2.codePostal = 77144;
        adresse2.ville = "Montévrain";*/
    }
}
