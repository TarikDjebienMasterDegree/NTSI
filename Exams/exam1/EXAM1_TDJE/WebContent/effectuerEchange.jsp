<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="html"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Effectuer un échange</title>
</head>
<body>
	<core:view>
		<h1>
			<html:outputText value="Effectuer un échange :" />
		</h1>
		<html:form>
			<h4>
				<html:outputText
					value="Sélectionner un/plusieurs de vos objets à échanger :" />
				￼
				<html:selectOneListbox value="#{echangeBean.objectSelected}">
					<core:selectItems value="#{echangeBean.objectSelectedValue}" />
				</html:selectOneListbox>
			</h4>

			<h4>
				<html:outputText value="Sélectionner un client :" />
				<html:selectOneListbox value="#{echangeBean.clientSelected}" >
					<core:selectItems value="#{echangeBean.clientSelectedValue}" />
				</html:selectOneListbox>
				<html:commandButton value="Voir liste des objets" action="#{echangeBean.voirListeObjet}" />
			</h4>

			<h4>
				<html:outputText value="Sélectionner un des objets à échanger :" />
				<html:selectOneListbox value="#{echangeBean.exchangeSelected}" >
				<%-- Le binding ne fonctionne pas --%>
<%-- 					<core:selectItems value="#{echangeBean.objectSelectedValue}" binding="#{echangeBean.clientSelectedList}" /> --%>
				<core:selectItems value="#{echangeBean.objectSelectedValue}" />
				</html:selectOneListbox>
			</h4>


		</html:form>

	</core:view>
</body>
</html>