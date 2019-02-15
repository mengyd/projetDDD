package ESGI5.projetDDD.model;

public class Consultant {
	private String nom;
	private String techno;
	private int profil;
	private String commentaire;
	
	public Consultant(String nom, String techno, int profil, String commentaire) {
		this.nom = nom;
		this.techno = techno;
		this.profil = profil;
		this.commentaire = commentaire;
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

	public String getCommentaire() {
		return commentaire;
	}

	public boolean peutTester(Candidat candidat) {
		return this.techno.equals(candidat.getTechno()) && this.profil >= candidat.getProfil();
	}
	
	public boolean estDisponible(Creneau creneau) {
		return false;
	}

}
