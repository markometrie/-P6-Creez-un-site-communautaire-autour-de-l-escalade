package com.escalade.business.managerImpl;

import org.projetoc.escalade.model.Secteur;

import com.escalde.business.manager.SecteurManager;

/*
Creation de la classe SecteurManagerImpl qui implemente l'interface SecteurManager
*/

public class SecteurManagerImpl extends AbstractManager implements SecteurManager{
    
                   /*
                   Implementation des methodes
                   */

	@Override
	public void addSecteur(Secteur secteur) {
		getDaoFactory().getSecteurDao().addSecteur(secteur);
		
	}

	@Override
	public Secteur getSecteur(Secteur secteur) {
		return getDaoFactory().getSecteurDao().getSecteur(secteur);

	}

	@Override
	public void deleteSecteurPicture(Secteur secteur) {
		getDaoFactory().getSecteurDao().deleteSecteurPicture(secteur);
		
	}

	@Override
	public void updateSecteur(Secteur secteur) {
		getDaoFactory().getSecteurDao().updateSecteur(secteur);
		
	}

	@Override
	public void deleteSecteur(Secteur secteur) {
		getDaoFactory().getSecteurDao().deleteSecteur(secteur);
		
	}

}
