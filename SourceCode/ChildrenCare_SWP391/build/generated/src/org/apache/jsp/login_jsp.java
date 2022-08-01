package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("        <meta name=\"description\" content=\"\" />\r\n");
      out.write("        <meta name=\"author\" content=\"\" />\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template/DesignPublic.jsp", out, false);
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template/HeadMenuPublic.jsp", out, false);
      out.write("\r\n");
      out.write("        <div id=\"layoutAuthentication\">\r\n");
      out.write("            <div id=\"layoutAuthentication_content\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row justify-content-center\">\r\n");
      out.write("                        <div class=\"col-lg-5\">\r\n");
      out.write("                            <div class=\"card shadow-lg border-0 rounded-lg mt-5\">\r\n");
      out.write("                                <div class=\"card-header\"><h2 class=\"text-center font-weight-light my-4\">Login</h2></div>\r\n");
      out.write("                                <div class=\"card-body\">\r\n");
      out.write("                                    <form action=\"login\" method=\"post\">\r\n");
      out.write("                                        <div class=\"form-floating mb-3\">\r\n");
      out.write("                                            <input class=\"form-control\" name=\"username\" type=\"user\" placeholder=\"username\" required=\"\"/>\r\n");
      out.write("                                            <label for=\"User name\">User name</label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-floating mb-3\">\r\n");
      out.write("                                            <input class=\"form-control\" name=\"password\" type=\"password\" placeholder=\"Password\" required=\"\"/>\r\n");
      out.write("                                            <label for=\"inputPassword\">Password</label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-floating mb-3\">\r\n");
      out.write("                                            <div class=\"form-check\">\r\n");
      out.write("                                                <input ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(cookie.rem.value eq 'ON')?\"checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" class=\"form-check-input align-middle\" type=\"checkbox\" name=\"remember\" id=\"remember-check\">\r\n");
      out.write("                                                <label class=\"form-check-label\" for=\"remember-check\">Lưu tài khoản</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                        <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                        <div class=\"d-flex align-items-center justify-content-between mt-4 mb-0\">\r\n");
      out.write("                                            <a class=\"small\" href=\"TakeEmailj.jsp\">Forgot Password?</a>\r\n");
      out.write("                                            <input class=\"btn btn-primary\" value=\"Login\" type=\"submit\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"card-footer text-center py-3\">\r\n");
      out.write("                                    <div class=\"small\"><a href=\"register.html\">Need an account? Sign up!</a></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template/FooterPublic.jsp", out, false);
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
