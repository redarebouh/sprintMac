package facades;

import exceptions.IdentifiantsIncorrectsException;
import exceptions.JoueurDejaConnecteException;
import exceptions.PseudoDejaExistantException;
import fabriques.FabriqueJoueur;
import joueurs.Joueur;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alphalion27 on 10/04/17.
 */
public class Facade implements IFacade {

    private List<Joueur> joueurs;
    private List<Joueur> joueursConnectes;
    private FabriqueJoueur fabriqueJoueur;

    public Facade(){
        joueurs = new ArrayList<Joueur>();
        joueursConnectes = new ArrayList<Joueur>();
        fabriqueJoueur = FabriqueJoueur.getInstance();
    }

    /* Gestion des utilisateurs */

    // Inscription, qui leve une exception si un utilisateur qui a le meme pseudo existe dèja
    public void inscription(String pseudo, String password) throws PseudoDejaExistantException {
        if(estInscrit(pseudo)) throw new PseudoDejaExistantException("Le pseudo '"+pseudo+"' est déja utilisé");
        Joueur j = fabriqueJoueur.creerJoueur(pseudo, password);
        joueurs.add(j);
    }

    // Connexion, qui lève une exception si l'utilisateur est deja connecté ou si le couple identifiant mot de passe est incorrect
    public void connexion(String pseudo, String password) throws JoueurDejaConnecteException, IdentifiantsIncorrectsException {
        if(estConnecte(pseudo)) throw new JoueurDejaConnecteException("Le joueur '"+pseudo+"' est déja connecté");
        for(Joueur j : joueurs){
            if(j.getPseudo().equals(pseudo)){
                if(!j.getPassword().equals(password)) throw new IdentifiantsIncorrectsException("Le couple identifiant/mot de passe est incorrect");
            }
            else{
                joueursConnectes.add(j);
            }
        }
    }

    // Deconnecte un utilisateur
    public void deconnexion(String pseudo) {
        for(Joueur j: joueursConnectes){
            if(j.getPseudo().equals(pseudo)){
                joueursConnectes.remove(j);
            }
        }
    }

    // Renvoie vrai si l'utilisateur est deja inscrit
    public boolean estInscrit(String pseudo) {
        for(Joueur j: joueurs){
            if(j.getPseudo().equals(pseudo)){
                return true;
            }
        }
        return false;
    }

    // Renvoie vrai si l'utilisateur est deja connecte
    public boolean estConnecte(String pseudo) {
        for(Joueur j : joueursConnectes) {
            if (j.getPseudo().equals(pseudo)) {
                return true;
            }
        }
        return false;
    }




    /* Gestion des salons */

    public void creerSalon(String pseudo) {
    }

    public void rejoindreSalon(String pseudo, int idSalon) {
    }

    public void intervertirFantomes(int idSalon, String pseudo, int xSource, int ySource, int xDestination, int yDestination) {

    }

    public void validerPlacementFantomes(int idSalon, String pseudo) {

    }

    public void effectuerAction(int idSalon, String pseudo, int xSource, int ySource, int xDestination, int yDestination) {

    }

    public void quitterPartie(int idSalon, String pseudo) {

    }

    public void quitterSalon(int idSalon, String pseudo) {

    }
}
