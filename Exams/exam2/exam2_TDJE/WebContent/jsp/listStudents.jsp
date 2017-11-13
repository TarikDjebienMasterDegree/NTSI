<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des étudiants</title>
</head>
<body>
	<f:view>
		<h:panelGrid columns="3" cellpadding="10">
			<h:outputLink value="../index.jsf">
				<h:outputText value="Home" />
			</h:outputLink>
			<h:outputLink value="listStudents.jsf">
				<h:outputText value="Lister les étudiants" />
			</h:outputLink>
			<h:outputLink value="addStudent.jsf">
				<h:outputText value="Ajouter un étudiant" />
			</h:outputLink>
		</h:panelGrid>
		<h:form>
			<h:dataTable border="0" rules="all" value="#{StudentController.students}" var="s">
				<h:column>
					<f:facet name="header">
						<h:outputText value="id" />
					</f:facet>
					<h:outputText value="#{s.id}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Name" />
					</f:facet>
					<h:outputText value="#{s.name}" />
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Firstname" />
					</f:facet>
					<h:outputText value="#{s.firstname}" />
				</h:column>
			</h:dataTable>
		</h:form>
	</f:view>
</body>
</html>