/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-05-22 04:59:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Diagramarefinado.Finanza.Matricula;
import orm.Estudiante;

public final class MorososMatricula_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\"> \r\n");
      out.write("  <!-- Estilos -->\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloDirector.css\">\r\n");
      out.write("  <!-- JS -->\r\n");
      out.write("  <!--<link href='http://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>-->\r\n");
      out.write("  <title>Director: Obtener nómina</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <!-- Titulo -->\r\n");
      out.write("  <header class=\"text-center principal\">\r\n");
      out.write("    <h1>Director</h1>\r\n");
      out.write("  </header>\r\n");
      out.write("  <div id=\"menu\">\r\n");
      out.write("  <a href=\"index.jsp\"><span><img src=\"images/Home.png\" alt=\"\"></span>Inicio</a>\r\n");
      out.write("  </div>\r\n");
      out.write("<!-- Contenido -->\r\n");
      out.write("<div id=\"contenido\" class=\"container\">\r\n");
      out.write("<!-- Inicio panel --> \r\n");
      out.write("  <div class=\"panel panel-default\">\r\n");
      out.write("    <!-- Titulo panel -->\r\n");
      out.write("        <div class=\"panel-heading\">Nómina de estudiantes morosos en los pagos de matrícula</div>\r\n");
      out.write("          <!--Panel content-->\r\n");
      out.write("        <div class=\"panel-body\">\r\n");
      out.write("\t\t  ");
  
      out.write("\t\r\n");
      out.write("\t\t  <!--Inicio formulario-->\r\n");
      out.write("\t\t  <form > \r\n");
      out.write("\t      <!-- NÓMINA -->\r\n");
      out.write("\t\t  <table class=\"table table-bordered\">\r\n");
      out.write("\t\t    <thead>\r\n");
      out.write("  \t\t\t<tr>\r\n");
      out.write("  \t\t\t    <!-- TITULOS TABLA -->\r\n");
      out.write("  \t\t\t\t<th>Nombre</th>\r\n");
      out.write("  \t\t\t\t<th>Apellido</td>\r\n");
      out.write("  \t\t\t\t<th>Rut</td>\r\n");
      out.write("  \t\t\t\t<th>Estado Matricula</td>  \t\t\t   \r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t");

			/* Se llama al metodo para tener el arreglo de estudiantes morosos en el pago de matricula
			 * y se almacenan en un arreglo de tipo Estudiante
			 */
			Estudiante[] est = Matricula.obtenerListMorososMatricula();	
			// Se reccore el arreglo y se muestra en cada celda c/u de los datos de un estudiante
			for(int i=0;i<est.length;i++){ 
      out.write("\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("  \t\t\t\t<td>");
      out.print( est[i].getPersona().getNombre() );
      out.write("</td>\r\n");
      out.write("  \t\t\t\t<td>");
      out.print( est[i].getPersona().getApellido() );
      out.write("</td>\r\n");
      out.write("  \t\t\t\t<td>");
      out.print( est[i].getPersona().getRut() );
      out.write("</td>\r\n");
      out.write("  \t\t\t\t<td>");
      out.print( est[i].getMatricula().getEstadoMatricula() );
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t  </table>\r\n");
      out.write("          \r\n");
      out.write("           \r\n");
      out.write("               \r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("  \r\n");
      out.write("  </div>  <!-- Fin del panel -->  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>  <!-- Fin del contenido -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}