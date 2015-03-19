<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC « -//W3C//DTD HTML 4.01 Transitional//EN » « http://www.w3.org/TR/html4/loose.dtd »>

<html>
	<head>
		<title>Gestion des Auteurs</title>
	</head>
	<body>
		<br><br><br><br><br>
		<h3 align="center"><font color="blue">Gestion des auteurs</font></h3>
		<h3><a href="<%=application.getContextPath()%>/auteur/listAuteur">Afficher la liste des auteurs</a></h3> 
		<h3><a href="<%=application.getContextPath()%>/auteur/ajouterAuteur">Ajouter un auteur</a></h3>
		<h3><a href="<%=application.getContextPath()%>/auteur/supprimerAuteur">Supprimer un auteur</a></h3>
		<h3><a href="<%=application.getContextPath()%>/auteur/modifierAuteur">Modifier un auteur</a></h3>
	</body>
</html>