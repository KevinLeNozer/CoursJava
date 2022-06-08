package sets;

public class Pays {
    protected String nom;
    protected Double nbrHabitant;
    protected int pibHabitant;

    public Pays(String nom, Double nbrHabitant, int pibHabitant) {
        super();
        this.nom = nom;
        this.nbrHabitant = nbrHabitant;
        this.pibHabitant = pibHabitant;
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
}
