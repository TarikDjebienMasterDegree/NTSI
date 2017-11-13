package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Catalogue;
import bean.Produit;

/**
 * Servlet implementation class AfficheProduit
 */
public class AfficheProduit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficheProduit() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Get the product with his productId
		String productId = request.getParameter("id");
		Produit product = this.getProduct(productId);
		
		//Write the HTML content in the out stream
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<link rel=stylesheet type='text/css' href='/miagetp1/css/styles.css'>");
		out.println("<div class='produit'>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td rowspan='2'>");
		out.println("<img src="+product.getImage()+"/>");
		out.println("</td>");
		out.println("<td class='nom'>");
		out.println(product.getNom());
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td class='prix'>");
		out.println(product.getPrix()+"&nbsp;&euro");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td colspan='2' class='desc'>");
		out.println(product.getDescription());
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</div>");
		out.println("<form method='get' action='AjouteAuPanier'>");
		out.println("<input type='hidden' name='id' value="+product.getId()+">");
		out.println("<input type='submit' value='ajouter au panier'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
	
	private Produit getProduct(String productId) {
		return Catalogue.getInstance().getListProduit().get(productId);
	}

}
