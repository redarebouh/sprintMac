package parties;

/**
 * Created by Amaury on 10/04/2017.
 */
public class CaseSortie extends Case {

    public CaseSortie(int x, int y, String pseudoJoueur) {
        super(x, y, pseudoJoueur);
        this.sortie = true;
    }

    public CaseSortie(int x, int y, String pseudoJoueur, Fantome fantome) {
        super(x, y, pseudoJoueur, fantome);
        this.sortie = true;
    }
}
