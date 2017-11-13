package bean;

import java.util.Date;

public class Objet {
	
	private String id;
	private String login;
	private Date dateAcquisition;
	private String libelle;
	private Float valeurNeuf;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public Date getDateAcquisition() {
		return dateAcquisition;
	}
	public void setDateAcquisition(Date dateAcquisition) {
		this.dateAcquisition = dateAcquisition;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Float getValeurNeuf() {
		return valeurNeuf;
	}
	public void setValeurNeuf(Float valeurNeuf) {
		this.valeurNeuf = valeurNeuf;
	}

}
