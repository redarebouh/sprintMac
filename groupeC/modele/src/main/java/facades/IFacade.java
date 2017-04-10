package facades;

import exceptions.IdentifiantsIncorrectsException;
import exceptions.JoueurDejaConnecteException;
import exceptions.PseudoDejaExistantException;

/**
 * Created by David on 10/04/2017.
 */
public interface IFacade {


    /* Gestion des utilisateurs */
    void inscription(String pseudo, String password) throws PseudoDejaExistantException;
    void connexion(String pseudo, String password) throws JoueurDejaConnecteException, IdentifiantsIncorrectsException;
    void deconnexion(String pseudo);
    boolean estInscrit(String pseudo);
    boolean estConnecte(String pseudo);


    /* Gestion des salons */
    void creerSalon(String pseudo);
    void rejoindreSalon(String pseudo, int idSalon);

    /* Préparation de la partie */
    void intervertirFantomes(int idSalon, String pseudo, int xSource, int ySource, int xDestination, int yDestination);
    void validerPlacementFantomes(int idSalon, String pseudo);

    /* Gestion de la partie */
    void effectuerAction(int idSalon, String pseudo, int xSource, int ySource, int xDestination, int yDestination);
    void quitterPartie(int idSalon, String pseudo);
    void quitterSalon(int idSalon, String pseudo);
}
