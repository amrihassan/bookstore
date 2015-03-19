<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
	<head>
		<title> Ajouter un auteur </title>
	</head>
	<body>
		<h3 align="center"><font color="blue">Ajout d'un auteur</font></h3>
		
		<form method="post" action="inscription">

        <fieldset>
                <label for="email">Nom <span class="requis">*</span></label>
                <input type="text" id="nom" name="nom" value="" size="50" maxlength="100" />
                <br />           
                
                <label for="email">Adresse email <span class="requis">*</span></label>
                <input type="email" id="email" name="email" value="" size="20" maxlength="60" />
                <br />
                
                <label for="email">Adresse email <span class="requis">*</span></label>
                <input type="email" id="email" name="email" value="" size="20" maxlength="60" />
                <br />
                
                <label for="email">Adresse email <span class="requis">*</span></label>
                <input type="email" id="email" name="email" value="" size="20" maxlength="60" />
                <br />
                
                <label for="email">Adresse email <span class="requis">*</span></label>
                <input type="email" id="email" name="email" value="" size="20" maxlength="60" />
                <br />

                <input type="submit" value="Ajouter" class="sansLabel" />
                <br />

            </fieldset>
        </form>
	</body>
</html>
