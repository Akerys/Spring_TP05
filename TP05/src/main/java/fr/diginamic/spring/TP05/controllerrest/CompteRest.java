package fr.diginamic.spring.TP05.controllerrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.diginamic.spring.TP05.exception.ClientNotFoundException;
import fr.diginamic.spring.TP05.exception.CompteNotFoundException;
import fr.diginamic.spring.TP05.model.Compte;
import fr.diginamic.spring.TP05.repository.ICrudCompte;

@RestController
@RequestMapping("banque/comptes")
public class CompteRest {
	
	@Autowired
	ICrudCompte cc;
	
	@GetMapping(value ="/comptes/{id}")
	public Compte findCompte(@PathVariable int id) throws CompteNotFoundException {
		if(cc.findById(id).isEmpty()) {
			throw new CompteNotFoundException("Compte non trouvé");
		}
		return cc.findById(id).get();
	}
}
