<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajouter un étudiant</title>
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
			<h:panelGrid border="0" columns="3" cellpadding="5"> 
				<h:outputText value="Name :" />
				<h:inputText id="name" value="#{StudentController.newStudent.name}"/> 
				<h:message for="name" />
				<h:outputText value="First name :" />
				<h:inputText id="firstname" value="#{StudentController.newStudent.firstname}"/> 
				<h:message for="firstname" />
				<h:outputText />
				<h:commandButton value="Add student" action="#{StudentController.createStudent}" />
			</h:panelGrid>
		</h:form>
	</f:view>
</body>
</html>