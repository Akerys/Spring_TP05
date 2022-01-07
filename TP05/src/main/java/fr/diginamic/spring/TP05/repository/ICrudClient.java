package fr.diginamic.spring.TP05.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.diginamic.spring.TP05.model.Client;
import fr.diginamic.spring.TP05.model.Compte;

public interface ICrudClient extends CrudRepository<Client, Integer> {

	@Query("SELECT c FROM Compte c WHERE :client MEMBER OF c.compteClients")
	public Iterable<Compte> findByComptes(Client client);
}
