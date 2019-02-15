package ESGI5.projetDDD;

import ESGI5.projetDDD.Exception.NoCandidateMatchingException;
import ESGI5.projetDDD.model.Entretien.*;
import ESGI5.projetDDD.use_case.Entretien.*;
import junit.framework.TestCase;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;
import org.junit.Assert;


public class TestPlanifierEntretien extends TestCase {

	
	//recupereCandidatParNom
	@Test
	public void test_should_return_candidate() throws NoCandidateMatchingException {		
		
		ArrayList<Candidat> candidats = getListCandidats();
		PlanifierEntretien planifier = new PlanifierEntretien();
		Candidat candidat= new Candidat("Dubois", "Cedric",getListTechnos(Technos.JAVA, Technos.CSHARP) ,5);
		Assert.assertEquals(candidat, planifier.recupereCandidatParNom(candidats, "Dubois"));
		
		
	}
	
	//recupereCandidatParNom
		@Test
		public void test_should_not_return_candidate() throws NoCandidateMatchingException {		
			
			ArrayList<Candidat> candidats = getListCandidats();
			PlanifierEntretien planifier = new PlanifierEntretien();
			Candidat candidat= new Candidat("Bobois", "Cedric",getListTechnos(Technos.JAVA, Technos.CSHARP) ,5);
			Assert.assertThat(candidat, not(planifier.recupereCandidatParNom(candidats, "Dubois")));
			
			
		}
		
		
	//recupereListeConsultants
		@Test
		public void test_should_return_list_consultants() {		
			
			ArrayList<Consultant> consultants = getListConsultants();
			PlanifierEntretien planifier = new PlanifierEntretien();
			Assert.assertEquals(consultants, planifier.recupereListeConsultants(consultants));
			
			
		}
	
	public ArrayList<Consultant> getListConsultants(){
		
		ArrayList<Consultant> consultants = new ArrayList<Consultant>() ;
		
		//Consultant1
		Consultant consultant1 = new Consultant("Dubois", "Cedric",getListTechnos(Technos.JAVA, Technos.CSHARP) ,getDispos());
		consultants.add(consultant1);
		
		//Consultant2
		Consultant consultant2 = new Consultant("Bobois", "Sam",getListTechnos(Technos.JAVA, Technos.CPP) ,getDispos());
		consultants.add(consultant2);
				
		return consultants;
	}
	
	public ArrayList<Candidat> getListCandidats(){
		
		ArrayList<Candidat> candidats = new ArrayList<Candidat>() ;
		
		//candidat1
		Candidat candidat1 = new Candidat("Dubois", "Cedric",getListTechnos(Technos.JAVA, Technos.CSHARP) ,5);
		candidats.add(candidat1);
		
		//candidat2
		Candidat candidat2 = new Candidat("Bobois", "Sam",getListTechnos(Technos.JAVA, Technos.CPP) ,10);
		candidats.add(candidat2);
				
		return candidats;
	}
	
	public ArrayList<Technos> getListTechnos(Technos techno1, Technos techno2){
		ArrayList<Technos> technos = new ArrayList<Technos>() ;
		technos.add(techno1);
		technos.add(techno2);
		return technos;
	}
	
	public ArrayList<SimpleDateFormat> getDispos(){
		ArrayList<SimpleDateFormat> dates = new ArrayList<SimpleDateFormat>() ;
		SimpleDateFormat df = new SimpleDateFormat("01/07/19");
		dates.add(df);	
		return dates;
	}
}
