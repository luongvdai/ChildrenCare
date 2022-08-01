package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feedbackdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html charset=\"utf-8\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta>\r\n");
      out.write("        <title>Feedback details</title>\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("        <meta content=\"\" name=\"keywords\">\r\n");
      out.write("        <meta content=\"\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Favicon -->\r\n");
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
      out.write("\r\n");
      out.write("        <!-- Libraries Stylesheet -->\r\n");
      out.write("        <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Template Stylesheet -->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <style>\r\n");
      out.write("            * {\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* Add a gray background color with some padding */\r\n");
      out.write("            body {\r\n");
      out.write("                font-family: Arial;\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                background: #f1f1f1;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* Header/Blog Title */\r\n");
      out.write("            .header {\r\n");
      out.write("                padding: 30px;\r\n");
      out.write("                font-size: 40px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                background: white;\r\n");
      out.write("            }\r\n");
      out.write("            .card {\r\n");
      out.write("                background-color: white;\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                margin-top: 20px;\r\n");
      out.write("                margin-right: 10%;\r\n");
      out.write("                margin-left: 20%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .row:after {\r\n");
      out.write("                content: \"\";\r\n");
      out.write("                display: table;\r\n");
      out.write("                clear: both;\r\n");
      out.write("            }\r\n");
      out.write("            /* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other */\r\n");
      out.write("            @media screen and (max-width: 800px) {\r\n");
      out.write("                .leftcolumn, .rightcolumn {   \r\n");
      out.write("                    width: 100%;\r\n");
      out.write("                    padding: 0;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Navbar Start -->\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg bg-white navbar-light sticky-top px-4 px-lg-5 py-lg-0\">\r\n");
      out.write("            <a href=\"HomePage.jsp\" class=\"navbar-brand\">\r\n");
      out.write("                <h1 class=\"m-0 text-primary\"><i class=\"fa fa-book-reader me-3\"></i>ChildrenCare</h1>\r\n");
      out.write("            </a>\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("                <div class=\"navbar-nav mx-auto\">\r\n");
      out.write("                    <a href=\"HomePage.jsp\" class=\"nav-item nav-link\">Home</a>\r\n");
      out.write("                    <a href=\"about.html\" class=\"nav-item nav-link active\">About Us</a>\r\n");
      out.write("                    <a href=\"classes.html\" class=\"nav-item nav-link\">Classes</a>\r\n");
      out.write("                    <div class=\"nav-item dropdown\">\r\n");
      out.write("                        <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Pages</a>\r\n");
      out.write("                        <div class=\"dropdown-menu rounded-0 rounded-bottom border-0 shadow-sm m-0\">\r\n");
      out.write("                            <a href=\"facility.html\" class=\"dropdown-item\">School Facilities</a>\r\n");
      out.write("                            <a href=\"team.html\" class=\"dropdown-item\">Popular Teachers</a>\r\n");
      out.write("                            <a href=\"call-to-action.html\" class=\"dropdown-item\">Become A Teachers</a>\r\n");
      out.write("                            <a href=\"appointment.html\" class=\"dropdown-item\">Make Appointment</a>\r\n");
      out.write("                            <a href=\"testimonial.html\" class=\"dropdown-item\">Testimonial</a>\r\n");
      out.write("                            <a href=\"404.html\" class=\"dropdown-item\">404 Error</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"contact.html\" class=\"nav-item nav-link\">Contact Us</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <a href=\"\" class=\"btn btn-primary rounded-pill px-3 d-none d-lg-block\">Join Us<i class=\"fa fa-arrow-right ms-3\"></i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!-- Navbar End -->\r\n");
      out.write("        <!-- Page Header End -->\r\n");
      out.write("        <div class=\"container-xxl py-5 page-header position-relative mb-5\">\r\n");
      out.write("            <div class=\"container py-5\">\r\n");
      out.write("                <h1 class=\"display-2 text-white animated slideInDown mb-4\">Feedback</h1>\r\n");
      out.write("                <nav aria-label=\"breadcrumb animated slideInDown\">\r\n");
      out.write("                    <ol class=\"breadcrumb\">\r\n");
      out.write("                        <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\r\n");
      out.write("                        <li class=\"breadcrumb-item\"><a href=\"#\">Feedback</a></li>\r\n");
      out.write("                        <li class=\"breadcrumb-item text-white active\" aria-current=\"page\">Details</li>\r\n");
      out.write("                    </ol>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Page Header End -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"leftcolumn\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <h2 style=\"border-bottom-style: ridge;\">Feedback details</h2>\r\n");
      out.write("                    <div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"container-fluid py-4\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-12\">\r\n");
      out.write("                            <div class=\"card mb-4\">\r\n");
      out.write("                                <div class=\"card-header pb-0\">\r\n");
      out.write("                                    <div class=\"card-body px-0 pt-0 pb-5\">\r\n");
      out.write("                                        <div class=\"table-responsive p-0\">\r\n");
      out.write("                                            <table class=\"table align-items-center justify-content-center mb-0\">\r\n");
      out.write("                                                <thead>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th class=\"text-uppercase text-secondary text-xx font-weight-bolder opacity-50 ps-2\">Full Name</th>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.feedbackuser.FullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" name=\"FullName\" readonly required>\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th class=\"text-uppercase text-secondary text-xx font-weight-bolder opacity-50 ps-2 \">Email</th>\r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.feedbackuser.Email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" name=\"Email\" readonly required>\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                <span class=\"glyphicon glyphicon-eye-open\"></span>                                            \r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th class=\"text-uppercase text-secondary text-xx font-weight-bolder opacity-50 ps-2\">Mobile</th>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.feedbackuser.Phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control\" name=\"Mobile\" readonly required>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th class=\"text-uppercase text-secondary text-xx font-weight-bolder opacity-50 ps-2\">Service</th>\r\n");
      out.write("                                                    <td class=\"align-middle text-sm mb-0\">\r\n");
      out.write("                                                        <input type=\"text\" value=\"Kham rang\" class=\"form-control\" name=\"Service\" readonly required>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th class=\"text-uppercase text-secondary text-xx font-weight-bolder opacity-50 ps-2\">Rate star</th>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th class=\"text-uppercase text-secondary text-xx font-weight-bolder opacity-50 ps-2\">Feedback</th>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        <textarea class=\"form-control\" name=\"details\" readonly required>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.feedbackdetails.detail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("                                                    </td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th class=\"text-uppercase text-secondary text-xx font-weight-bolder opacity-50 ps-2\">Status</th>\r\n");
      out.write("                                                    <td>\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                        ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                </thead>\r\n");
      out.write("                                            </table>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"modal-footer\">\r\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-secondary\" onclick='window.history.go(-1);'>Return</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div> \r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        <!-- Footer Start -->\r\n");
      out.write("        <div class=\"container-fluid bg-dark text-white-50 footer pt-5 mt-5 wow fadeIn\" data-wow-delay=\"0.1s\">\r\n");
      out.write("            <div class=\"container py-5\">\r\n");
      out.write("                <div class=\"row g-5\">\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                        <h3 class=\"text-white mb-4\">Get In Touch</h3>\r\n");
      out.write("                        <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt me-3\"></i>123 Street, New York, USA</p>\r\n");
      out.write("                        <p class=\"mb-2\"><i class=\"fa fa-phone-alt me-3\"></i>+012 345 67890</p>\r\n");
      out.write("                        <p class=\"mb-2\"><i class=\"fa fa-envelope me-3\"></i>info@example.com</p>\r\n");
      out.write("                        <div class=\"d-flex pt-2\">\r\n");
      out.write("                            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-youtube\"></i></a>\r\n");
      out.write("                            <a class=\"btn btn-outline-light btn-social\" href=\"\"><i class=\"fab fa-linkedin-in\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                        <h3 class=\"text-white mb-4\">Quick Links</h3>\r\n");
      out.write("                        <a class=\"btn btn-link text-white-50\" href=\"\">About Us</a>\r\n");
      out.write("                        <a class=\"btn btn-link text-white-50\" href=\"\">Contact Us</a>\r\n");
      out.write("                        <a class=\"btn btn-link text-white-50\" href=\"\">Our Services</a>\r\n");
      out.write("                        <a class=\"btn btn-link text-white-50\" href=\"\">Privacy Policy</a>\r\n");
      out.write("                        <a class=\"btn btn-link text-white-50\" href=\"\">Terms & Condition</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                        <h3 class=\"text-white mb-4\">Photo Gallery</h3>\r\n");
      out.write("                        <div class=\"row g-2 pt-2\">\r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <img class=\"img-fluid rounded bg-light p-1\" src=\"img/classes-1.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <img class=\"img-fluid rounded bg-light p-1\" src=\"img/classes-2.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <img class=\"img-fluid rounded bg-light p-1\" src=\"img/classes-3.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <img class=\"img-fluid rounded bg-light p-1\" src=\"img/classes-4.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <img class=\"img-fluid rounded bg-light p-1\" src=\"img/classes-5.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-4\">\r\n");
      out.write("                                <img class=\"img-fluid rounded bg-light p-1\" src=\"img/classes-6.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                        <h3 class=\"text-white mb-4\">Newsletter</h3>\r\n");
      out.write("                        <p>Dolor amet sit justo amet elitr clita ipsum elitr est.</p>\r\n");
      out.write("                        <div class=\"position-relative mx-auto\" style=\"max-width: 400px;\">\r\n");
      out.write("                            <input class=\"form-control bg-transparent w-100 py-3 ps-4 pe-5\" type=\"text\" placeholder=\"Your email\">\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-primary py-2 position-absolute top-0 end-0 mt-2 me-2\">SignUp</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"copyright\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-6 text-center text-md-start mb-3 mb-md-0\">\r\n");
      out.write("                            &copy; <a class=\"border-bottom\" href=\"#\">Your Site Name</a>, All Right Reserved. \r\n");
      out.write("                            <!--/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from \"https://htmlcodex.com/credit-removal\". Thank you for your support. ***/-->\r\n");
      out.write("                            Designed By <a class=\"border-bottom\" href=\"https://htmlcodex.com\">HTML Codex</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6 text-center text-md-end\">\r\n");
      out.write("                            <div class=\"footer-menu\">\r\n");
      out.write("                                <a href=\"\">Home</a>\r\n");
      out.write("                                <a href=\"\">Cookies</a>\r\n");
      out.write("                                <a href=\"\">Help</a>\r\n");
      out.write("                                <a href=\"\">FQAs</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Footer End -->\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.feedbackdetails.star == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            <span class=\"fas fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"far fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"far fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"far fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"far fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.feedbackdetails.star == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            <span class=\"fas fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"fas fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"far fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"far fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"far fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.feedbackdetails.star == 3}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            <span class=\"fas fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"fas fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"fas fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"far fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"far fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.feedbackdetails.star == 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            <span class=\"fas fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"fas fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"fas fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"fas fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"far fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.feedbackdetails.star == 5}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            <span class=\"fas fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"fas fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"fas fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"fas fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                            <span class=\"fas fa-star\" style=\"color: orange;\"></span>\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.feedbackdetails.status == 'view'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <a class=\"fas fa-eye\" style=\"font-size: 30px; color: black;\" href=\"feedbackstatus?status=view&feedback_id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${feedbackdetails.feedbackid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"></a>\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.feedbackdetails.status == 'hide'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <a class=\"fas fa-eye-slash\" style=\"font-size: 30px; color: black;\" href=\"feedbackstatus?status=hide&feedback_id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${feedbackdetails.feedbackid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"></a>\r\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }
}
