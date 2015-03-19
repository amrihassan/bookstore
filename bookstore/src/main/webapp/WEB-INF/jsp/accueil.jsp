<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC « -//W3C//DTD HTML 4.01 Transitional//EN » « http://www.w3.org/TR/html4/loose.dtd »>

<html>
	<head>
		<title>Index</title>
	</head>
	<body>
		<h1 align="center"><font color="blue">Bienvenue chez BookStore</font></h1>
		<h3><a href="<%=application.getContextPath()%>/auteur">Gestion des auteurs</a></h3> 
		<h3><a href="<%=application.getContextPath()%>/livre">Gestion des livres</a></h3>
		<h3><a href="<%=application.getContextPath()%>/client">Gestion des clients</a></h3>
		<h3><a href="<%=application.getContextPath()%>/administration">Gestion de l'administration</a></h3>
	</body>
</html>