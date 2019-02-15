package ESGI5.projetDDD.use_case;

import java.util.ArrayList;

import ESGI5.projetDDD.model.*;

public class PlanifierEntretien {
	public Candidat candidat;
	public Creneau creneau;
	public ArrayList<Consultant> consultantListe;
	
	public PlanifierEntretien (Candidat candidat, Creneau creneau , ArrayList<Consultant> consultantListe) {
		this.candidat = candidat;
		this.creneau = creneau;
		this.consultantListe = consultantListe;
	}


	public Entretien planifier() {
		Entretien entretien = new Entretien();
		entretien.planifier(this.consultantListe, this.candidat, this.creneau);
		return entretien;
	}
	
}
