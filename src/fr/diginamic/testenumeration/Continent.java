package fr.diginamic.testenumeration;

public enum Continent {

    AFRIQUE("Afrique"),
    AMERIQUE("Amérique"),
    EUROPE("Europe"),
    ASIE("Asie"),
    OCEANIE("Oceanie");

    Continent(String libelle) {
        this.libelle = libelle;
    }

    private String libelle;

    public static Continent fromContinent(String libelle) {
        Continent enumContient = null;
        for (Continent value : values()) {
            if (value.libelle.equals(libelle)) {
                enumContient = value;
                break;
            }
        }
        return enumContient;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
