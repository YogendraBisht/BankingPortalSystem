package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write(" <title>Banking Portal</title>\r\n");
      out.write("<link href=\"css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("<link href=\"css/style.css\" type=\"text/css\" rel=\"stylesheet\" media=\"all\">\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\">   <!-- font-awesome icons --> \r\n");
      out.write("<!-- js --> \r\n");
      out.write("\t<script src=\"js/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("<!-- web-fonts -->\r\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Secular+One\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("<!-- //web-fonts --> \r\n");
      out.write("</head>\r\n");
      out.write("<body> \r\n");
      out.write("\t<!-- header -->\r\n");
      out.write("\t<div class=\"headerw3-agile\"> \r\n");
      out.write("\t\t<div class=\"header-w3mdl\"><!-- header-two --> \r\n");
      out.write("\t\t\t<div class=\"container\"> \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"agileits-hdright nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t<div class=\"header-w3top\" style=\"height: 133px; \"><!-- header-top --> \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"w3l-nav-top\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/bp1.jpeg\" alt=\"logo\" style=\"width: 660px; height: 84px\">\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div> \t \r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"agile_social_banner\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"agileits_social_list\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"https://www.facebook.com/\" class=\"w3_agile_facebook\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"agile_twitter\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>  \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div> \r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t<!-- //header -->  \r\n");
      out.write("\t<!-- banner -->\r\n");
      out.write("\t<div class=\"banner\">\r\n");
      out.write("\t\t<div class=\"header-nav\"><!-- header-three --> \t\r\n");
      out.write("\t\t\t<nav class=\"navbar navbar-default\">\r\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t\t\tMenu \r\n");
      out.write("\t\t\t\t\t</button> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- top-nav -->\r\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.jsp\" class=\"scroll\">HOME</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"login.jsp\" class=\"scroll\">CUSTOMER LOGIN</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"blogin.jsp\" class=\"scroll\">EMPLOYEE LOGIN</a></li>       \r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"admin.jsp\" class=\"scroll\">ADMIN</a></li>    \t\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"aboutus.jsp\" class=\"scroll\">ABOUT US</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>  \r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</nav>    \r\n");
      out.write("\t\t</div>\r\n");
      out.write("</body>\r\n");
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
