package ESGI5.projetDDD.model;

public class Candidat {
	private String nom;
	private String techno;
	private int profil;
	
	public Candidat(String nom, String techno, int profil) {
		this.nom = nom;
		this.techno = techno;
		this.profil = profil;
	}

	public String getNom() {
		return nom;
	}

	public String getTechno() {
		return techno;
	}

	public int getProfil() {
		return profil;
	}
	
	
}
