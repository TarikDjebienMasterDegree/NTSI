<%@page import="util.UtilValidate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel=stylesheet type="text/css" href="css/styles.css">
<title>NTSI - TP1 - JSP JSTL</title>
</head>

<body>

	<div class="titre"><c:out value="${catalogue.nom}"/></div>
	<br />
	<c:forEach var="products" items="${catalogue.listProduit}" >
		<c:set var="product" value="${products.value}" />
		<div class="produit">
		<table>
			<tr>
				<td rowspan="2">
				<c:if test="${not empty product.image}">
					<img src="<c:out value="${product.image}" />" />
				</c:if>
				</td>
				<td><a class="nom" href="/NTSI_TP1/AfficheProduit?id=<c:out value="${product.id}" />">
						<c:out value="${product.nom}" /></a></td>
			</tr>
			<tr>
				<td class="prix"><c:out value="${product.prix}" />&nbsp;&euro;</td>
			</tr>
			<tr>
				<td colspan="2" class="desc">
				<c:if test="${not empty product.description}">
					<c:out value="${product.description}" />
				</c:if>
				</td>
			</tr>
		</table>
		</div>
	</c:forEach>
	
</body>
</html>