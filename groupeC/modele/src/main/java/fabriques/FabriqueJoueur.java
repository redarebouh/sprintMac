package fabriques;

import joueurs.Joueur;

/**
 * Created by David on 10/04/2017.
 */
public class FabriqueJoueur {

    private static FabriqueJoueur instance;

    private FabriqueJoueur(){

    }

    public static FabriqueJoueur getInstance(){
        if (instance == null){
            instance = new FabriqueJoueur();
        }

        return instance;
    }

    public Joueur creerJoueur(String pseudo, String password){
        return new Joueur(pseudo, password);
    }
}
