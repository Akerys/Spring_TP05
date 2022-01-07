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
import fr.diginamic.spring.TP05.model.Client;
import fr.diginamic.spring.TP05.repository.ICrudClient;

@RestController
@RequestMapping("banque/clients")
public class ClientRest {
	
	@Autowired
	ICrudClient cc;
	
	@GetMapping(value ="/clients/{id}")
	public Client findClient(@PathVariable int id) throws ClientNotFoundException {
		if(cc.findById(id).isEmpty()) {
			throw new ClientNotFoundException("Client non trouvé");
		}
		return cc.findById(id).get();
	}
	
	
}
