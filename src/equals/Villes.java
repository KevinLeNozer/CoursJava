package equals;

import java.util.Objects;

public class Villes {
    String nom;
    Integer nbrHabitant;

    public Villes(String nom, Integer nbrHabitant) {
        this.nom = nom;
        this.nbrHabitant = nbrHabitant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNbrHabitant() {
        return nbrHabitant;
    }

    public void setNbrHabitant(Integer nbrHabitant) {
        this.nbrHabitant = nbrHabitant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Villes villes = (Villes) o;
        return Objects.equals(nom, villes.nom) && Objects.equals(nbrHabitant, villes.nbrHabitant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, nbrHabitant);
    }
}
