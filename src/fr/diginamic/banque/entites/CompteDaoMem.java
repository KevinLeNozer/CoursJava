package fr.diginamic.banque.entites;

import java.util.ArrayList;
import java.util.List;

public class CompteDaoMem implements CompteDao {
    //DAO => DataAccessObject Mem => Memoire

     List<Compte> comptes = new ArrayList<>();

    @Override
    public List<Compte> lister() {
        return comptes;
    }

    @Override
    public void sauvegarder(Compte compte) {
        comptes.add(compte);
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
