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
</head>
<body>
<h1>Detalle Contacto</h1>
<div >
    <ul> 
    
        <li>${persona.nombre}</li>
        <li>${persona.apellido1}</li>
        <li>${persona.apellido2}</li>
        <li>${persona.dni}</li>
        <li>${persona.fechanacimiento}</li>
        
        <c:forEach var="user" items="${Persona.direcciones}" varStatus="status"> 
            <li>${user.direccion}</li>
            <li>${user.codpostal}</li>
            <li>${user.localidad}</li>
            <li>${user.provincia.provincia}</li>
            
         </c:forEach>
            
    
    
    </ul>
    
</div>
<a href="/">Atrás</a>
</body>
