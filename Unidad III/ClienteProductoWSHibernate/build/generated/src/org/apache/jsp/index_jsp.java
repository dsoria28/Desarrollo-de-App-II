package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Gestion de Medallistas</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Formulario ingreso medallistas</h1>\n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

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
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	utng.dsoria.services.webservices.MedallistasWS_Service service = new utng.dsoria.services.webservices.MedallistasWS_Service();
	utng.dsoria.services.webservices.MedallistasWS port = service.getMedallistasWSPort();
	 // TODO initialize WS operation arguments here
	int id = Integer.parseInt(request.getParameter("id"));
	// TODO process result here
	java.lang.String result = port.buscarMedallista(id);
	out.println("<font color='green'>"+"Resultado de la consulta: "+result+"</font>");
    } catch (Exception ex) {
	out.println("<font color='pink'>"+ "No se encontro"+"</font>");
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	utng.dsoria.services.webservices.MedallistasWS_Service service = new utng.dsoria.services.webservices.MedallistasWS_Service();
	utng.dsoria.services.webservices.MedallistasWS port = service.getMedallistasWSPort();
	// TODO process result here
	java.util.List<java.lang.Object> result = port.consultarMedallistas();
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("    <form action=\"index.jsp\" method=\"post\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Id</th>\n");
      out.write("                <td><input type=\"text\" name=\"id\" size=\"10\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Nombre:</th>\n");
      out.write("                <td><input type=\"text\" name=\"nombre\" size=\"50\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Disciplina:</th>\n");
      out.write("                <td><input type=\"text\" name=\"disciplina\" size=\"50\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Categoria:</th>\n");
      out.write("                <td><input type=\"text\" name=\"categoria\" size=\"50\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Medalla:</th>\n");
      out.write("                <td><input type=\"text\" name=\"medalla\" size=\"50\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Pais:</th>\n");
      out.write("                <td><input type=\"text\" name=\"pais\" size=\"50\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Evento</th>\n");
      out.write("                <td><input type=\"text\" name=\"evento\" size=\"50\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\"><input type=\"submit\" value=\"Aceptar\"/></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("    <h1>Buscar medallista</h1>\n");
      out.write("    <form action=\"index.jsp\" method=\"post\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Id:</th>\n");
      out.write("                <td><input type=\"text\" name=\"id\" size=\"50\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\"><input type=\"submit\" value=\"Buscar\"/></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
