package bean;

import java.util.HashMap;

public class ListeClients {
	
	private HashMap<String, Personne> listePersonne;

	public HashMap<String, Personne> getListePersonne() {
		return listePersonne;
	}

	public void setListePersonne(HashMap<String, Personne> listePersonne) {
		this.listePersonne = listePersonne;
	}
	
}
