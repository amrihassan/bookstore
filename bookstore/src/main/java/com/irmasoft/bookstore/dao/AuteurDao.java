package com.irmasoft.bookstore.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.irmasoft.bookstore.model.Auteur;
import com.irmasoft.bookstore.dao.GenericHibernateDao;

@Repository
public class AuteurDao extends GenericHibernateDao<Auteur> implements IAuteurDao {

	public AuteurDao() {
		super(Auteur.class);
	}
	
	@Transactional
	public List<Auteur> getListAuteur() {
		return getAll();
	}

	
	
}

