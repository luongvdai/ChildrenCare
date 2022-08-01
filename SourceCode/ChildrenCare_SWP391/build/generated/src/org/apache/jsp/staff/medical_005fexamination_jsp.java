package org.apache.jsp.staff;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class medical_005fexamination_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("        <meta content=\"\" name=\"keywords\">\r\n");
      out.write("        <meta content=\"\" name=\"description\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("        <title>View Medical Examination</title>\r\n");
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
      out.write("                padding: 30px;\r\n");
      out.write("                margin: auto;\r\n");
      out.write("                width: 70%;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            .table_m {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                border-collapse: collapse;\r\n");
      out.write("                overflow: hidden;\r\n");
      out.write("                box-shadow: 0 0 20px rgba(0,0,0,0.1);\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            .table_m td {\r\n");
      out.write("                padding: 15px;\r\n");
      out.write("                background-color: rgba(255,255,255,0.2);\r\n");
      out.write("                color: #000;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .table_m th {\r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("                padding: 15px;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                background-color: #FE5D37;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <!-- Navbar Start -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/Template/HeadMenuPublic.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Navbar End -->\r\n");
      out.write("\r\n");
      out.write("        <div>\r\n");
      out.write("            <div class=\"all\">\r\n");
      out.write("                <form action=\"filtermedical\" method=\"get\" >\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th> <select  name=\"service\" class=\"form-control\">\r\n");
      out.write("                                    <option value=\"\">All</option>\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </select></th>\r\n");
      out.write("                            <th><input type=\"date\" name=\"from\" class=\"form-control\"></th>\r\n");
      out.write("                            <th><input type=\"date\" name=\"to\" class=\"form-control\"></th>\r\n");
      out.write("                            <th><select  name=\"medical\" class=\"form-control\">\r\n");
      out.write("                                    <option value=\"\">All</option>\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </select></th>\r\n");
      out.write("                            <th><input type=\"submit\" value=\"filter\" class=\"btn btn-secondary\"></th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("                <table class=\"table_m\">\r\n");
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th colspan=\"10\">the history of examination</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>date</th>\r\n");
      out.write("                        <th>used services</th>\r\n");
      out.write("                        <th>Medicine_name</th>\r\n");
      out.write("                        <th>Amount</th>\r\n");
      out.write("                        <th>Price</th>\r\n");
      out.write("                        <th>country</th>\r\n");
      out.write("                        <th>Expiry date</th>\r\n");
      out.write("                        <th>Detail</th>\r\n");
      out.write("                        <th>Image</th>\r\n");
      out.write("                        <th>Note</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"copyright\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-6 text-center text-md-start mb-3 mb-md-0\">\r\n");
      out.write("                            &copy; <a class=\"border-bottom\" href=\"#\">Your Site Name</a>, All Right Reserved. \r\n");
      out.write("\r\n");
      out.write("                            <!--/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from \"https://htmlcodex.com/credit-removal\". Thank you for your support. ***/-->\r\n");
      out.write("                            Designed By <a class=\"border-bottom\" href=\"https://muldtech.com\">TEAM3_SE1610</a>\r\n");
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
      out.write("        <script src=\"js/main.js\"></script>        \r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.se}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("s");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <option>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.servicename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.me}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("m");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <option>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m.medicinename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.all}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("a");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.reservations.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.service.servicename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.medicine.medicinename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.prescription.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.medicine.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.medicine.country}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.medicine.expirydate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.medicine.detail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.medicine.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.prescription.note}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
