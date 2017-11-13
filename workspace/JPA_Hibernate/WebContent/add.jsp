<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajouter une personne</title>
</head>
<body>
	<f:view>
		<h:panelGrid columns="2" cellpadding="10">
			<h:outputLink value="list.jsf">
				<h:outputText value="Lister" />
			</h:outputLink>
			<h:outputLink value="add.jsf">
				<h:outputText value="Ajouter" />
			</h:outputLink>
		</h:panelGrid>
		<h:form>
			<h:panelGrid border="0" columns="3" cellpadding="5"> 
				<h:outputText value="Prénom" />
				<h:inputText id="firstName" value="#{personCtrl.newPerson.firstName}"/> 
				<h:message for="firstName" />
				<h:outputText value="Nom" />
				<h:inputText id="lastName" value="#{personCtrl.newPerson.lastName}"/> 
				<h:message for="lastName" />
				<h:outputText />
				<h:commandButton value="Ajouter" action="#{personCtrl.createPerson}" />
			</h:panelGrid>
		</h:form>
	</f:view>
</body>
</html>