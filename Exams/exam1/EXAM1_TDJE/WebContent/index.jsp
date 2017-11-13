<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="html"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="core"%>

<%-- L'I18N ne fonctionne pas, les fichiers de ressources properties n'arrive pas à se charge dans le bundle --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page d'acceuil</title>
</head>
<body>
	<core:view>
		<html:outputText value="Bienvenue sur le site de troc, nous vous proposons les services suivants :"/>
<%-- 		<html:outputText value="#{msg['index.welcome']}" /> --%>
		<ul>
			<li><html:outputText value="consultation de vos objets"/></li>
<%-- 			<li><html:outputText value="#{msg['index.show']}"/></li> --%>
			
			<li><html:outputText value="la possibilité d'effectuer des échanges"/></li>
<%-- 			<li><html:outputText value="#{msg['index.exchange']}"/></li> --%>
		</ul>
		<html:outputLink value="login.jsp">
			<html:outputText value="Bonne navigation!"/>
		</html:outputLink>
<%-- 		<html:outputLink value="login.jsp"> --%>
<%-- 			<html:outputText value="#{msg['index.link']}"/> --%>
<%-- 		</html:outputLink> --%>
	</core:view>
</body>
</html>