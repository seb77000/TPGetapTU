package org.ldv.sio.getap;

import java.security.AccessControlException;
import java.sql.Date;

	
public class Exemple {	
	
	Classe classe= new Classe(1, "SIO22");
	User eleve= new User(1l, "Nizar", "Ben Ragdel", classe, "eleve");
	User prof= new User(2l, "Olvier", "Capuozzo" , classe, "professeur");
	Date date= Date.valueOf("2012-10-07");
	AccPersonalise accPers= new AccPersonalise(0, "Salon du libre",0, 2l);

DemandeValidationConsoTempsAccPers dvctap = new DemandeValidationConsoTempsAccPers(1l, "2012", date, 40, prof, accPers, eleve,0);

	

}
