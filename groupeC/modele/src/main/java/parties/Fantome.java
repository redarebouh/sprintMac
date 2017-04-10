package parties;

/**
 * Created by David on 10/04/2017.
 */
public class Fantome {
    private static int ID = 0;

    private int idFantome;
    private String idJoueur;
    private TypeFantome typeFantome;

    /**
     *
     * @param idJoueur L'id du joueur auquel le fantôme est associé
     * @param typeFantome Le type du fantôme
     */
    public Fantome(String idJoueur, TypeFantome typeFantome){
        this.idJoueur = idJoueur;
        this.idFantome = ID;
        this.typeFantome = typeFantome;

        ID++;
    }

    public int getIdFantome() {
        return idFantome;
    }

    public String getIdJoueur() {
        return this.idJoueur;
    }

    public TypeFantome getTypeFantome() {
        return typeFantome;
    }
}
