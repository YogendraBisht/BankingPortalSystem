package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import p1.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<HTML>\r\n");
      out.write("<BODY>\r\n");
      out.write("\t");

		HttpSession s = request.getSession(false);
		try {
			if (s != null) {
				System.out.println("sess : " + s.isNew());
	
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<BR>\r\n");
      out.write("\t\t<BR> <font size=\"+2\" color=\"black\"><h1>\r\n");
      out.write("\t\t\t\t<b>WELCOME TO BANKING PORTAL</b>\r\n");
      out.write("\t\t\t</h1></font> <br>\r\n");
      out.write("\t\t<form method=post action=\"usercheck.jsp\" name=\"f\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><h3>SELECT BANK:</td>\r\n");
      out.write("\t\t\t\t\t<td><SELECT NAME=\"bname\">\r\n");
      out.write("\t\t\t\t\t\t\t");

								try {
											Connection con = DB.getCon();
											PreparedStatement st = con.prepareStatement("select * from bank ");
											ResultSet rs = st.executeQuery();
											while (rs.next()) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option>");
      out.print(rs.getString(2));
      out.write("</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");

															  }
									} 
									catch (Exception e) {System.out.println(e);

			}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t</SELECT></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<BR> <input type=\"submit\" value=\"submit\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<a href=\"otherbanknewac.jsp\" style=\"text-decoration: none\"><font\r\n");
      out.write("\t\t\t\tcolor=\"BLACK\"><h1>\r\n");
      out.write("\t\t\t\t\t\t<b><image src=\"enternewbank.png\" height=\"50\" width=\"300\" /></b>\r\n");
      out.write("\t\t\t\t\t</h1></a>\r\n");
      out.write("\t\t\t");

				} else {
						response.sendRedirect("process.jsp?msg=please login Firstly..........");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
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
