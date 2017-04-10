package parties;

/**
 * Created by Amaury on 10/04/2017.
 */
public abstract class Case {

    private int x;
    private int y;
    protected boolean sortie;
    private String pseudoJoueur;
    private Fantome fantome;

    /**
     *
     * @param x Coordonnée x
     * @param y Coordonnée y
     * @param pseudoJoueur Pseudo du joueur à qui appartient la case
     */
    public Case(int x, int y, String pseudoJoueur) {
        this.x = x;
        this.y = y;
        this.pseudoJoueur = pseudoJoueur;
    }

    /**
     *
     * @param x Coordonnée x
     * @param y Coordonnée y
     * @param pseudoJoueur Pseudo du joueur à qui appartient la case
     * @param fantome Fantome présent sur la case
     */
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
        return sortie;
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

    /**
     * Permet de déterminer si la case contient un fantome
     * @return True si c'est le cas. False sinon
     */
    public boolean contientFantome(){
        return fantome == null ? false : true;
    }

    /**
     * Permet de supprimer le fantome présent sur une case s'il y en avait effectivement un.
     */
    public void supprimerFantome(){
        this.fantome = null;
    }

}
