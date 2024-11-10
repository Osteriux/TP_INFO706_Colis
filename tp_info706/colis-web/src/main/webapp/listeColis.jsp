<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
	<title>Liste Colis</title>
	<link rel="stylesheet" type="text/css" href="css/base.css" >
</head>
<body>
    <h1>Liste des Colis</h1>
    <ul id="menu">
        <li><a href="index.html">Accueil</a></li>
        <li><a href="ajoutColis.html">Enrgistrement</a></li>
        <li><a href="http://localhost:8080/colis-web/listColis?editer=0">Progression</a></li>
        <li><a href="http://localhost:8080/colis-web/listColis?editer=1">Suivi</a></li>
    </ul>
    <table>
        <tr>
            <c:if test="${editer == 0}">
                <th>details</th>
            </c:if>
            <c:if test="${editer == 1}">
                <th>modifier</th>
            </c:if>
            <th>id</th>
            <th>poids</th>
            <th>origine</th>
            <th>destination</th>
            <th>valeur</th>
            <th>emplacement</th>
            <th>longitude</th>
            <th>latitude</th>
            <th>etat</th>
        </tr>
        <c:forEach var="colis" items="${colisList}">
            <tr class="colis">
                <c:if test="${editer == 0}">
                    <td><a href="http://localhost:8080/colis-web/afficherColis?id=${colis.id}">details</a></td>
                </c:if>
                <c:if test="${editer == 1}">
                    <td><a href="http://localhost:8080/colis-web/editerColis?id=${colis.id}">modifier</a></td>
                </c:if>
                <td>${colis.id }</td>
                <td>${colis.poids }</td>
                <td>${colis.origine }</td>
                <td>${colis.destination }</td>
                <td>${colis.valeur }&euro;</td>
                <td>${colis.emplacement }</td>
                <td>${colis.longitude }</td>
                <td>${colis.latitude }</td>
                <td>${colis.etat }</td>
            </tr>
        </c:forEach>
</body>
</html>