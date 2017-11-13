<%@page import="util.UtilValidate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=stylesheet type="text/css" href="css/styles.css">
<title>NTSI - TP1 - JSP Scriplet</title>
</head>

<%@ page import="bean.*" %>
<%
   Catalogue catalogue = (Catalogue) request.getAttribute("catalogue");
%>
<body>

	<div class="titre"><%=catalogue.getNom() %></div>
	<br />
	
	<% for (String productName : catalogue.getListProduit().keySet()) { %>
		<div class="produit">
		<% Produit product = catalogue.getListProduit().get(productName); %>
		<table>
			<tr>
				<td rowspan="2">
				<% if (UtilValidate.exist(product.getImage())) { %>
					<img src="<%=product.getImage() %>" />
				<% } %>
				</td>
				<td><a class="nom" href="/NTSI_TP1/AfficheProduit?id=<%=product.getId()%>">
						<%=product.getNom() %></a></td>
			</tr>
			<tr>
				<td class="prix"><%=product.getPrix() %>&nbsp;&euro;</td>
			</tr>
			<tr>
				<td colspan="2" class="desc">
				<% if (UtilValidate.exist(product.getDescription())) { %>
					<%=product.getDescription() %>
				<% } %>
				</td>
			</tr>
		</table>
		</div>
	<% } %>
	
</body>
</html>