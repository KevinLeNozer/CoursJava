package fr.diginamic.testenumeration;

public class Pays {
    protected String nom;
    protected Double nbrHabitant;
    protected int pibHabitant;

    private Continent continent;

    public Pays(String nom, Double nbrHabitant, int pibHabitant, Continent continent) {
        this.nom = nom;
        this.nbrHabitant = nbrHabitant;
        this.pibHabitant = pibHabitant;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getNbrHabitant() {
        return nbrHabitant;
    }

    public void setNbrHabitant(Double nbrHabitant) {
        this.nbrHabitant = nbrHabitant;
    }

    public int getPibHabitant() {
        return pibHabitant;
    }

    public void setPibHabitant(int pibHabitant) {
        this.pibHabitant = pibHabitant;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", nbrHabitant=" + nbrHabitant +
                ", pibHabitant=" + pibHabitant +
                ", continent=" + continent +
                '}';
    }
}
