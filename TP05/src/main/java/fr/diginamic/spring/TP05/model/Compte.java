package fr.diginamic.spring.TP05.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="COMPTE")
public class Compte {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    private String numero;
    
    private double solde;
    
    @ManyToMany
    @JoinTable(name="CLIENT_COMPTE",
    joinColumns=@JoinColumn(name="ID_COMPTE",referencedColumnName="ID"),
    inverseJoinColumns=@JoinColumn(name="ID_CLIENT",referencedColumnName="ID"))
    private Set<Client> compteClients;
    

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
		compteClients = new HashSet<Client>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [id=" + id + ", numero=" + numero + ", solde=" + solde + "]";
	}
    
    
}
