<%-- 
    Document   : acto_form
    Created on : 26-oct-2017, 9:10:31
    Author     : MENDOZA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body>
        <form action="ActoController">
            <label>CedId:</label><br>
            <input type="text" name="id" value="${acto.id}"><br>
            <label>Fecha:</label><br>
            <input type="text" name="fecha" value="${acto.fecha}"><br>
            <label>CodMobiliario:</label><br>
            <input type="text" name="cod" value="${acto.cod}"><br>
            <input type="submit" name="btn_guardar" value="Guardar">
        </form>
    </body>
</html>
