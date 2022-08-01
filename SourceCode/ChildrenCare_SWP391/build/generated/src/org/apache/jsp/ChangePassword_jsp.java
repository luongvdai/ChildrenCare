package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ChangePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     <head>\r\n");
      out.write("  \t<title>Change Password</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700,900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"ResetPass/css/style.css\">\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700,900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"ResetPass/css/style.css\">\r\n");
      out.write("        \r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("        <meta content=\"\" name=\"keywords\">\r\n");
      out.write("        <meta content=\"\" name=\"description\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Google Web Fonts -->\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Inter:wght@600&family=Lobster+Two:wght@700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Icon Font Stylesheet -->\r\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("        <!-- Libraries Stylesheet -->\r\n");
      out.write("        <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Template Stylesheet -->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                $(\"button\").click(function () {\r\n");
      out.write("                    $(\".show\").toggle();\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                font-family: \"Heebo\",sans-serif;\r\n");
      out.write("                font-size: 1rem;\r\n");
      out.write("                font-weight: 400;\r\n");
      out.write("                line-height: 1.5;\r\n");
      out.write("                color: #74787C;\r\n");
      out.write("                background-color: #FFF5F3;\r\n");
      out.write("                -webkit-text-size-adjust: 100%;\r\n");
      out.write("                -webkit-tap-highlight-color: rgba(0,0,0,0);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .text-primary {\r\n");
      out.write("                color: #FE5D37 !important;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            .navbar .navbar-nav .nav-link {\r\n");
      out.write("                padding: 30px 15px;\r\n");
      out.write("                color: #103741;\r\n");
      out.write("                font-weight: 500;\r\n");
      out.write("                outline: none;\r\n");
      out.write("            }\r\n");
      out.write("            .all{\r\n");
      out.write("\r\n");
      out.write("                margin: auto;\r\n");
      out.write("                width: 70%;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            .table_r {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                border-collapse: collapse;\r\n");
      out.write("                overflow: hidden;\r\n");
      out.write("                box-shadow: 0 0 20px rgba(0,0,0,0.1);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .table_r th {\r\n");
      out.write("                font-size: 22px;\r\n");
      out.write("                text-align: center;  \r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                background-color: #FE5D37;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .table_r td {\r\n");
      out.write("                text-align: center;  \r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                background-color: rgba(255,255,255,0.2);\r\n");
      out.write("                color: #000;\r\n");
      out.write("            }.btn.btn-primary{\r\n");
      out.write("                background: #FE5D37;\r\n");
      out.write("            }.text-wrap{\r\n");
      out.write("                background: #FE5D37;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("            \r\n");
      out.write("             <!-- Navbar Start -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/Template/HeadMenuPublic.jsp", out, false);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <!-- Navbar End -->\r\n");
      out.write("            \r\n");
      out.write("            <section class=\"ftco-section\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row justify-content-center\">\r\n");
      out.write("                        <div class=\"col-md-6 text-center mb-5\">\r\n");
      out.write("                            <h2 class=\"heading-section\" style=\";font-size: 40px;\">Change Password</h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row justify-content-center\">\r\n");
      out.write("                        <div class=\"col-md-12 col-lg-10\">\r\n");
      out.write("                            <div class=\"wrap d-md-flex\">\r\n");
      out.write("                                <div class=\"text-wrap p-4 p-lg-5 text-center d-flex align-items-center order-md-last\">\r\n");
      out.write("                                    <div class=\"text w-100\">\r\n");
      out.write("                                        <h2>Welcome to ChildrenCare</h2>\r\n");
      out.write("                                        <p>Don't have an account?</p>\r\n");
      out.write("                                        <a href=\"login.jsp\" class=\"btn btn-white btn-outline-white\">Sign Up</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"login-wrap p-4 p-lg-5\">\r\n");
      out.write("                                    <div class=\"d-flex\">\r\n");
      out.write("                                        <div class=\"w-100\">\r\n");
      out.write("                                            <h3 class=\"mb-4\">Change Password</h3>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <form action=\"ChangePassword\" method=\"post\">\r\n");
      out.write("                                        <div class=\"form-group mb-3\">\r\n");
      out.write("                                            <label class=\"label\" for=\"name\">New Password</label>\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" name=\"newpass\" placeholder=\"Username\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group mb-3\">\r\n");
      out.write("                                            <label class=\"label\" for=\"password\">Retype New Password</label>\r\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" name=\"retypepass\" placeholder=\"Password\" required>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <button type=\"submit\" class=\"form-control btn btn-primary submit px-3\">Change Password</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                        <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Footer Start -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/Template/FooterPublic.jsp", out, false);
      out.write("\r\n");
      out.write("        <!-- Footer End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- JavaScript Libraries -->\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <script src=\"lib/wow/wow.min.js\"></script>\r\n");
      out.write("        <script src=\"lib/easing/easing.min.js\"></script>\r\n");
      out.write("        <script src=\"lib/waypoints/waypoints.min.js\"></script>\r\n");
      out.write("        <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Template Javascript -->\r\n");
      out.write("        <script src=\"js/main.js\"></script>    \r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
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
