package fr.diginamic.testenumeration;

public enum Saison {
    PRINTEMPS("Printemps", 1),
    ETE("Eté", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    String libelle;
    int numeroOrdre;

    Saison(String libelle, int numeroOrdre) {
        setLibelle(libelle);
        setNumeroOrdre(numeroOrdre);
    }

    public static Saison fromLibelle(String libelle) {
        Saison enumSaison = null;
        for (Saison value : values()) {
            if (value.libelle.equals(libelle)) {
                enumSaison = value;
                break;
            }
        }
        return enumSaison;
    }

    Saison() {
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getNumeroOrdre() {
        return numeroOrdre;
    }

    public void setNumeroOrdre(int numeroOrdre) {
        this.numeroOrdre = numeroOrdre;
    }
}
