package managedBean;

import java.util.ArrayList;

import javax.faces.component.UIData;
import javax.faces.component.UISelectBoolean;
import javax.faces.component.html.HtmlOutputText;

import metier.MetierCatalogue;
import bean.Livre;

public class ListeLivres {

	private UISelectBoolean checkbox;
	private UIData dataTable;
	private HtmlOutputText login;
	private HtmlOutputText idLivre;

	public UISelectBoolean getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(UISelectBoolean checkbox) {
		this.checkbox = checkbox;
	}

	public UIData getDataTable() {
		return dataTable;
	}

	public void setDataTable(UIData dataTable) {
		this.dataTable = dataTable;
	}

	public HtmlOutputText getLogin() {
		return login;
	}

	public void setLogin(HtmlOutputText login) {
		this.login = login;
	}

	public HtmlOutputText getIdLivre() {
		return idLivre;
	}

	public void setIdLivre(HtmlOutputText idLivre) {
		this.idLivre = idLivre;
	}

	public ArrayList<Livre> getLivres() {
		ArrayList<Livre> livres = MetierCatalogue.getLivreNonEmprunte();
		return livres;
	}

	public String getIdLivreValue() {
		return (String) idLivre.getAttributes().get("idLivre");
	}

	public String getLoginValue() {
		return (String) login.getAttributes().get("login");
	}

	public String emprunterLivres() {
		System.out.println(login.getValue());
		int size = this.dataTable.getRowCount();
		ArrayList<Livre> livres = MetierCatalogue.getCatalogue() .getListeLivre();
		for (int i = 0; i < size; i++) { 
			this.dataTable.setRowIndex(i);
			if (this.checkbox.isSelected()) { 
				for (Livre livre : livres) {
					if (getIdLivreValue().equals(livre.getId())){ 
						livre.setEmprunteur(getLoginValue());
					} 
				}
			} 
		}
		dataTable.setRowIndex(-1);
		return null ;
	}
	

}
