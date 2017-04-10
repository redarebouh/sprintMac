package fabriques;

/**
 * Created by kagboton on 10/04/17.
 */
public class FabriqueFantome {

    private static FabriqueFantome instance;

    private FabriqueFantome(){

    }


    public static FabriqueFantome getInstance(){
        if (instance == null){
            instance = new FabriqueFantome();
        }

        return instance;
    }


    /**
     * Méthode pour créer un Fantôme
     * @param pseudoJoueur
     * @return une instance de Fantome
     */
    public Fantome creerFantome(String pseudoJoueur){
        return new Fantome(pseudoJoueur);
    }
}
