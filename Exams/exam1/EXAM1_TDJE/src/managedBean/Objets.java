package managedBean;

import java.util.List;

import javax.faces.context.FacesContext;

import metier.MetierObjets;

import bean.Objet;


public class Objets {
	
	/**
	 * Recupere les objets de la personne connecté
	 * @return
	 */
	public List<Objet> getObjets() {
		String login = getLoginValue();
		return MetierObjets.getObjets(login);
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

}
