<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="html"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Consulter mes objets</title>
<link rel="stylesheet" href="css/styles.css" type="text/css" />
</head>
<body>
	<core:view>
		<h1><html:outputText value="Consultation du compte - #{ObjetsManagedBean.loginValue}"/></h1>
		<html:dataTable value="#{ObjetsManagedBean.objets}" var="objet"
			rowClasses="row1,row2"
			headerClass="heading" styleClass="dataTable">
			<%-- Date d'acquisition --%>
			<html:column>
				<core:facet name="header">
					<core:verbatim>Date d'acquisition</core:verbatim>
				</core:facet>
				<html:outputText value="#{objet.dateAcquisition}">
					<core:convertDateTime type="date" pattern="dd/MM/yyyy" />
					<core:attribute name="dateObjet" value="#{objet.id}" />
				</html:outputText>
			</html:column>
			<%-- Libellé --%>
			<html:column>
				<core:facet name="header">
					<core:verbatim>Libelle</core:verbatim>
				</core:facet>
				<html:outputText value="#{objet.libelle}">
					<core:attribute name="libelleObjet" value="#{objet.libelle}" />
				</html:outputText>
			</html:column>
			<%-- Valeur à neuf --%>
			<html:column>
				<core:facet name="header">
					<core:verbatim>Valeur à neuf</core:verbatim>
				</core:facet>
				<html:outputText value="#{objet.valeurNeuf}">
					<core:convertNumber type="currency"  currencyCode="EUR"/>
					<core:attribute name="valeurNeufObjet" value="#{objet.valeurNeuf}" />
				</html:outputText>
			</html:column>
		</html:dataTable>
		<html:outputLink value="success.jsp">
			<core:verbatim>Retour au menu</core:verbatim>
		</html:outputLink>
	</core:view>
</body>
</html>