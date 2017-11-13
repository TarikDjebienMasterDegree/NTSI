<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>5eme écran</title>
</head>
<body>
	<f:view>
		<h:panelGrid columns="1" cellpadding="10">
			<h:outputLink value="../index.jsf">
				<h:outputText value="Home" />
			</h:outputLink>
		</h:panelGrid>
		<h:form>
			<h:panelGrid border="0" columns="1" cellpadding="5">
				
				<h:outputText value="Valider le récapitulatif :" />
				
				<h:outputText />
				<h:commandButton value="Suivant"
					action="#{AppointmentController.goToHome}" />
			</h:panelGrid>
		</h:form>
	</f:view>
</body>
</html>