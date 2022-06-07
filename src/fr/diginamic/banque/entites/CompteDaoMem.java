package fr.diginamic.banque.entites;

public class CompteDaoMem implements CompteDao {
    int[] tableauDesComptes;

    @Override
    public Compte[] lister() {
        return new Compte[0];
    }

    @Override
    public void sauvegarder(Compte nvCompte) {

    }

    @Override
    public boolean supprimer(String numero) {
        return false;
    }

    @Override
    public boolean existe(String numero) {
        return false;
    }

    @Override
    public Compte getCompte(String numero) {
        return null;
    }
}
