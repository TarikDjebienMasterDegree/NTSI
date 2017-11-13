package bean;

import java.util.HashMap;

public class Catalogue {
	
	private static Catalogue catalogue;
	private String nom;
	private HashMap<String, Produit> listProduit;
	
	public static Catalogue getInstance(){
		if(catalogue == null){
			catalogue = new Catalogue();
		}
		return catalogue;
	}

	public static Catalogue getCatalogue() {
		return catalogue;
	}

	public static void setCatalogue(Catalogue catalogue) {
		Catalogue.catalogue = catalogue;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public HashMap<String, Produit> getListProduit() {
		return listProduit;
	}

	public void setListProduit(HashMap<String, Produit> listProduit) {
		this.listProduit = listProduit;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((listProduit == null) ? 0 : listProduit.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Catalogue other = (Catalogue) obj;
		if (listProduit == null) {
			if (other.listProduit != null)
				return false;
		} else if (!listProduit.equals(other.listProduit))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	
	

}
