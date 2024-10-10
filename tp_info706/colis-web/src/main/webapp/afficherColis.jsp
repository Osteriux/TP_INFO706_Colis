<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Info Colis</title>
	<link rel="stylesheet" type="text/css" href="css/base.css" >
</head>
<body>
	<h1>Affichage Colis</h1>
	<h2>Informations Colis :</h2>
	<p>id : ${colis.id }</p>
    <p>poids : ${colis.poids }</p>
    <p>destination : ${colis.destination }</p>
    <p>origine : ${colis.origine }</p>
    <p>valeur : ${colis.valeur }&euro;</p>
    <br/>
    <p>emplacement : ${colis.emplacement }</p>
    <p>longitute : ${colis.longitude }</p>
    <p>latitude : ${colis.latitude }</p>
    <p>etat : ${colis.etat }</p>

	<a href="index.html">Revenir  la page principale</a>
</body>
</html>