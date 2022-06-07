package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    public CompteTaux(String numeroCompte, int soldeCompte, double tauxRemuneration) {
        super(numeroCompte, soldeCompte);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return "CompteTaux{" +
                "tauxRemuneration=" + tauxRemuneration +
                '}';
    }

    public Double tauxRemuneration;
}
