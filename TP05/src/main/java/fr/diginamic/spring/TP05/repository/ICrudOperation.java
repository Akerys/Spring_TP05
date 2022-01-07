package fr.diginamic.spring.TP05.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.diginamic.spring.TP05.model.Operation;

public interface ICrudOperation extends CrudRepository<Operation, Integer> {
	
	@Query("SELECT o FROM Operation o WHERE o.compte.id=:id")
	public Iterable<Operation> findByComptes(int id);

}
