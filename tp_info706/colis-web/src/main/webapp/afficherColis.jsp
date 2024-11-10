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
    <ul id="menu">
        <li><a href="index.html">Accueil</a></li>
        <li><a href="ajoutColis.html">Enrgistrement</a></li>
        <li><a href="http://localhost:8080/colis-web/listColis?editer=0">Progression</a></li>
        <li><a href="http://localhost:8080/colis-web/listColis?editer=1">Suivi</a></li>
    </ul>
	<h2>Informations Colis :</h2>
    <div id="infoColis">
        <div>
            <p>id : ${colis.id }</p>
            <p>poids : ${colis.poids }</p>
            <p>destination : ${colis.destination }</p>
            <p>origine : ${colis.origine }</p>
            <p>valeur : ${colis.valeur }&euro;</p>
        </div>
        <div>
            <p>emplacement : ${colis.emplacement }</p>
            <p>longitute : ${colis.longitude }</p>
            <p>latitude : ${colis.latitude }</p>
            <p>etat : ${colis.etat }</p>
        </div>
    </div>
</body>
</html>