package ESGI5.projetDDD;

import ESGI5.projetDDD.model.*;


public interface IPlanifierEntretien {
	public Entretien planifier(String nomCandidat, String dateEntretien);
	public Consultant choisirConsultant(String nomConsultant);
	public boolean technoCorrespond(String technoProfil, String technoConsultant);
	public boolean processCorrespond(String processEntretien, String processConsultant);
	public boolean profilCorrecpond(String profilAttend, String profilConsultant);
	public String lireCommentaire(Consultant consultant);
}
