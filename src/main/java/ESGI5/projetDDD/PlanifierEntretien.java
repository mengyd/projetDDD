package ESGI5.projetDDD;


import java.util.Objects;

import ESGI5.projetDDD.model.*;

public class PlanifierEntretien implements IPlanifierEntretien{
	

	@Override
	public Entretien planifier(String nomCandidat, String dateEntretien) {
		// TODO Auto-generated method stub
		if(nomCandidat != null && dateEntretien != null) {
			return new Entretien(nomCandidat, dateEntretien);
		}
		return null;
	}
	
	public Consultant choisirConsultant(String nomConsultant) {
		if(nomConsultant != null) {
			return new Consultant(nomConsultant);
		}
		return null;
	}

	@Override
	public boolean technoCorrespond(String technoProfil, String technoConsultant) {
		return technoProfil.equals(technoConsultant);
	}

	@Override
	public boolean processCorrespond(String processEntretien, String processConsultant) {
		return processEntretien.equals(processConsultant);
	}

	@Override
	public boolean profilCorrecpond(String profilAttend, String profilConsultant) {
		return profilAttend.equals(profilConsultant);
	}

	@Override
	public String lireCommentaire(Consultant consultant) {
		consultant = new Consultant("Julien LAMBY");
		return consultant.commentaire;
	}
	

}
