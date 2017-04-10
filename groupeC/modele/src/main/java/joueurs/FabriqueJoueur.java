package joueurs;

/**
 * Created by khale on 10/04/2017.
 */
public class FabriqueJoueur {

    private static FabriqueJoueur instance;

    private FabriqueJoueur() {

    }


    public static FabriqueJoueur getInstance() {
        if (instance == null){
            instance = new FabriqueJoueur();
        }
        return instance;
    }


    public Joueur creationJoueur(String nom,String password) {
        return new Joueur(nom,password);
    }

}
