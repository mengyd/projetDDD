package ESGI5.projetDDD;

import ESGI5.projetDDD.model.Candidat;

public interface IPlanifierEntretien {
	public Candidat candidat = new Candidat();
	public void getCandidat();
	public void choisirDate();
}
