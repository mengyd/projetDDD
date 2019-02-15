package ESGI5.projetDDD.model.Entretien;

//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Date;

public class Entretien {
	
	private Candidat candidat;
	private Creneau creneau;
	private Consultant consultant;
	
	public Entretien (ArrayList<Consultant> consultantListe, Candidat candidat, Creneau creneau) {
		this.candidat = candidat;
		this.creneau = creneau;
		this.consultant = findFirst(filtrer(consultantListe));
	}
	
//	public void planifier(ArrayList<Consultant> consultantListe, Candidat candidat, Creneau creneau) {
//		this.candidat = candidat;
//		this.creneau = creneau;
//		this.consultant = findFirst(filtrer(consultantListe));
//	}
	
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

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	public Creneau getCreneau() {
		return creneau;
	}

	public void setCreneau(Creneau creneau) {
		this.creneau = creneau;
	}

	public Consultant getConsultant() {
		return consultant;
	}

	public void setConsultant(Consultant consultant) {
		this.consultant = consultant;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((candidat == null) ? 0 : candidat.hashCode());
		result = prime * result + ((consultant == null) ? 0 : consultant.hashCode());
		result = prime * result + ((creneau == null) ? 0 : creneau.hashCode());
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
		Entretien other = (Entretien) obj;
		if (candidat == null) {
			if (other.candidat != null)
				return false;
		} else if (!candidat.equals(other.candidat))
			return false;
		if (consultant == null) {
			if (other.consultant != null)
				return false;
		} else if (!consultant.equals(other.consultant))
			return false;
		if (creneau == null) {
			if (other.creneau != null)
				return false;
		} else if (!creneau.equals(other.creneau))
			return false;
		return true;
	}
	
	
	
}
