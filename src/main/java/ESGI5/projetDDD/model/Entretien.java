package ESGI5.projetDDD.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Entretien {
	public String nomCandidat;
	public Date dateEntretien;
	public Entretien(String nomCandidat, String dateEntretien) {
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = null;

		try {
			date = simpleDateFormat.parse(dateEntretien);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.nomCandidat = nomCandidat;
		this.dateEntretien = date;
	}
}
