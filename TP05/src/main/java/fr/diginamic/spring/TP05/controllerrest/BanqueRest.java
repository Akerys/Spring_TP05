package fr.diginamic.spring.TP05.controllerrest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.diginamic.spring.TP05.exception.BanqueNotFoundException;
import fr.diginamic.spring.TP05.exception.CompteNotFoundException;
import fr.diginamic.spring.TP05.model.Banque;
import fr.diginamic.spring.TP05.repository.ICrudBanque;

@RestController
@RequestMapping("banque/banques")
public class BanqueRest {
	
	@Autowired
	ICrudBanque cb;
	
	@GetMapping(value ="/banques/{id}")
	public Optional<Banque> findBanque(@PathVariable int id) throws BanqueNotFoundException {
		if(cb.findById(id).isEmpty()) {
			throw new BanqueNotFoundException("Compte non trouvé");
		}
		return cb.findById(id);
	}
}