package ESGI5.projetDDD.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Entretien {
	
	private Candidat candidat;
	private Creneau creneau;
	private Consultant consultant;
	
	public Entretien () {
	}
	
	public void planifier(ArrayList<Consultant> consultantListe, Candidat candidat, Creneau creneau) {
		this.candidat = candidat;
		this.creneau = creneau;
		this.consultant = findFirst(filtrer(consultantListe));
	}
	
	//Filtrer les consultants qui peut tester le candidat
	public ArrayList<Consultant> filtrer(ArrayList<Consultant> consultantListe) {
		ArrayList<Consultant> consultantFiltre = null;
		for(Consultant consultant : consultantListe) {
			if(consultant.peutTester(this.candidat)) {
				consultantFiltre.add(consultant);
			}
		}
		return consultantFiltre;
	}
	
	//Trouvé le premier consultant disponible par rapport au créneau
	public Consultant findFirst(ArrayList<Consultant> consultantListe) {
		for(Consultant consultant : consultantListe) {
			if(consultant.estDisponible(this.creneau)) {
				return consultant;
			}
		}
		return null;
	}
	
}
