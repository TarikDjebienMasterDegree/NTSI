<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des clients</title>
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
			<h:dataTable border="0" rules="all" value="#{CustomerController.customers}" var="c">
				<h:column>
					<f:facet name="header">
						<h:outputText value="id" />
					</f:facet>
					<h:outputText value="#{c.id}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Name" />
					</f:facet>
					<h:outputText value="#{c.name}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="carRegistration" />
					</f:facet>
					<h:outputText value="#{c.carRegistration}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Opérations" />
					</f:facet>
					<h:commandButton value="Modifier"
						action="#{CustomerController.editerCustomer}" />
					<h:commandButton value="Supprimer"
						action="#{CustomerController.deleteCustomer}" />
				</h:column>
			</h:dataTable>
		</h:form>
	</f:view>
</body>
</html>