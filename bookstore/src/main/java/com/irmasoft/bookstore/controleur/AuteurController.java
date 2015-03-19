package com.irmasoft.bookstore.controleur;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.irmasoft.bookstore.beans.AuteurBean;
import com.irmasoft.bookstore.service.IAuteurService;

@Controller
public class AuteurController {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private IAuteurService auteurService;

	@RequestMapping("/auteur")
	public String gestionAteurs () {
		logger.info("Affichage de la page de gestion d'auteur.");
		return "auteur";
	}
	
	@RequestMapping("/auteur/listAuteur")
	public String  listAuteurs (Model m) {
		List<AuteurBean> lAuteur = auteurService.getListAuteur();
		m.addAttribute("lAuteur", lAuteur);
		return "listAuteur";
	}
	
	@RequestMapping("/auteur/ajouterAuteur")
	public void ajouterAuteur() {
		
	}
	
	@RequestMapping("/auteur/modifierAuteur")
	public void modifierAuteur(){
		
	}

}
