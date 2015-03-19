package com.irmasoft.bookstore.service;

import java.io.Serializable;
import java.util.List;

import com.irmasoft.bookstore.beans.AuteurBean;

public interface IAuteurService extends Serializable {

	/**
	 * Récupère la liste des auteurs.
	 * @return Une liste qui contient les auteurs.
	 */
	public List<AuteurBean> getListAuteur();
	
}
