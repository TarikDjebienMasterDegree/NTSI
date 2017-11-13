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
			<html:inputText value="#{loginManagedBean.login}"/>
			<br />
			<html:outputText value="password"/>
			<html:inputSecret value="#{loginManagedBean.password}"/>
			<br />
			<html:commandButton value="Connecter" action="#{loginManagedBean.validate}" />
		</html:form>
	</core:view>
</body>
</html>