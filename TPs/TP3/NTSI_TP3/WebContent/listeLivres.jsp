<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="html"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des livres</title>
<link rel="stylesheet" href="/css/styles.css" type="text/css">
</head>
<body>
	<core:view>
		<html:form>
			<html:dataTable value="#{listeLivres.livres}" var="livre"
				rowClasses="row1,row2" binding="#{listeLivres.dataTable}"
				headerClass="heading" styleClass="dataTable">
				<%-- Référence --%>
				<html:column>
					<core:facet name="header">
						<core:verbatim>Ref</core:verbatim>
					</core:facet>
					<html:outputText value="#{livre.id}"
						binding="#{listeLivres.idLivre}">
						<core:attribute name="idLivre" value="#{livre.id}" />
					</html:outputText>
				</html:column>
				<%-- Titre --%>
				<html:column>
					<core:facet name="header">
						<core:verbatim>Titre</core:verbatim>
					</core:facet>
					<html:outputText value="#{livre.titre}">
						<core:attribute name="titreLivre" value="#{livre.titre}" />
					</html:outputText>
				</html:column>
				<%-- Auteur --%>
				<html:column>
					<core:facet name="header">
						<core:verbatim>Auteur</core:verbatim>
					</core:facet>
					<html:outputText value="#{livre.auteur}">
						<core:attribute name="auteurLivre" value="#{livre.auteur}" />
					</html:outputText>
				</html:column>
				<%-- Résumé --%>
				<html:column>
					<core:facet name="header">
						<core:verbatim>Résumé</core:verbatim>
					</core:facet>
					<html:outputText value="#{livre.resume}">
						<core:attribute name="resumeLivre" value="#{livre.resume}" />
					</html:outputText>
				</html:column>
				<%-- Image (<html:graphicImage>) --%>
				<html:column>
					<core:facet name="header">
						<core:verbatim>Image</core:verbatim>
					</core:facet>
					<html:graphicImage value="#{livre.image}">
						<core:attribute name="imageLivre" value="#{livre.image}" />
					</html:graphicImage>
				</html:column>
				<html:column>
					<html:selectBooleanCheckbox binding="#{listeLivres.checkbox}"/>
				</html:column>
			</html:dataTable>
			
			<html:outputText value="" binding="#{listeLivres.login}">
				<core:attribute name="login" value="#{login.login}" />
			</html:outputText>

			<html:commandButton value="Emprunter les livres" action="#{listeLivres.emprunterLivres}" />
		</html:form>

	</core:view>
</body>
</html>