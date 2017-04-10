package joueurs;

/**
 * Created by David on 10/04/2017.
 */
public class Joueur {


    private int id;
    private String pseudo;
    private String password;

    private static int identifiant=0;

    public Joueur(String nom,String mdp){
        this.id = identifiant;
        this.pseudo = nom;
        this.password = mdp;
        identifiant++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
