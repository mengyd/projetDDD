package ESGI5.projetDDD.model.Entretien;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Consultant {
	private String nom;
	private String prenom;
	private ArrayList<Technos> techno;
	private ArrayList<SimpleDateFormat> disponibilites;
	//private int anneeExperience;
	
	public Consultant(String nom, String prenom, ArrayList<Technos> techno, ArrayList<SimpleDateFormat> disponibilites) {
		this.nom = nom;
		this.prenom = prenom;
		this.techno = techno;
		this.disponibilites = disponibilites;
		//this.anneeExperience = anneeExperience;
	}

	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public ArrayList<Technos> getTechno() {
		return techno;
	}
	
	
	public ArrayList<SimpleDateFormat> getDisponibilites() {
		return disponibilites;
	}

	public void setDisponibilites(ArrayList<SimpleDateFormat> disponibilites) {
		this.disponibilites = disponibilites;
	}

	/*
	public int getAnneeExperience() {
		return anneeExperience;
	}
*/
	public boolean peutTester(Candidat candidat) {
//		return this.techno.containsAll(candidat.getTechno()) && this.anneeExperience >= candidat.getAnneeExperience();
		return this.techno.containsAll(candidat.getTechno());
	}
	
	public boolean estDisponible(Creneau creneau) {
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disponibilites == null) ? 0 : disponibilites.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((techno == null) ? 0 : techno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consultant other = (Consultant) obj;
		if (disponibilites == null) {
			if (other.disponibilites != null)
				return false;
		} else if (!disponibilites.equals(other.disponibilites))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (techno == null) {
			if (other.techno != null)
				return false;
		} else if (!techno.equals(other.techno))
			return false;
		return true;
	}
	
	
}
