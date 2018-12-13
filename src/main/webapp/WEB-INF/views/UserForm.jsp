<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">

<spring:url value="resources/css/bootstrap.css" var="bootstrap" />
<link href="${bootstrap}" rel="stylesheet" />
<spring:url value="resources/css/custom.css" var="custom" />
<link href="${custom}" rel="stylesheet" />

<link rel="shortcut icon" href="/resources/favicon.ico"
	type="image/x-icon">
<link rel="icon" href="/resources/favicon.ico" type="image/x-icon">
<link href="https://fonts.googleapis.com/css?family=PT+Serif" rel="stylesheet">

<title>FORMULARIO DE USUARIOS</title>
</head>
<body>
	<div align="center" class="general contenedor">
		<h1>FORMULARIO DE USUARIOS (add/edit)</h1>
		<form:form action="save" method="post" modelAttribute="user">
			<form:hidden path="idpersona" />
			<div class="form-group row campitos">
				<label for="example-text-input" class="col-2 col-form-label">Nombre</label>
				<div class="col-10">
					<form:input class="form-control" type="text" id=""
						path="nombre" />
				</div>
			</div>
			<div class="form-group row campitos">
				<label for="example-text-input" class="col-2 col-form-label">Primer
					Apellido</label>
				<div class="col-10">
					<form:input class="form-control" type="text" id="" path="apellido1" />
				</div>
			</div>
			<div class="form-group row campitos">
				<label for="example-text-input" class="col-2 col-form-label">Segundo
					Apellido</label>
				<div class="col-10">
					<form:input class="form-control" type="text" id="" path="apellido2" />
				</div>
			</div>
			<div class="form-group row campitos">
				<label for="example-text-input" class="col-2 col-form-label">DNI</label>
				<div class="col-10">
					<form:input class="form-control" type="text" id="" path="dni" />
				</div>
			</div>
			<div class="form-group row campitos">
				<label for="example-date-input" class="col-2 col-form-label">Fecha
					de Nacimiento</label>
				<div class="col-10">
					<form:input class="form-control" type="date" id="" path="fechanacimiento" />
				</div>
			</div>
			<button type="submit" class="btn btn-primary"
				value="Guardar Registro">Guardar Registro</button>
			<button type="button" onclick="window.location.href='/'" class="btn btn-secondary" >Atrás</button>
		</form:form>
	</div>
</body>
</html>