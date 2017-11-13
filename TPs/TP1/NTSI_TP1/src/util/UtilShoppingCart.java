package util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UtilShoppingCart {
	
	public static final String SHOPPING_CART_NAME = "panier";
	
	public static Cookie getClientCookieInRequest(HttpServletRequest request, String cookieName){
		Cookie[] cookies = request.getCookies();
		for(int i=0; i < cookies.length; i++) {
			Cookie monCookie = cookies[i];
			if (monCookie.getName().equals(cookieName)) {
				return monCookie;
			} 
		}
		return null;
	}
	
	public static Cookie createCookie(String cookieName, int timeOut){
		Cookie cookie = new Cookie(cookieName,null);
		cookie.setMaxAge(timeOut);// 1heure = 3600sec
		return cookie;
	}
	
	public static Cookie addProductInShoppingCart(String productId, Cookie shoppingCart){
		String oldValue = shoppingCart.getValue();
		StringBuilder newValue = new StringBuilder().append(oldValue).append(";").append(productId);
		shoppingCart.setValue(newValue.toString());
		return shoppingCart;
	}

	public static void removeShoppingCart(HttpServletRequest request,
			HttpServletResponse response) {
		Cookie newShoppingCart = getClientCookieInRequest(request, SHOPPING_CART_NAME);
		newShoppingCart.setMaxAge(0);
		response.addCookie(newShoppingCart);
	}

}
