<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des personnes</title>
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
			<h:dataTable border="0" rules="all" value="#{personCtrl.persons}"
				var="p">
				<h:column>
					<f:facet name="header">
						<h:outputText value="Prénom" />
					</f:facet>
					<h:outputText value="#{p.firstName}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Nom" />
					</f:facet>
					<h:outputText value="#{p.lastName}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Opérations" />
					</f:facet>
					<h:commandButton value="Modifier"
						action="#{personCtrl.editerPerson}" />
					<h:commandButton value="Supprimer"
						action="#{personCtrl.deletePerson}" />
				</h:column>
			</h:dataTable>
		</h:form>
	</f:view>
</body>
</html>