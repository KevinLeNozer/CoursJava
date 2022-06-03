package entities2;

import TPSalaire.Adresse;
import entities.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;

    public Personne() {
        System.out.println("La création d'une personne");
    }

    public Personne(String nom, String prenom) {
        this();
        this.nom = nom;
        this.prenom = prenom;
    }
    public AdressePostale adressePostale;

    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this(nom, prenom);
        this.adressePostale = adressePostale;
    }

    public String ajoutNomFamille() {
            return this.nom + this.prenom + "DUPOND";
    }
}
