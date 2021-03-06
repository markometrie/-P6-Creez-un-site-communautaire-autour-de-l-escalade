package org.projetoc.escalade.consumer.contract.dao;

import org.projetoc.escalade.model.Utilisateur;

/*
Creation du pattern Dao (Data Access Objet) pour communiquer avec la base de données via l'interface UtilisateurDao
*/

public interface UtilisateurDao {
    
                       /* Methodes Ajouter | Recupérer | Supprimer | MAJ  qui seront présentent dans les requetes Sql*/
	
	    void addUser(Utilisateur user);

	    Utilisateur getUser(Utilisateur user);

	    void deleteUserPicture(Utilisateur user);

	    void updateUser(Utilisateur user);

	    void deleteUser(Utilisateur user);
	}


