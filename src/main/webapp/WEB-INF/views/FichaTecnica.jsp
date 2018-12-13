<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ficha Tecnica</title>
<spring:url value="resources/css/bootstrap.css" var="bootstrap" />
<link href="${bootstrap}" rel="stylesheet" />
<spring:url value="resources/css/custom.css" var="custom" />
<link href="${custom}" rel="stylesheet" />
<link href="https://fonts.googleapis.com/css?family=PT+Serif" rel="stylesheet">

<link rel="shortcut icon" href="/resources/favicon.ico"
	type="image/x-icon">
<link rel="icon" href="/resources/favicon.ico" type="image/x-icon">
</head>
<body>

	<div class="contenedor" align="center">
		<h1>Detalle Contacto</h1>
		<div class="card" style="width: 18rem;">
			<div class="card-body">
				<p class="card-text"><ul class="list-group list-group-flush">
					<li class="list-group-item">Nombre: ${persona.nombre}</li>
					<li class="list-group-item">Primer Apellido: ${persona.apellido1}</li>
					<li class="list-group-item">Segundo Apellido: ${persona.apellido2}</li>
					<li class="list-group-item">DNI: ${persona.dni}</li>
					<li class="list-group-item">Fecha de Nacimiento: ${persona.fechanacimiento}</li>
					<c:forEach var="user" items="${Persona.direcciones}"
						varStatus="status">
						<li class="list-group-item">Dirección: ${user.direccion}</li>
						<li class="list-group-item">Código Postal: ${user.codpostal}</li>
						<li class="list-group-item">Localidad: ${user.localidad}</li>
						<li class="list-group-item">Provicia: ${user.provincia.provincia}</li>
					</c:forEach>
				</ul>

				<a href="/" class="btn btn-primary">Atrás</a>
			</div>
		</div>
	</div>
</body>