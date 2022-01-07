package fr.diginamic.spring.TP05.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ASSURANCEVIE")
public class AssuranceVie extends Compte{

	@Temporal(TemporalType.DATE)
	private Date dateFin;
	
	private double taux;

	public AssuranceVie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AssuranceVie(Date dateFin, double taux) {
		super();
		this.dateFin = dateFin;
		this.taux = taux;
	}



	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "AssuranceVie [dateFin=" + dateFin + ", taux=" + taux + "]";
	}
	
	
}
