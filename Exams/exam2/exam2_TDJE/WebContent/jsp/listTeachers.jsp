<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des enseignants</title>
</head>
<body>
	<f:view>
		<h:panelGrid columns="3" cellpadding="10">
			<h:outputLink value="../index.jsf">
				<h:outputText value="Home" />
			</h:outputLink>
			<h:outputLink value="listTeachers.jsf">
				<h:outputText value="Lister enseignants" />
			</h:outputLink>
			<h:outputLink value="addTeacher.jsf">
				<h:outputText value="Ajouter enseignant" />
			</h:outputLink>
		</h:panelGrid>
		<h:form>
			<h:dataTable border="0" rules="all" value="#{TeacherController.teachers}" var="t">
				<h:column>
					<f:facet name="header">
						<h:outputText value="id" />
					</f:facet>
					<h:outputText value="#{t.id}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Name" />
					</f:facet>
					<h:outputText value="#{t.name}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Firstname" />
					</f:facet>
					<h:outputText value="#{t.firstname}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Subject" />
					</f:facet>
					<h:outputText value="#{t.subject}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Opérations" />
					</f:facet>
					<h:commandButton value="Modifier"
						action="#{TeacherController.editerTeacher}" />
					<h:commandButton value="Supprimer"
						action="#{TeacherController.deleteTeacher}" />
				</h:column>
			</h:dataTable>
		</h:form>
	</f:view>
</body>
</html>