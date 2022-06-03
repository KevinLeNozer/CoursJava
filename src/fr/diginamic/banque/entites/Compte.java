package fr.diginamic.banque.entites;

public class Compte {
    public int numeroCompte;
    public int soldeCompte;

    public Compte(int numeroCompte, int soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public int getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(int soldeCompte) {
        this.soldeCompte = soldeCompte;
    }
}
