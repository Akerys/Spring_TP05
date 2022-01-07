package fr.diginamic.spring.TP05.controllerrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.diginamic.spring.TP05.exception.BanqueNotFoundException;
import fr.diginamic.spring.TP05.exception.OperationNotFoundException;
import fr.diginamic.spring.TP05.model.Operation;
import fr.diginamic.spring.TP05.repository.ICrudOperation;

@RestController
@RequestMapping("banque/operations")
public class OperationRest {
	
	@Autowired
	ICrudOperation co;
	
	@GetMapping(value ="/operationts/{id}")
	public Operation findOperation(@PathVariable int id) throws OperationNotFoundException {
		if(co.findById(id).isEmpty()) {
			throw new OperationNotFoundException("Opération non trouvé");
		}
		return co.findById(id).get();
	}
}
