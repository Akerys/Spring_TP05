package fr.diginamic.spring.TP05.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="LIVRETA")
public class LivretA extends Compte{
	
	private double taux;

	public LivretA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LivretA(double taux) {
		super();
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "LivretA [taux=" + taux + "]";
	}
	
	

}
