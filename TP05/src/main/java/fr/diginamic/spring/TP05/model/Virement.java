package fr.diginamic.spring.TP05.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="VIREMENT")
public class Virement extends Operation{
	
	private String beneficiaire;

	public Virement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Virement(Date date, double montant, String motif, Compte compte) {
		super(date, montant, motif, compte);
		// TODO Auto-generated constructor stub
	}

	public Virement(String beneficiaire) {
		super();
		this.beneficiaire = beneficiaire;
	}

	public String getBeneficiaire() {
		return beneficiaire;
	}

	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

	@Override
	public String toString() {
		return "Virement [beneficiaire=" + beneficiaire + "]";
	}
	
	

}
