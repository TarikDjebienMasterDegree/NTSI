package managedBean;

import metier.MetierPersonnes;

public class Login {
	
	private String login;
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
	
	public String validate() {
		if(MetierPersonnes.getPersonne(login, password) != null){
			return "LoginSuccess";
		}else{
			return "LoginError";
		}
	}
	
}
