<%-- 
    Document   : actos_list
    Created on : 26-oct-2017, 9:07:31
    Author     : MENDOZA
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de actos vandalicos</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <th>
                    <form action="ActoController">
                        <input type="submit" name="btn_nuevo" value="Nuevo">
                    </form>
                </th>
                <th>CedId</th>
                <th>Fecha</th>
                <th>CodMobiliario</th>
            </tr>
            <c:forEach var="acto" items="${actos}">
                <tr>
                    <td>
                        <form action="ActoController">
                            <input type="hidden" name="id" value="${acto.id}">
                            <input type="submit" name="btn_editar" value="Editar">
                            <input type="submit" name="btn_eliminar" value="Eliminar">
                        </form>
                    </td>
                    <td>${acto.id}</td>
                    <td>${acto.fecha}</td>
                    <td>${acto.cod}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
