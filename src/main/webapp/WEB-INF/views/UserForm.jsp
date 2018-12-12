<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">

        <spring:url value="resources/css/bootstrap.css" var="bootstrap"/>
        <link href="${bootstrap}" rel="stylesheet" />
        <spring:url value="resources/css/custom.css" var="custom"/>
        <link href="${custom}" rel="stylesheet" />  
        
<title>FORMULARIO DE USUARIOS</title>
</head>
<body>
	<div align="center">
		<h1>FORMULARIO DE USUARIOS (add/edit)</h1>
		<table>
			<form:form action="save" method="post" modelAttribute="user">
				<form:hidden path="idpersona" />
				<tr>
					<td>Nombre:</td>
					<td><form:input path="nombre"/></td>
				</tr>
				<tr>
					<td>Primer Apellido:</td>
					<td><form:input path="apellido1"/></td>
				</tr>
				<tr>
					<td>Segundo Apellido:</td>
					<td><form:input path="apellido2"/></td>
				</tr>
				<tr>
					<td>DNI:</td>
					<td><form:input path="dni"/></td>
				</tr>
				<tr>
					<td>Fecha Nacimiento:</td>
					<td><form:input path="fechanacimiento"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Guardar Registro"></td>
					<td colspan="2" align="center"><a href="/">Atrás</a></td>
						
				</tr>
			</form:form>
		</table>
	</div>

</body>
</html>