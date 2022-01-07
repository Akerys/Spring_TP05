package fr.diginamic.spring.TP05.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.diginamic.spring.TP05.model.Compte;
import fr.diginamic.spring.TP05.model.Operation;

public interface ICrudCompte extends CrudRepository<Compte, Integer> {

	@Query("SELECT o FROM Operation o WHERE o.compte.id=:id")
	public Iterable<Operation> findByOperations(int id);
	
}
