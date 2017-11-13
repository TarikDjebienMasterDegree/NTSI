<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajouter un garagiste</title>
</head>
<body>
	<f:view>
		<h:panelGrid columns="3" cellpadding="10">
			<h:outputLink value="../index.jsf">
				<h:outputText value="Home" />
			</h:outputLink>
			<h:outputLink value="listMechanics.jsf">
				<h:outputText value="Lister garagistes" />
			</h:outputLink>
			<h:outputLink value="addMechanic.jsf">
				<h:outputText value="Ajouter garagiste" />
			</h:outputLink>
		</h:panelGrid>
		<h:form>
			<h:panelGrid border="0" columns="3" cellpadding="5"> 
				<h:outputText value="Name :" />
				<h:inputText id="name" value="#{MechanicController.newMechanic.name}"/> 
				<h:message for="name" />
				<h:outputText value="Garage Name :" />
				<h:inputText id="garageName" value="#{MechanicController.newMechanic.garageName}"/> 
				<h:message for="garageName" />
				<h:outputText value="Address :" />
				<h:inputText id="address" value="#{MechanicController.newMechanic.address}"/> 
				<h:message for="address" />
				<h:outputText value="Postal Code :" />
				<h:inputText id="postalCode" value="#{MechanicController.newMechanic.postalCode}"/> 
				<h:message for="postalCode" />
				<h:outputText value="City :" />
				<h:inputText id="city" value="#{MechanicController.newMechanic.city}"/> 
				<h:message for="city" />
				<h:outputText />
				<h:commandButton value="Add mechanic" action="#{MechanicController.createMechanic}" />
			</h:panelGrid>
		</h:form>
	</f:view>
</body>
</html>