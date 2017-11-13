<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="html"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<core:view>
		<html:outputText value="Bienvenue sur l'application de gestion de réservations de salle, nous vous proposons les services suivants :"/>
		<br />
		<html:outputLink value="jsp/listTeachers.jsf">
			<core:verbatim>Gestion des enseignants</core:verbatim>
		</html:outputLink>
		<br />
		<html:outputLink value="jsp/listStudents.jsf">
			<core:verbatim>Gestion des étudiants</core:verbatim>
		</html:outputLink>
		<br />
		<html:outputLink value="jsp/Screen1CreateBooking.jsf">
			<core:verbatim>Création d'une réservation</core:verbatim>
		</html:outputLink>
	</core:view>
</body>
</html>