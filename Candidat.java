package ESGI5.projetDDD.model.Entretien;

import java.util.ArrayList;

public class Candidat {
	private String nom;
	private String prenom;
	private ArrayList<Technos> techno;
	private int anneeExperience;
	
	public Candidat(String nom, String prenom, ArrayList<Technos> techno, int anneeExperience) {
		this.nom = nom;
		this.prenom = prenom;
		this.techno = techno;
		this.anneeExperience = anneeExperience;
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

	public int getAnneeExperience() {
		return anneeExperience;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anneeExperience;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
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
		Candidat other = (Candidat) obj;
		if (anneeExperience != other.anneeExperience)
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
		return true;
	}
	
	
	
	
}
