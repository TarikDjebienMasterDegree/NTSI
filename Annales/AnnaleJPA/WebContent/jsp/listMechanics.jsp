<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des garagistes</title>
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
			<h:dataTable border="0" rules="all" value="#{MechanicController.mechanics}" var="m">
				<h:column>
					<f:facet name="header">
						<h:outputText value="id" />
					</f:facet>
					<h:outputText value="#{m.id}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Name" />
					</f:facet>
					<h:outputText value="#{m.name}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="garageName" />
					</f:facet>
					<h:outputText value="#{m.garageName}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="address" />
					</f:facet>
					<h:outputText value="#{m.address}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="postalCode" />
					</f:facet>
					<h:outputText value="#{m.postalCode}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="city" />
					</f:facet>
					<h:outputText value="#{m.city}" />
				</h:column>
			</h:dataTable>
		</h:form>
	</f:view>
</body>
</html>