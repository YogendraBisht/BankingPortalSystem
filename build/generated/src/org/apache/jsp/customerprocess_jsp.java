package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import p1.*;

public final class customerprocess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

try
{
   	Connection con = DB.getCon();
   	String id=request.getParameter("id");
	int ii=0;
	String pwd=request.getParameter("pwd");
   	PreparedStatement ps3=con.prepareStatement("select *  from clogin where cid=? ");
	ps3.setString(1,id);
	ResultSet rs3=ps3.executeQuery();
 	if(rs3.next()){

      out.write("\r\n");
      out.write(" \t\t<h3><center>Customer id already exist please enter new customer id</h3>\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "newcustomer.jsp", out, false);
      out.write('\r');
      out.write('\n');
 		
}
else{
	PreparedStatement ps1=con.prepareStatement("select MAX(id) from clogin");
 	ResultSet rs2=ps1.executeQuery();
 	if(rs2.next()){
		String s=rs2.getString(1);
	 	if(s==null){
	 	ii=1;
	 	}else{ii=Integer.parseInt(s)+1;}
 	}
	int status=0;
   	PreparedStatement st=con.prepareStatement("insert into clogin values(?,?,?,?)");
    st.setInt(1,ii);
    st.setString(2,id);
	st.setString(3,pwd);
	st.setInt(4,status);
	st.executeUpdate();
 	response.sendRedirect("process.jsp?msg=Your Request is in process...");
 	con.close();
 }
}
catch(Exception e)
{
	System.out.println(e);   
}

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
