/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-05-22 23:14:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BalanceIngresoGasto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloallan.css\">\r\n");
      out.write("<title>Registro Pago</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div c>\r\n");
      out.write("\t\t<div class=\"pa1\">\r\n");
      out.write("\t\t\t<div class=\"pa2\">\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<h1 class=\"titulo\">Balance Anual </h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div Class=\"tabla\">\r\n");
      out.write("\t\t\t<table class=\"table table-bordered tabla\" >\r\n");
      out.write("\t\t      <thead>\r\n");
      out.write("\t\t     <tr>\r\n");
      out.write("\t\t      <th>Mes</th>\r\n");
      out.write("\t\t      <th>Ingreso</td>\r\n");
      out.write("\t\t      <th>Gasto</td>\r\n");
      out.write("\t\t      <th>Balance</td>        \r\n");
      out.write("\t\t   </tr>\r\n");
      out.write("\t\t   </thead>\r\n");
      out.write("\t\t   ");
 String[] mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio","julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
      out.write("  \r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t   ");
for (int i = 0; i < mes.length; i++) {  // número de filas
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t      <td>");
      out.print(mes[i]);
      out.write("</td>\r\n");
      out.write("\t\t\t      <td>xx</td>\r\n");
      out.write("\t\t\t      <td>xx</td>\r\n");
      out.write("\t\t\t      <td>xx</td>\r\n");
      out.write("\t\t\t   </tr>\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t\t ");
}
      out.write("\t\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t    </table>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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
