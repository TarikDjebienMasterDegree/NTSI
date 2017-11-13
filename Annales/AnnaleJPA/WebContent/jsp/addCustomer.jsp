<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajouter un client</title>
</head>
<body>
	<f:view>
		<h:panelGrid columns="3" cellpadding="10">
			<h:outputLink value="../index.jsf">
				<h:outputText value="Home" />
			</h:outputLink>
			<h:outputLink value="listCustomers.jsf">
				<h:outputText value="Lister clients" />
			</h:outputLink>
			<h:outputLink value="addCustomer.jsf">
				<h:outputText value="Ajouter client" />
			</h:outputLink>
		</h:panelGrid>
		<h:form>
			<h:panelGrid border="0" columns="3" cellpadding="5"> 
				<h:outputText value="Name :" />
				<h:inputText id="name" value="#{CustomerController.newCustomer.name}"/> 
				<h:message for="name" />
				<h:outputText value="Car registration :" />
				<h:inputText id="carRegistration" value="#{CustomerController.newCustomer.carRegistration}"/> 
				<h:message for="carRegistration" />
				<h:outputText />
				<h:commandButton value="Add customer" action="#{CustomerController.createCustomer}" />
			</h:panelGrid>
		</h:form>
	</f:view>
</body>
</html>