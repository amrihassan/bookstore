package com.irmasoft.bookstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irmasoft.bookstore.beans.AuteurBean;
import com.irmasoft.bookstore.model.Auteur;
import com.irmasoft.bookstore.dao.IAuteurDao;

@Service
public class AuteurService implements IAuteurService {

	/** */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	IAuteurDao auteurDao; 

	
	public List<AuteurBean> getListAuteur() {
		List<Auteur> lAuteur = auteurDao.getListAuteur();
		List<AuteurBean>lAuteurBean = new ArrayList<AuteurBean>();
		for(Auteur auteur: lAuteur) {
			AuteurBean auteurB = new AuteurBean();
			auteurB.setId(auteur.getId());
			auteurB.setNom(auteur.getNom());
			auteurB.setPrenom(auteur.getPrenom());
			auteurB.setAdresse(auteur.getAdresse());
			auteurB.setDateNaissance(auteur.getDateNaissance());
			auteurB.setEmail(auteur.getEmail());
			auteurB.setNumTel(auteur.getNumTel());
			lAuteurBean.add(auteurB);
		}
		return lAuteurBean;
	}

	public IAuteurDao getAuteurDao() {
		return auteurDao;
	}

	public void setAuteurDao(IAuteurDao auteurDao) {
		this.auteurDao = auteurDao;
	}
	
}
