package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class VeritifyUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>User Email Verification</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            h1{\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                color: blueviolet;\r\n");
      out.write("                padding-top: 30px;\r\n");
      out.write("            }\r\n");
      out.write("            form{\r\n");
      out.write("                width: 250px;\r\n");
      out.write("                height: 300px;\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                background-color: blueviolet;\r\n");
      out.write("                top: 50%;\r\n");
      out.write("                left: 50%;\r\n");
      out.write("                transform: translate(-50%, -50%);\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            input{\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                margin: 20px 0;\r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("            }\r\n");
      out.write("            label{\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                font-weight: 700;\r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>User Email Verification</h1>\r\n");
      out.write("        <form action=\"UserVe\" method=\"post\">\r\n");
      out.write("            <label>User Name</label>\r\n");
      out.write("            <input type=\"text\" name=\"username\">\r\n");
      out.write("            <label>User Email</label>\r\n");
      out.write("            <input type=\"email\" name=\"useremail\">\r\n");
      out.write("            <input type=\"submit\" value=\"Register\">\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
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
