/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-05-22 05:03:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\"> \r\n");
      out.write("\t<!-- Estilos -->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilo.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/font-awesome.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/fonts.css\">\r\n");
      out.write("\t<!-- JS -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-2.1.3.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/codigo.js\"></script>\r\n");
      out.write("\t<title>Bienvenido</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- Titulo -->\r\n");
      out.write("\t<header class=\"text-center principal\">\r\n");
      out.write("\t\t<h1>Bienvenido</h1>\r\n");
      out.write("\t</header>\r\n");
      out.write("<!-- Contenido -->\r\n");
      out.write("<div id=\"contenido\" class=\"container\">\r\n");
      out.write("<section id=\"usuarios\" class=\"\">\t\r\n");
      out.write("\t<!-- Titulo Contenido -->\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<img src=\"images/user.png\" alt=\"\">\r\n");
      out.write("\t\t<h3>Seleccione perfil</h3>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!-- Inicio formulario -->\r\n");
      out.write("\t<form>\r\n");
      out.write("  \t\t <div id=\"boton1\" class=\"userboton\"><i class=\"fa fa-angle-down\"></i></i> DIRECTOR</div>\r\n");
      out.write(" \t\t <div id=\"submenu1\" class=\"\">\r\n");
      out.write(" \t\t \t<p class=\"seleccione\">Seleccione tarea:</p>\r\n");
      out.write(" \t\t \t<ul> \t\t\t \r\n");
      out.write("    \t\t\t<li><a href=\"MorososMatricula.jsp\"><i class=\"fa fa-hand-o-right\"></i> Obtener reporte estudiantes morosos en los pagos de matrícula. </p></a></li>\r\n");
      out.write("    \t\t\t<li><a href=\"MorososMensualidad.jsp\"><i class=\"fa fa-hand-o-right\"></i> Obtener reporte estudiantes morosos en los pagos de mensualidad. </p></a></li>\r\n");
      out.write("    \t\t\t<li><a href=\"ReporteSueldoPorProfesor.jsp\"><i class=\"fa fa-hand-o-right\"></i> Conocer pagos profesores por curso y si fue realizado. </p></a></li>\r\n");
      out.write("    \t\t\t<li><a href=\"DesactivarCurso.jsp\"><i class=\"fa fa-hand-o-right\"></i> Desactivar curso. </p></a></li>\r\n");
      out.write("    \t\t\t<li><a href=\"Balance.jsp\"><i class=\"fa fa-hand-o-right\"></i> Obtener balance de ingreso y gasto. </p></a></li>\r\n");
      out.write("    \t\t</ul>  \r\n");
      out.write("  \t\t </div>\r\n");
      out.write("  \r\n");
      out.write("        <div id=\"boton2\" class=\"userboton\"><i class=\"fa fa-angle-down\"></i></i> JEFE ADM</div>\r\n");
      out.write("\t\t<div id=\"submenu2\" class=\"\">\r\n");
      out.write("\t\t\t<p class=\"seleccione\">Seleccione tarea:</p>\r\n");
      out.write("   \t\t\t<ul> \t\t\t \r\n");
      out.write("    \t\t\t<li><a href=\"RegPago.jsp\"><i class=\"fa fa-hand-o-right\"></i> Registrar sueldo profesor por curso. </p></a></li>\r\n");
      out.write("    \t\t\t<li><a href=\"CrearCurso.jsp\"><i class=\"fa fa-hand-o-right\"></i> Crear curso y asignar profesor. </p></a></li>\r\n");
      out.write("    \t\t</ul>  \r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\r\n");
      out.write("  \t\t<div id=\"boton3\" class=\"userboton\"><i class=\"fa fa-angle-down\"></i></i> PROFESOR</div>\r\n");
      out.write("\t\t<div id=\"submenu3\" class=\"\">\r\n");
      out.write("\t\t\t<p class=\"seleccione\">Seleccione tarea:</p>\r\n");
      out.write("   \t\t\t<ul> \t\t\t \r\n");
      out.write("    \t\t\t<li><a href=\"InscribirAlumno.jsp\"><i class=\"fa fa-hand-o-right\"></i> Inscribir alumno en un curso.</p></a></li>\r\n");
      out.write("    \t\t</ul>  \r\n");
      out.write("  \t\t</div>\r\n");
      out.write("\r\n");
      out.write("  \t\t<div id=\"boton4\" class=\"userboton\"><i class=\"fa fa-angle-down\"></i></i> SECRETARIA</div>\r\n");
      out.write("\t\t<div id=\"submenu4\" class=\"\">\r\n");
      out.write("\t\t\t<p class=\"seleccione\">Seleccione tarea:</p>\r\n");
      out.write("   \t\t\t<ul> \t\t\t \r\n");
      out.write("    \t\t\t<li><a href=\"PagoMatricula.jsp\"><i class=\"fa fa-hand-o-right\"></i> Registrar pago matrícula del estudiante.</p></a></li>\r\n");
      out.write("    \t\t\t<li><a href=\"PagoMensualidad.jsp\"><i class=\"fa fa-hand-o-right\"></i> Registrar pago mensualidad del estudiante.</p></a></li>\r\n");
      out.write("    \t\t</ul>  \r\n");
      out.write("  \t\t</div>\r\n");
      out.write("  \t\t    <!-- BOTON -->\r\n");
      out.write("  \t\t \t<!--<button type=\"button\" class=\"btn btn-primary\">Entrar</button>-->\r\n");
      out.write("\t</form> <!-- Fin formulario -->\r\n");
      out.write("</section>\r\n");
      out.write("</div> <!-- Fin Contenido -->\r\n");
      out.write("<footer>\r\n");
      out.write("\tHeber Arratia - UFRO\r\n");
      out.write("</footer>\r\n");
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
