package parties;

/**
 * Created by Amaury on 10/04/2017.
 */
public class CaseStandard extends Case {

    public CaseStandard(int x, int y, String pseudoJoueur) {
        super(x, y, pseudoJoueur);
        this.isSortie = false;
    }

    public CaseStandard(int x, int y, String pseudoJoueur, Fantome fantome) {
        super(x, y, pseudoJoueur, fantome);
        this.isSortie = false;
    }
}
