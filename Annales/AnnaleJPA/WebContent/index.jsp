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
		<html:outputText value="Bienvenue sur le site de gestion de garagiste, nous vous proposons les services suivants :"/>
		<br />
		<html:outputLink value="jsp/listCustomers.jsf">
			<core:verbatim>Gestion des clients</core:verbatim>
		</html:outputLink>
		<br />
		<html:outputLink value="jsp/listMechanics.jsf">
			<core:verbatim>Gestion des garagistes</core:verbatim>
		</html:outputLink>
		<br />
		<html:outputLink value="jsp/Screen1CreateAppointment.jsf">
			<core:verbatim>Création d'un rendez vous</core:verbatim>
		</html:outputLink>
	</core:view>
</body>
</html>