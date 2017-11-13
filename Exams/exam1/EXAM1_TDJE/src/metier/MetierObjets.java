package metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import bean.ListeObjets;
import bean.Objet;

public class MetierObjets {

	private static ListeObjets listeObjets;


	/**
	 * initialise la liste des objets référencés
	 * @return
	 */
	public static ListeObjets getListeObjets() {
		if(listeObjets == null){
			listeObjets = new ListeObjets();
			
			Objet objet1 = new Objet();
			long maDate = new Date().getTime();
			objet1.setId("1");
			objet1.setLogin("test");
			objet1.setDateAcquisition(new Date(maDate-9000000000l)); 
			objet1.setLibelle("Guitare"); 
			objet1.setValeurNeuf(150.99f);
			
			Objet objet2 = new Objet();
			objet2.setId("1");
			objet2.setLogin("test");
			objet2.setDateAcquisition(new Date(maDate-2000000000)); 
			objet2.setLibelle("Table"); 
			objet2.setValeurNeuf(334.54f);
			
			Objet objet3 = new Objet();
			objet3.setId("3");
			objet3.setLogin("test");
			objet3.setDateAcquisition(new Date(maDate-1000000000)); 
			objet3.setLibelle("4 chaises"); 
			objet3.setValeurNeuf(122.21f);
			
			Objet objet4 = new Objet();
			objet4.setId("4");
			objet4.setLogin("test");
			objet4.setDateAcquisition(new Date(maDate-45000000000l)); 
			objet4.setLibelle("DVD");
			objet4.setValeurNeuf(13.87f);
			
			Objet objet5 = new Objet();
			objet5.setId("5");
			objet5.setLogin("test");
			objet5.setDateAcquisition(new Date(maDate-230000000000l)); 
			objet5.setLibelle("TV écran plat full HD"); 
			objet5.setValeurNeuf(-1120f);
			
			Objet objet6 = new Objet();
			objet6.setId("6");
			objet6.setLogin("root");
			objet6.setDateAcquisition(new Date(maDate-72000000000l)); 
			objet6.setLibelle("Voiture"); 
			objet6.setValeurNeuf(-20354.54f);
			
			ArrayList<Objet> objets = new ArrayList<Objet>(); 
			objets.add(objet1);
			objets.add(objet2);
			objets.add(objet3);
			objets.add(objet4);
			objets.add(objet5);
			objets.add(objet6);
			
			listeObjets.setListeObjets(objets); 
		}
		return listeObjets;
	}
	
	/**
	 * Accesseur pour la liste des objets disponibles
	 * @param pLogin
	 * @return
	 */
	public static List<Objet> getObjets(String pLogin){
		List<Objet> objets = new ArrayList<Objet>();
		for(Objet objet : getListeObjets().getListeObjets()){
			if(objet.getLogin()!=null && objet.getLogin().equalsIgnoreCase(pLogin)){
				objets.add(objet);
			}
		}
		return objets;
	}
	
	/**
	 * Mutateur pour la liste des objets disponibles
	 * @param pListeObjets
	 */
	public static void setListeObjets(ListeObjets pListeObjets){
		listeObjets.setListeObjets(pListeObjets.getListeObjets());
	}
}
