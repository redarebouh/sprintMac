package parties;

/**
 * Created by Amaury on 10/04/2017.
 */
public abstract class Case {

    private int x;
    private int y;
    protected boolean isSortie;
    private String pseudoJoueur;
    private Fantome fantome;

    public Case(int x, int y, String pseudoJoueur) {
        this.x = x;
        this.y = y;
        this.pseudoJoueur = pseudoJoueur;
    }

    public Case(int x, int y, String pseudoJoueur, Fantome fantome) {
        this.x = x;
        this.y = y;
        this.pseudoJoueur = pseudoJoueur;
        this.fantome = fantome;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isSortie() {
        return isSortie;
    }

    public String getPseudoJoueur() {
        return pseudoJoueur;
    }

    public Fantome getFantome() {
        return fantome;
    }

    public void setFantome(Fantome fantome){
        this.fantome = fantome;
    }

    public boolean contientFantome(){
        return fantome == null ? false : true;
    }

}
