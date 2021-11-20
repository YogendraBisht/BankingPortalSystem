package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import p1.*;

public final class blogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <html>\r\n");
      out.write("<head>\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction call() {\r\n");
      out.write("\t\tif (document.f.bid.value == \"\") {\r\n");
      out.write("\t\t\talert(\"Please Enter Ur Name\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (document.f.pwd.value == \"\") {\r\n");
      out.write("\t\t\talert(\"Please Enter Ur Password\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif ((document.f.bid.value == \"\") || (document.f.pwd.value == \"\")) {\r\n");
      out.write("\t\t\talert(\"Please Enter Username& password\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<title>Banking Portal</title>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("<br>\r\n");
      out.write("\t<center>\r\n");
      out.write("\t<form method=post action=\"bloginch.jsp\" name=\"f\" onSubmit='return call()'>\r\n");
      out.write("\t<table width=\"40%\" cellpadding=\"5\" cellspacing=\"5\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<font size=\"6\"><h1><b>EMPLOYEE LOGIN</b></h1> </font>\r\n");
      out.write("\t\t\t<td><font  size=\"5\"><b> Username:</b></font></td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"bid\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><font size=\"5\"><b> Password:</b></font></td>\r\n");
      out.write("\t\t\t<td><input type=\"password\" name=\"pwd\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><font  size=\"5\"><b> Select Bank:</b></font></td>\r\n");
      out.write("\t\t\t<td><SELECT NAME=\"bl\">\r\n");
      out.write("\t\t\t");

			try {
				Connection con = DB.getCon();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from  bank");
				while (rs.next()) {
			
      out.write("\r\n");
      out.write("\t\t\t\t<option>");
      out.print(rs.getString(2));
      out.write("</option>\r\n");
      out.write("\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t</SELECT></td>\r\n");
      out.write("\t\t\t");

			} catch (Exception e) {
				System.out.println(e);
			 }
			
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br> <BR> <input type=\"submit\" value=\"Login\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \r\n");
      out.write("\t<input type=\"reset\" value=\"   reset   \">\r\n");
      out.write("\t<center><h2>\r\n");
      out.write("\t\t<b><a href=\"newbankuser.jsp\">\r\n");
      out.write("\t\t <font  color=\"black\" size=\"5\">New EMPLOYEE..?</font><image src=\"signup.gif\" /image></font>\r\n");
      out.write("\t\t </a></b>\r\n");
      out.write("\t</h2></center>\r\n");
      out.write("</form>\r\n");
      out.write("</center>\r\n");
      out.write("<tr>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
