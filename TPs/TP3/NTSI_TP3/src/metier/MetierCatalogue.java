package metier;

import java.util.ArrayList;

import bean.Catalogue;
import bean.Livre;

public class MetierCatalogue {
	
	private static Catalogue catalogue;

	public static Catalogue getCatalogue() { 
		
		if(catalogue == null){

			catalogue = new Catalogue();
			Livre livre1 = new Livre(); 
			livre1.setId("1");
			livre1.setTitre("Légendes de Troy, T1");
			livre1.setAuteur("Keramidas, Arleston, Melanyn"); 
			livre1.setImage("http://www.fnac.com/Img/V2/homes/ACC/2481489_110x150.png"); 
			livre1.setResume("Une nouvelle série permettant à de grands dessinateurs d'explorer le vaste univers de Troy... Nicolas Keramidas ouvre le bal.");

			Livre livre2 = new Livre();
			livre2.setId("2");
			livre2.setTitre("Le kama-sutra magique");
			livre2.setAuteur("Stella Damiana"); 
			livre2.setImage("http://www.fnac.com/Img/V2/homes/ACC/2502872_110x150.png"); 
			livre2.setResume("Grâce au kama-sutra magique... passez une Saint Valentin pimentée ! (Bon, nous avons aussi d'autres remèdes en magasin...)");

			Livre livre3 = new Livre();
			livre3.setId("3");
			livre3.setTitre("La Conspiration du Temple");
			livre3.setAuteur("Steve Berry"); 
			livre3.setImage("http://www.fnac.com/Img/V2/homes/ACC/2516350_110x150.png"); 
			livre3.setResume("Steve Berry au meilleur de sa forme pour son grand retour. Quand trembler fait du bien...");

			Livre livre4 = new Livre();
			livre4.setId("4");
			livre4.setTitre("Comment améliorer son destin");
			livre4.setAuteur("Lise Bartoli"); 
			livre4.setImage("http://www.fnac.com/Img/V2/homes/ACC/2494629_110x150.png"); 
			livre4.setResume("Le destin existe, mais il n'est pas responsable de tout. On peut l'améliorer. Voici comment...");

			Livre livre5 = new Livre();
			livre5.setId("5");
			livre5.setTitre("Un mensonge sur mon père");
			livre5.setAuteur("John Burnside"); 
			livre5.setImage("http://www.fnac.com/Img/V2/homes/ACC/2501551_110x150.png"); 
			livre5.setResume("Un grand livre sur le mensonge paternel, par John Burnside, l'éblouissant romancier écossais.");

			Livre livre6 = new Livre();
			livre6.setId("6");
			livre6.setTitre("Le petit Spirou, T14");
			livre6.setAuteur("Janry, Tome"); 
			livre6.setImage("http://www.fnac.com/Img/V2/homes/ACC/2514274_76x110.gif");
			
			ArrayList<Livre> listeLivre = new ArrayList<Livre>(); 
			listeLivre.add(livre1);
			listeLivre.add(livre2);
			listeLivre.add(livre3);
			listeLivre.add(livre4); 
			listeLivre.add(livre5); 
			listeLivre.add(livre6);
			catalogue.setListeLivre(listeLivre); 
		}
		
		return catalogue;

	}
	
	public static ArrayList<Livre> getLivreEmprunte(String login) {
		ArrayList<Livre> livreEmprunte = new ArrayList<Livre>();
		for(Livre livre : getCatalogue().getListeLivre()){
			if(livre.getEmprunteur().equalsIgnoreCase(login)){
				livreEmprunte.add(livre);
			}
		}
		return livreEmprunte;
	}
	
	public static ArrayList<Livre> getLivreNonEmprunte(){
		ArrayList<Livre> livreNonEmprunte = new ArrayList<Livre>();
		for(Livre livre : getCatalogue().getListeLivre()){
			if(livre.getEmprunteur() == null || livre.getEmprunteur().equalsIgnoreCase("")){
				livreNonEmprunte.add(livre);
			}
		}
		return livreNonEmprunte;
	}
}
