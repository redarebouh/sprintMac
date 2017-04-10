package joueurs;

/**
 * Created by David on 10/04/2017.
 */
public class Joueur {


    private String pseudo; // le pseudo est unique
    private String password;



    public Joueur(String nom,String mdp){
        this.pseudo = nom;
        this.password = mdp;
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
