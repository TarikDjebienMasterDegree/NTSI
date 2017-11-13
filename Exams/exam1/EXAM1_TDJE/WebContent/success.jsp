<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="html"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success</title>
</head>
<body>
	<core:view>
		<html:outputLink value="consulterCompte.jsp">
			<core:verbatim>Consulter mes objets</core:verbatim>
		</html:outputLink>
		<br />
		<html:outputLink value="effectuerEchange.jsp">
			<core:verbatim>Effectuer un échange</core:verbatim>
		</html:outputLink>
		<br />
		<html:outputLink value="login.jsp">
			<core:verbatim>Retour au login</core:verbatim>
		</html:outputLink>
	</core:view>
</body>
</html>