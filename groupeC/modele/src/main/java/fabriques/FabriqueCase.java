package fabriques;

/**
 * Created by kagboton on 10/04/17.
 */
public class FabriqueCase {
    private static FabriqueCase instance;

    private FabriqueCase(){

    }

    public static FabriqueCase getInstance(){
        if(instance == null){
            instance = new FabriqueCase();}
        return instance;
    }

    /**
     * Methode pour creer un objet Case
     * @return une instance de Case
     */
    public Case creerCase(){
        return new Case();
    }
}
