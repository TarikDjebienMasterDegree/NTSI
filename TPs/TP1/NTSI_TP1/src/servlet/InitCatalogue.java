package servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Catalogue;
import bean.Produit;

/**
 * Servlet implementation class InitCatalogue
 */
public class InitCatalogue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitCatalogue() {
        super();
        
        Produit produit1 = new Produit();
        produit1.setId("P1");
        produit1.setNom("Téléviseur LCD 100 Hz LG 32CS460 (81cm)"); 
        produit1.setPrix(359.99f);
        
        Produit produit2 = new Produit();
        produit2.setId("P2");
        produit2.setNom("Téléviseur LCD 100 Hz LG 32CS460 (81cm)");
        produit2.setPrix(259.99f);
        produit2.setImage("http://i2.cdscdn.com/pdt2/4/1/8/1/180x180/lg8808992995418.jpg"); 
        produit2.setDescription("TELEVISEUR LCD 32\" ( 82 cm ) - Tuner TNT HD - HDTV - Résolution : 1366 x 768 - MCI 100Hz - 2 prises HDMI - Port USB 2.0 ...");
        
        Produit produit3 = new Produit();
        produit3.setId("P3");
        produit3.setNom("PHILIPS 52PFL7203H"); 
        produit3.setImage("http://i2.cdscdn.com/pdt2/3/0/0/1/180x180/samsu60es6300.jpg"); 
        produit3.setDescription("Téléviseur LED 3D 60'' ( 152 cm ) - Triple tuner HD : TNT / Câble et Satellite - HDTV 1080p - Résolution 1920 x 1080 - CMR 200Hz"); 
        produit3.setPrix(1749.99f);
        
        Produit produit4 = new Produit();
        produit4.setId("P4");
        produit4.setNom("THOMSON 50FU6663 TV LED 3D"); 
        produit4.setImage("http://i2.cdscdn.com/pdt2/1/7/4/1/115x115/tho5901292501174.jpg"); 
        produit4.setPrix(499.99f);
        
        HashMap<String, Produit> listProduit = new HashMap<String, Produit>();
        listProduit.put(produit1.getId(), produit1); 
        listProduit.put(produit2.getId(), produit2); 
        listProduit.put(produit3.getId(), produit3); 
        listProduit.put(produit4.getId(), produit4);
        
        Catalogue catalogue = Catalogue.getInstance(); 
        catalogue.setNom("Catalogue"); 
        catalogue.setListProduit(listProduit);
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		new InitCatalogue();
		System.out.println("Catalogue initialisé");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
