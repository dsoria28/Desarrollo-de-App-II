<%-- 
    Document   : index
    Created on : 06-dic-2017, 13:27:53
    Author     : MENDOZA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion de Medallistas</title>
    </head>
    <body>
        <h1>Formulario ingreso medallistas</h1>
        <%-- start web service invocation --%><hr/>
    <%
    try {
	utng.dsoria.services.webservices.MedallistasWS_Service service = new utng.dsoria.services.webservices.MedallistasWS_Service();
	utng.dsoria.services.webservices.MedallistasWS port = service.getMedallistasWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.String nombre = request.getParameter("nombre");
	java.lang.String disciplina = request.getParameter("disciplina");
	java.lang.String categoria = request.getParameter("categoria");
	java.lang.String medalla = request.getParameter("medalla");
	java.lang.String pais = request.getParameter("pais");
	java.lang.String evento = request.getParameter("evento");
	// TODO process result here
	java.lang.String result = port.ingresarMedallista(nombre, disciplina, categoria, medalla, pais, evento);
	out.println("<font color='pink'>"+result+ "</font>");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
        out.println("<font color='pink'>"+ "No se ingreso correctamente"+"</font>");
    }
    %>
    <%-- end web service invocation --%><hr/>

        <%-- start web service invocation --%><hr/>
    <%
    try {
	utng.dsoria.services.webservices.MedallistasWS_Service service = new utng.dsoria.services.webservices.MedallistasWS_Service();
	utng.dsoria.services.webservices.MedallistasWS port = service.getMedallistasWSPort();
	 // TODO initialize WS operation arguments here
	int id = Integer.parseInt(request.getParameter("id"));
	// TODO process result here
	java.lang.String result = port.buscarMedallista(id);
	out.println("<font color='green'>"+"Resultado de la consulta: "+result+"</font>");
    } catch (Exception ex) {
	out.println("<font color='green'>"+ "No se encontro"+"</font>");
    }
    %>
    <%-- end web service invocation --%><hr/>

        <%-- start web service invocation --%><hr/>
    <%
    try {
	utng.dsoria.services.webservices.MedallistasWS_Service service = new utng.dsoria.services.webservices.MedallistasWS_Service();
	utng.dsoria.services.webservices.MedallistasWS port = service.getMedallistasWSPort();
	// TODO process result here
	java.util.List<java.lang.Object> result = port.consultarMedallistas();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    <form action="index.jsp" method="post">
        <table>
            <tr>
                <th>Nombre:</th>
                <td><input type="text" name="nombre" size="50" required/></td>
            </tr>
            <tr>
                <th>Disciplina:</th>
                <td><input type="text" name="disciplina" size="50" required/></td>
            </tr>
            <tr>
                <th>Categoria:</th>
                <td><input type="text" name="categoria" size="50" required/></td>
            </tr>
            <tr>
                <th>Medalla:</th>
                <td><input type="text" name="medalla" size="50" required/></td>
            </tr>
            <tr>
                <th>Pais:</th>
                <td><input type="text" name="pais" size="50" required/></td>
            </tr>
            <tr>
                <th>Evento</th>
                <td><input type="text" name="evento" size="50" required/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Aceptar"/></td>
            </tr>
        </table>
    </form>
    
    <h1>Buscar medallista</h1>
    <form action="index.jsp" method="post">
        <table>
            <tr>
                <th>Id:</th>
                <td><input type="text" name="id" size="50" required/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Buscar"/></td>
            </tr>
        </table>
    </form>
    </body>
</html>
