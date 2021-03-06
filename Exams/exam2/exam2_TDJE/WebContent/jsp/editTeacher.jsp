<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editer l'enseignant</title>
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
			<h:panelGrid border="0" columns="3" cellpadding="5">
				<h:outputText value="Name :" />
				<h:inputText id="name" value="#{TeacherController.editTeacher.name}" required="true" requiredMessage="Nom enseignant obligatoire"/>
				<h:message for="name" />
				<h:outputText value="First Name :" />
				<h:inputText id="firstname" value="#{TeacherController.editTeacher.firstname}" required="true" requiredMessage="Prénom enseignant obligatoire"/>
				<h:message for="firstname" />
				<h:outputText value="Subject :" />
				<h:inputText id="subject" value="#{TeacherController.editTeacher.subject}" required="true" requiredMessage="Matière enseignant obligatoire"/>
				<h:message for="subject" />
				<h:outputText />
				<h:commandButton value="Mettre à jour"
					action="#{TeacherController.updateTeacher}" />
			</h:panelGrid>
		</h:form>
	</f:view>
</body>
</html>