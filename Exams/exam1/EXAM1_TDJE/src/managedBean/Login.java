package managedBean;

import metier.MetierPersonne;

public class Login {
	
	/**
	 * Login de la personne
	 */
	private String login;
	
	/**
	 * Mot de passe de la personne
	 */
	private String password;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Vérifier si la personne existe dans la liste des clients et rediriger vers une page success ou error.
	 * @return
	 */
	public String validate() {
		if(MetierPersonne.getPersonne(login, password) != null){
			return "LoginSuccess";
		}else{
			return "LoginError";
		}
	}
	
}
