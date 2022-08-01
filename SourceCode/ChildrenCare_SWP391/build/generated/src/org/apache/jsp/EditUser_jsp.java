package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicon.ico\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("\r\n");
      out.write("        <title>Light Bootstrap Dashboard by Creative Tim</title>\r\n");
      out.write("\r\n");
      out.write("        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap core CSS     -->\r\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("        <!-- Animation library for notifications   -->\r\n");
      out.write("        <link href=\"assets/css/animate.min.css\" rel=\"stylesheet\"/>\r\n");
      out.write("\r\n");
      out.write("        <!--  Light Bootstrap Table core CSS    -->\r\n");
      out.write("        <link href=\"assets/css/light-bootstrap-dashboard.css?v=1.4.0\" rel=\"stylesheet\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--  CSS for Demo Purpose, don't include it in your project     -->\r\n");
      out.write("        <link href=\"assets/css/demo.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--     Fonts and icons     -->\r\n");
      out.write("        <link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href=\"assets/css/pe-icon-7-stroke.css\" rel=\"stylesheet\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            <div class=\"main-panel\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-8\">\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <div class=\"header\">\r\n");
      out.write("                                        <h4 class=\"title text-bolder\">Edit New User</h4>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"content\">\r\n");
      out.write("                                        <form action=\"Edit\" method=\"get\">\r\n");
      out.write("                                            <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"row\">\r\n");
      out.write("                                                    <div class=\"col-md-6\">\r\n");
      out.write("                                                        <div class=\"form-group\" >\r\n");
      out.write("                                                            <label>ID</label>\r\n");
      out.write("                                                            <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"id\" type=\"text\"  class=\"form-control\" readonly required>\r\n");
      out.write("                                                        </div> \r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"col-md-6\">\r\n");
      out.write("                                                        <div class=\"form-group\">\r\n");
      out.write("                                                            <label>Status</label>\r\n");
      out.write("                                                            <select  name=\"status\"  style=\"margin-top: 26px;padding: 10px;margin-left: 10px\">  \r\n");
      out.write("                                                                <option value=\"1\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.status == 1 ? \"selected\": \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Active</option>\r\n");
      out.write("                                                                <option value=\"0\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.status == 0 ? \"selected\": \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">Deactive</option>\r\n");
      out.write("                                                            </select>\r\n");
      out.write("\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label>Role</label>\r\n");
      out.write("                                                    <select name=\"role\">\r\n");
      out.write("                                                        <option value=\"1\">Admin</option>\r\n");
      out.write("                                                         <option value=\"2\">Manager</option>\r\n");
      out.write("                                                         <option value=\"4\" >Staff</option>\r\n");
      out.write("                                                         <option value=\"5\">Customer</option>\r\n");
      out.write("                                                         \r\n");
      out.write("                                                    </select>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"modal-footer\">\r\n");
      out.write("                                                <a href=\"manager\" class=\"btn btn-default\" data-dismiss=\"modal\">Back to manager</a>\r\n");
      out.write("                                                <input type=\"submit\" class=\"btn btn-success\" value=\"Edit\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<!--   Core JS Files   -->\r\n");
      out.write("<script src=\"assets/js/jquery.3.2.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--  Charts Plugin -->\r\n");
      out.write("<script src=\"assets/js/chartist.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--  Notifications Plugin    -->\r\n");
      out.write("<script src=\"assets/js/bootstrap-notify.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--  Google Maps Plugin    -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->\r\n");
      out.write("<script src=\"assets/js/light-bootstrap-dashboard.js?v=1.4.0\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Light Bootstrap Table DEMO methods, don't include it in your project! -->\r\n");
      out.write("<script src=\"assets/js/demo.js\"></script>\r\n");
      out.write("\r\n");
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
