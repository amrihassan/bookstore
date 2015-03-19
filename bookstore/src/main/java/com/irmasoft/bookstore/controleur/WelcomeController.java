package com.irmasoft.bookstore.controleur;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping("/")
	public String showIndex () {
		logger.info("Affichage du PAge d'accueil.");
		return "accueil";
	}

}
