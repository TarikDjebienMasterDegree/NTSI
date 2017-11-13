package metier;

import java.util.HashMap;

import bean.ListeClients;
import bean.Personne;

public class MetierPersonne {
	
	private static ListeClients personnesInstance;

	/**
	 * initialise la liste des clients référencés
	 * @return
	 */
	public static ListeClients getPersonnes() { 
		if (personnesInstance == null) {
			personnesInstance = new ListeClients();

			Personne personne1 = new Personne(); 
			personne1.setLogin("test"); 
			personne1.setPassword("test"); 
			personne1.setNom("Test"); 
			personne1.setPrenom("Test");

			Personne personne2 = new Personne(); 
			personne2.setLogin("root"); 
			personne2.setPassword("root"); 
			personne2.setNom("Root"); 
			personne2.setPrenom("Root");

			Personne personne3 = new Personne(); 
			personne3.setLogin("admin"); 
			personne3.setPassword("admin"); 
			personne3.setNom("Admin"); 
			personne3.setPrenom("Admin"); 
			personne3.setProfil("ADMIN");

			HashMap<String, Personne> listePersonne = new HashMap<String, Personne>(); 
			listePersonne.put(personne1.getLogin() + personne1.getPassword(), personne1); 
			listePersonne.put(personne2.getLogin() + personne2.getPassword(), personne2); 
			listePersonne.put(personne3.getLogin() + personne3.getPassword(), personne3);
			
			personnesInstance.setListePersonne(listePersonne);
		}
		
		return personnesInstance;
	}
	
	/**
	 * Methode qui retourne une Personne à partir de son login et password
	 * @param login
	 * @param password
	 * @return
	 */
	public static Personne getPersonne(String login, String password){
		Personne personne = null;
		String key = login + password;
		personne = getPersonnes().getListePersonne().get(key);
		return personne;
	}

}
