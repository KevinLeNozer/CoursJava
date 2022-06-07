package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    public CompteTaux(int numeroCompte, int soldeCompte, double tauxRemuneration) {
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
