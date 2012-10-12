package org.ldv.sio.getap;

import java.sql.Date;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class DemandeValidationConsoTempsAccPersTest extends TestCase{
	
	private DemandeValidationConsoTempsAccPers dvctap;
	
	
	@Before
	public void setUp() throws Exception {
		Classe classe = new Classe(1, "SIO 22");
		User eleve = new User(01L, "Nizar", "Ben Ragdel", classe, "eleve");
		User prof = new User(02L, "Olivier", "Capuozzo", classe, "professeur");
		Date date = Date.valueOf("2012-10-07");
		AccPersonalise accPers = new AccPersonalise(0, "Salon du libre", 0, 02L);

		dvctap = new DemandeValidationConsoTempsAccPers(01L, "2012-2013", date, 240, prof, accPers, eleve, 0);
	}

	@Test
	public void test() {
		dvctap.CreeeParLeleve();
		System.out.println(dvctap);
		


	}
}