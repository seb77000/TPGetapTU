package org.ldv.sio.getap;

import java.sql.Date;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class DemandeValidationConsoTempsAccPersTest extends TestCase {

	private DemandeValidationConsoTempsAccPers dvctap;

	@Before
	public void setUp() throws Exception {
		Classe classe = new Classe(1, "SIO 22");
		User eleve = new User(01L, "Nizar", "Ben Ragdel", classe, "eleve");
		User prof = new User(02L, "Olivier", "Capuozzo", classe, "professeur");
		Date date = Date.valueOf("2012-10-07");
		AccPersonalise accPers = new AccPersonalise(0, "Salon du libre", 0, 02L);

		dvctap = new DemandeValidationConsoTempsAccPers(01L, "2012-2013", date,
				240, prof, accPers, eleve);
	}

	@Test
	public void testAccepteEleveApresModifProf() {

		try {
			dvctap.CreeeParLeleve();
			dvctap.DateModifieProf();
			dvctap.AccepteEleveApresModifProf();

		} catch (DVCTAPException e) {
			throw new DVCTAPException("Changement impossible");
		}
	}

	public void testModifProf() {
		try {
			dvctap.CreeeParLeleve();
			dvctap.DateModifieProf();

		}

		catch (DVCTAPException e) {

			throw new DVCTAPException("Changement impossible");

		}

	}

	public void testValide() {
		try {
			dvctap.CreeeParLeleve();
			dvctap.DateModifieProf();
			dvctap.AccepteEleveApresModifProf();
			dvctap.ValideParProf();

		}

		catch (DVCTAPException e) {

			throw new DVCTAPException("Changement impossible");

		}
	}

	public void testRefusProf() {
		try {
			dvctap.CreeeParLeleve();
			dvctap.RefuseParProf();

		}

		catch (DVCTAPException e) {

			throw new DVCTAPException("Changement impossible");

		}
	}

	public void testAnnuleParEleve() {
		try {
			dvctap.CreeeParLeleve();
			dvctap.AnnuleeEleve();

		}

		catch (DVCTAPException e) {

			throw new DVCTAPException("Changement impossible");

		}
	}

	public void testRejete() {
		try {
			dvctap.CreeeParLeleve();
			dvctap.DateModifieProf();
			dvctap.RejeteeParLeleve();

		}

		catch (DVCTAPException e) {

			throw new DVCTAPException("Changement impossible");

		}
	}
}
