package ESGI5.projetDDD;

import org.junit.Test;

import ESGI5.projetDDD.model.Entretien;
import junit.framework.TestCase;

public class TestIPlanifierEntretien extends TestCase {

	@Test
	public void testPlanifier_verifierDate() {
		Entretien entretien = new Entretien("Dubois", "2019-09-09");
		
		PlanifierEntretien planifierEntretien = new PlanifierEntretien();
		Entretien entretienTest = planifierEntretien.planifier("Dubois", "2019-09-09");
		
		assertEquals(entretien.dateEntretien, entretienTest.dateEntretien);
	}
	
	@Test
	public void testPlanifier_VerifierNom() {
		PlanifierEntretien planifierEntretien = new PlanifierEntretien();
		Entretien entretienTest = planifierEntretien.planifier("Dubois", "2019-09-09");
		
		assertNotNull("Pas de nom de cadidat !", entretienTest.nomCandidat);
	}
}
