<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="html"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login page</title>
</head>
<body>
	<core:view>
		<html:form>
			<html:outputText value="login"/>
			<html:inputText value="#{loginBean.login}"/>
			<br />
			<html:outputText value="password"/>
			<html:inputSecret value="#{loginBean.password}"/>
			<br />
			<html:commandButton value="Se connecter" action="#{loginBean.validate}" />
		</html:form>
	</core:view>
</body>
</html>