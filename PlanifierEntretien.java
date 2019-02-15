package ESGI5.projetDDD.use_case.Entretien;

import java.util.ArrayList;

import ESGI5.projetDDD.model.Entretien.Candidat;
import ESGI5.projetDDD.model.Entretien.Consultant;
import ESGI5.projetDDD.model.Entretien.Creneau;
import ESGI5.projetDDD.model.Entretien.Entretien;
import ESGI5.projetDDD.Exception.*;

public class PlanifierEntretien {
	public Candidat candidat;
	public Creneau creneau;
	public ArrayList<Consultant> consultantListe;
	
	public PlanifierEntretien () {	}
	
	public Candidat recupereCandidatParNom(ArrayList<Candidat> candidats, String nomCandidat) 
			throws NoCandidateMatchingException{
		try {
			for(Candidat candidat : candidats) {
				if(candidat.getNom() == nomCandidat ) 
					this.candidat = candidat;
			}
		
		}finally {} //ADD SOMETHING
		return this.candidat;
		
	}
	
	public ArrayList<Consultant> recupereListeConsultants(ArrayList<Consultant> consultants){
		this.consultantListe = consultants;
		return this.consultantListe;
	}



	public Entretien planifier(ArrayList<Consultant> consultants, Candidat candidat, Creneau creneau) {
		
		return new Entretien(this.consultantListe, this.candidat, this.creneau);
		
//		Entretien entretien = new Entretien();
//		entretien.planifier(this.consultantListe, this.candidat, this.creneau);
//		return entretien;
	}
	
}
