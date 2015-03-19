<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib   uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<html>
	<head>
		<title> Liste des auteurs </title>
	</head>
	<body>
		<h3 align="center"><font color="blue">Liste des auteurs</font></h3>
		<table cellpadding="1" cellspacing="1" border="1" style="border:0.5px;" bordercolor="Silver"align="center" >
			<tr>
				<th bgcolor="#F2F2F2">Id</th>
				<th bgcolor="#F2F2F2">Nom</th>
				<th bgcolor="#F2F2F2">Prénom</th>
				<th bgcolor="#F2F2F2">Date de naissance</th>
				<th bgcolor="#F2F2F2">E-Mail</th>
				<th bgcolor="#F2F2F2">Numéro de téléphone</th>
				<th bgcolor="#F2F2F2">Adresse</th>
			</tr>
			<c:forEach items="${lAuteur}" var="auteur">
				<tr> 
					<td>${auteur.id}</td>
					<td>${auteur.nom}</td>
					<td>${auteur.prenom}</td>
					<td>${auteur.dateNaissance}</td>
					<td>${auteur.email}</td>
					<td>${auteur.numTel}</td>
					<td>${auteur.adresse}</td>
				<tr>
			</c:forEach>
		</table>
	</body>
</html>
