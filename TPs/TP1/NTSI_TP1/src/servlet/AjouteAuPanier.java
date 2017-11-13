package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.UtilShoppingCart;

/**
 * Servlet implementation class AjouteAuPanier
 */
public class AjouteAuPanier extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjouteAuPanier() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productId = (String) request.getAttribute("id");
		Cookie clientShoppingCart = UtilShoppingCart.getClientCookieInRequest(request, UtilShoppingCart.SHOPPING_CART_NAME);
		Cookie newShoppingCart = null;
		if( clientShoppingCart != null){
			newShoppingCart = UtilShoppingCart.addProductInShoppingCart(productId, clientShoppingCart);
		}else{
			Cookie oldShoppingCart = UtilShoppingCart.createCookie(UtilShoppingCart.SHOPPING_CART_NAME, 3600);
			newShoppingCart = UtilShoppingCart.addProductInShoppingCart(productId, oldShoppingCart);
		}
		response.addCookie(newShoppingCart);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
