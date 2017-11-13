package managedBean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import metier.MetierObjets;
import metier.MetierPersonne;
import bean.Objet;
import bean.Personne;


public class Echange {
	
	/**
	 * Notre objet que l'on souhaite echanger
	 */
	private String objectSelected;
	
	/**
	 * Le client avec lequel on souhaite effectuer l'echange
	 */
	private String clientSelected;
	
	/**
	 * L'objet que l'on souhaite acquerir
	 */
	private String exchangeSelected;
	
	
	
	/**
	 * Recupere la liste de ses objets
	 * @return
	 */
	public Collection<SelectItem> getObjectSelectedValue() {
		String login = getLoginValue();
		List<Objet> objetsPersonne = MetierObjets.getObjets(login);
		Collection<SelectItem> getObjectSelectedValue = new ArrayList<SelectItem>();
		for(Objet obj : objetsPersonne){
			getObjectSelectedValue.add(new SelectItem(obj.getLibelle()));
		}
		return getObjectSelectedValue;
	}
	
	/**
	 * Recupere la liste des objet d'un client
	 * @param pLogin
	 * @return
	 */
	public Collection<SelectItem> getObjectSelectedValueForClient(String pLogin) {
		List<Objet> objetsPersonne = MetierObjets.getObjets(pLogin);
		Collection<SelectItem> getObjectSelectedValue = new ArrayList<SelectItem>();
		for(Objet obj : objetsPersonne){
			getObjectSelectedValue.add(new SelectItem(obj.getLibelle()));
		}
		return getObjectSelectedValue;
	}
	
	public void setObjectSelected(String objectSelected) {
		this.objectSelected = objectSelected;
	}
	
	/**
	 * Recupere la liste des clients disponibles
	 * @return
	 */
	public Collection<SelectItem> getClientSelectedValue() {
		HashMap<String, Personne> listePersonne = MetierPersonne.getPersonnes().getListePersonne();
		Collection<SelectItem> getClientSelectedValue = new ArrayList<SelectItem>();
		for(String name : listePersonne.keySet()){
			getClientSelectedValue.add(new SelectItem(listePersonne.get(name).getLogin()));
		}
		return getClientSelectedValue;
	}
	
	public Collection<SelectItem> getClientSelectedList() {
		Collection<SelectItem> clientSelectedListNew = getObjectSelectedValueForClient(clientSelected);
		return clientSelectedListNew;
	}

	
	
	/**
	 * récupérer le login dans le managedBean
	 * @return
	 */
	public String getLoginValue() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		Login login = (Login) facesContext.getExternalContext().getSessionMap().get("loginManagedBean"); 
		return login.getLogin();
	}
	
	public String voirListeObjet(){
		getClientSelectedList();
		return null;
	}
	
	public String getObjectSelected() {
		return objectSelected;
	}
	
	public String getExchangeSelected() {
		return exchangeSelected;
	}
	public void setExchangeSelected(String exchangeSelected) {
		this.exchangeSelected = exchangeSelected;
	}
	
	public String getClientSelected() {
		return clientSelected;
	}
	
	public void setClientSelected(String clientSelected) {
		this.clientSelected = clientSelected;
	}

}
