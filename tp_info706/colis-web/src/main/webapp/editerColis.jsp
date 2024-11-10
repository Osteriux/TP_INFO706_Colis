<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Gestions des Colis</title>
	<link rel="stylesheet" type="text/css" href="css/base.css" >
</head>
<body>
    <h1>Edition des Colis</h1>
	<ul id="menu">
        <li><a href="index.html">Accueil</a></li>
        <li><a href="ajoutColis.html">Enrgistrement</a></li>
        <li><a href="http://localhost:8080/colis-web/listColis?editer=0">Progression</a></li>
        <li><a href="http://localhost:8080/colis-web/listColis?editer=1">Suivi</a></li>
    </ul>
    <div>
		<form action="editerColis" method="post">
			
			<label for="longitude">Longitude:</label>
			<input type="number" id="longitude" name="longitude" step="0.0001" value="${colis.longitude}" required/>

			<label for="latitude">Latitude:</label>
			<input type="number" id="latitude" name="latitude" step="0.0001" value="${colis.latitude}" required/>

			<label for="emplacement">Emplacement:</label>
			<input type="text" id="emplacement" name="emplacement" value="${colis.emplacement[colis.emplacement.size()-1]}" required/>

			<label for="etat">Etat:</label>
			<select id="etat" name="etat">
				<option value="EN_COURS" ${colis.etat == 'EN_COURS' ? 'selected' : ''}>En cours</option>
				<option value="LIVRE" ${colis.etat == 'LIVRE' ? 'selected' : ''}>Livre</option>
				<option value="PERDU" ${colis.etat == 'PERDU' ? 'selected' : ''}>Perdu</option>
				<option value="ANNULE" ${colis.etat == 'ANNULE' ? 'selected' : ''}>Annule</option>
			</select>
			
			<div></div>
			<input type="submit" value="Editer Colis">
			<div></div>
			<input type="hidden" id="id" name="id" value="${colis.id}" required/>
		</form>
    </div>
</body>
</html>