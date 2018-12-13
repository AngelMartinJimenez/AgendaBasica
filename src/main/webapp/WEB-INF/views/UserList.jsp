<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>


<html>
<head>
<meta charset="UTF-8" />

<spring:url value="/resources/css/bootstrap.css" var="bootstrap" />
<link href="${bootstrap}" rel="stylesheet" />
<spring:url value="/resources/css/custom.css" var="custom" />
<link href="${custom}" rel="stylesheet" />

<link rel="shortcut icon" href="/resources/favicon.ico" type="image/x-icon">
<link rel="icon" href="/resources/favicon.ico" type="image/x-icon">
<link href="https://fonts.googleapis.com/css?family=Courgette" rel="stylesheet">


<title>LISTADO DE USUARIOS</title>
</head>
<body>
	<div align="center" class="general contenedor">
		<h1>LISTADO DE USUARIOS</h1>
		<h3>
			<a href="new">Clic para crear un NUEVO USUARIO</a>
		</h3>

		<table class="table table-striped">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Nº</th>
					<th scope="col">Usuario</th>
					<th scope="col">Primer Apellido</th>
					<th scope="col">Segundo Apellido</th>
					<th scope="col">DNI</th>
					<th scope="col">Fecha Nacimiento</th>
					<th scope="col">Acciones</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${userList}" varStatus="status">
					<tr>
						<td scope="row">${user.idpersona}</td>
						<td scope="row">${user.nombre}</td>
						<td scope="row">${user.apellido1}</td>
						<td scope="row">${user.apellido2}</td>
						<td scope="row">${user.dni}</td>
						<td scope="row">${user.fechanacimiento}</td>
						<td scope="row"><button onclick="window.location.href='edit?id=${user.idpersona}'" class="btn btn-success botonsitos">Modificar</button>
							&nbsp;&nbsp;|&nbsp;&nbsp;<button onclick="window.location.href='delete?id=${user.idpersona}'" class="btn btn-danger botonsitos">Eliminar</button>
							&nbsp;&nbsp;|&nbsp;&nbsp;<button onclick="window.location.href='ficha?id=${user.idpersona}'" class="btn btn-info botonsitos">Ficha Tecnica</button></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>