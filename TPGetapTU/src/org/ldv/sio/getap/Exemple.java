package org.ldv.sio.getap;

import java.sql.Date;

public class Exemple {

	public static void main(String Args[]) {

		Classe classe = new Classe(1, "SIO 22");
		User eleve = new User(01L, "Nizar", "Ben Ragdel", classe, "eleve");
		User prof = new User(02L, "Olivier", "Capuozzo", classe, "professeur");
		Date date = Date.valueOf("2012-10-07");
		AccPersonalise accPers = new AccPersonalise(0, "Salon du libre", 0, 02L);

		DemandeValidationConsoTempsAccPers dvctap = new DemandeValidationConsoTempsAccPers(
				01L, "2012-2013", date, 240, prof, accPers, eleve, 0);
		
		System.out.println(dvctap);
		dvctap.setEtat(4);
		System.out.println(dvctap);
		dvctap.setEtat(32);
		System.out.println(dvctap);
		dvctap.setEtat(4);
		System.out.println(dvctap);
		dvctap.setEtat(2048);
		System.out.println(dvctap);
		dvctap.setEtat(2);
		System.out.println(dvctap);
		dvctap.setEtat(32);
		System.out.println(dvctap);

	}
}