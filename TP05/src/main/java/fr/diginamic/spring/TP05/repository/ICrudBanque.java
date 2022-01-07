package fr.diginamic.spring.TP05.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.diginamic.spring.TP05.model.Banque;
import fr.diginamic.spring.TP05.model.Client;

public interface ICrudBanque extends CrudRepository<Banque, Integer> {

    @Query("select c from Client c  where c.banque.id = :id")
     public Iterable<Client> findByClient(int id);

}
