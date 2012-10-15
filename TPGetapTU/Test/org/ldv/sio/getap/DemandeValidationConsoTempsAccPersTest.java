package org.ldv.sio.getap;

import java.sql.Date;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class DemandeValidationConsoTempsAccPersTest extends TestCase {

	private DemandeValidationConsoTempsAccPers dvctap;
/**
 * Initialisation de dvctap
 */
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
	/**
	 * Test du bon état de l'objet à sa création
	 */
	public void testEtatInitial() {
		assertTrue("Etat initial", dvctap.EtatInitial());
	}
	
	/**
	 * Test permettant de verifier le bon fonctionnement lors changement de la dvctap apres la modification du professeur
	 */
	public void testAccepteEleveApresModifProf() {

		try {
			dvctap.CreeeParLeleve();
			dvctap.DateModifieProf();
			dvctap.AccepteEleveApresModifProf();

		} catch (DVCTAPException e) {
			throw new DVCTAPException("Changement impossible");
		}
	}
	/**
	 * Test permettant de verifier si la modification de la date par le professeur fonctionne.
	 */
	public void testModifProf() {
		try {
			dvctap.CreeeParLeleve();
			dvctap.DateModifieProf();

		}

		catch (DVCTAPException e) {

			throw new DVCTAPException("Changement impossible");

		}

	}
	/**
	 * Test permettant de verifier si une dvctap peu etre valide par le professeur.
	 */
	public void testValide() {
		try {
			dvctap.CreeeParLeleve();
			dvctap.modifieeAPParLeProfesseur();
			dvctap.DateModifieProf();
			dvctap.AccepteEleveApresModifProf();
			dvctap.isDureeModifieProf();
			dvctap.ValideParProf();
			

		}

		catch (DVCTAPException e) {

			throw new DVCTAPException("Changement impossible");

		}
	}
	/**
	 * Test permettant de verifier si le refus d'une dvctap par un professeur est possible.
	 */
	public void testRefusProf() {
		try {
			dvctap.CreeeParLeleve();
			dvctap.RefuseParProf();

		}

		catch (DVCTAPException e) {

			throw new DVCTAPException("Changement impossible");

		}
	}
	/**
	 * Test permettant de verifier si l'élève peu annule sa demande
	 */
	public void testAnnuleParEleve() {
		try {
			dvctap.CreeeParLeleve();
			dvctap.AnnuleeEleve();

		}

		catch (DVCTAPException e) {

			throw new DVCTAPException("Changement impossible");

		}
	}
	/**
	 * Test permettant de verifier si l'utilisateur peu rejete une demande.
	 */
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
