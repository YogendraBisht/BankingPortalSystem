package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write(" <html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<title>Admin login</title>\r\n");
      out.write("<link href=\"col_font.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script >\r\n");
      out.write("function call()\r\n");
      out.write("{\r\n");
      out.write("if(document.f.name.value==\"\"){\r\n");
      out.write("alert(\"Please Enter Name\");\r\n");
      out.write("document.f.name.setFocus=true;\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("if(document.f.pwd.value==\"\"){\r\n");
      out.write("alert(\"Please Enter Ur Password\");\r\n");
      out.write("return false;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("<BR>\r\n");
      out.write("<form  method=post action=\"admincheck.jsp\" name=\"f\" onSubmit='return call()'>\r\n");
      out.write(" <table>\r\n");
      out.write(" <tr> <font size=\"6\"><h1><b>ADMIN LOGIN</b></h1> </font>\r\n");
      out.write(" </font>\r\n");
      out.write(" <td><b>Name:</b></td><td><input type=\"text\" name=\"name\" ></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr><td>&nbsp;</td></tr>\r\n");
      out.write("<tr> \r\n");
      out.write("<td><b> Password:</b></td><td><input type=\"password\" name=\"pwd\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br> <BR>\r\n");
      out.write(" <input type=\"submit\" value=\"submit\">&nbsp;&nbsp;&nbsp;\r\n");
      out.write(" <input type=\"reset\" value=\"reset\">\r\n");
      out.write(" </form>\r\n");
      out.write("<br>\r\n");
      out.write("</center>\r\n");
      out.write("<tr>\r\n");
      out.write("</tr> \r\n");
      out.write("</table>\r\n");
      out.write(" </body>\r\n");
      out.write("</html>");
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
