package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userTable_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<html lang=\"en\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-compatible\" content=\"IE-edge\">\r\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"img/apple-icon.png\">\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"img/favicon.png\">\r\n");
      out.write("        <title>\r\n");
      out.write("            Argon Dashboard 2 by Creative Tim\r\n");
      out.write("        </title>\r\n");
      out.write("        <!--     Fonts and icons     -->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- Nucleo Icons -->\r\n");
      out.write("        <link href=\"css/nucleo-icons.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"css/nucleo-svg.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- Font Awesome Icons -->\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/42d5adcbca.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link href=\"css/nucleo-svg.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- CSS Files -->\r\n");
      out.write("        <link id=\"pagestyle\" href=\"css/argon-dashboard.css?v=2.0.2\" rel=\"stylesheet\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.1.3/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("<body class=\"g-sidenav-show   bg-gray-100\">\r\n");
      out.write("        <div class=\"min-height-300 bg-primary position-absolute w-100\"></div>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template/AdminDashboard.jsp", out, false);
      out.write("\r\n");
      out.write("        <main class=\"main-content position-relative border-radius-lg \">\r\n");
      out.write("            <!-- Navbar -->\r\n");
      out.write("            <nav class=\"navbar navbar-main navbar-expand-lg px-0 mx-4 shadow-none border-radius-xl \" id=\"navbarBlur\" data-scroll=\"false\">\r\n");
      out.write("                <div class=\"container-fluid py-1 px-3\">\r\n");
      out.write("                    <nav aria-label=\"breadcrumb\">\r\n");
      out.write("                        <ol class=\"breadcrumb bg-transparent mb-0 pb-0 pt-1 px-0 me-sm-6 me-5\">\r\n");
      out.write("                            <li class=\"breadcrumb-item text-sm\"><a class=\"opacity-5 text-white\" href=\"dashboard\">Pages</a></li>\r\n");
      out.write("                            <li class=\"breadcrumb-item text-sm text-white active\" aria-current=\"page\">Tables</li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                        <h6 class=\"font-weight-bolder text-white mb-0\">Tables</h6>\r\n");
      out.write("                    </nav>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        \r\n");
      out.write("            <!-- End Navbar -->\r\n");
      out.write("            <div class=\"container-fluid py-5\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <div class=\"card mb-4\">\r\n");
      out.write("                            <div  class=\"card-header pb-0\">\r\n");
      out.write("                                <div  class=\"row\">\r\n");
      out.write("                                    <div class=\"col-md-4\">\r\n");
      out.write("                                        <h6>User Information</h6>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-md-4\">\r\n");
      out.write("                                        <form action=\"Fillter\" method=\"get\">\r\n");
      out.write("                                            <select name=\"gender\">\r\n");
      out.write("                                                <option value=\"\">all</option>\r\n");
      out.write("                                                <option value=\"1\">Male</option>\r\n");
      out.write("                                                <option value=\"0\">Female</option>\r\n");
      out.write("                                            </select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            <select name=\"role\">\r\n");
      out.write("                                                <option value=\"\">all</option>\r\n");
      out.write("                                                <option value=\"1\">Admin</option>\r\n");
      out.write("                                                <option value=\"2\">Manager</option>\r\n");
      out.write("                                                <option value=\"5\">Staff</option>\r\n");
      out.write("                                                <option value=\"4\">Customer</option>\r\n");
      out.write("                                            </select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            <select name=\"status\">\r\n");
      out.write("                                                <option value=\"\">all</option>\r\n");
      out.write("                                                <option value=\"1\">ACTIVE</option>\r\n");
      out.write("                                                <option value=\"0\">DEACTIVE</option>\r\n");
      out.write("                                            </select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            <input type=\"submit\" value=\"fillter\">\r\n");
      out.write("                                        </form>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-md-4\">\r\n");
      out.write("                                        <a href=\"AddUser.jsp\" class=\"text-success text-secondary font-weight-bold text-sm\" >Add new</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"card-body px-0 pt-0 pb-2\" >\r\n");
      out.write("                                <div class=\"table-responsive p-0\" >\r\n");
      out.write("                                    <table id=\"example\" class=\"table table-striped\" style=\"width:100%; margin-bottom: 50px \">\r\n");
      out.write("                                        <thead>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th>User</th>\r\n");
      out.write("                                                <th>User ID</th>\r\n");
      out.write("                                                <th>Name</th>\r\n");
      out.write("                                                <th>Gender</th>\r\n");
      out.write("                                                <th>Phone Number</th>\r\n");
      out.write("                                                <th>Role</th>\r\n");
      out.write("                                                <th>Status</th>\r\n");
      out.write("                                                <th>Edit</th>\r\n");
      out.write("                                                <th>Delete</th>\r\n");
      out.write("                                                <th>Detail</th>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </thead>\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </main>\r\n");
      out.write("   \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    <div id=\"addEmployeeModal\" class=\"modal fade\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <form action=\"add\" method=\"post\">\r\n");
      out.write("                    <div class=\"modal-header\">\t\t\t\t\t\t\r\n");
      out.write("                        <h4 class=\"modal-title\">Add Product</h4>\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\t\t\t\t\t\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>Name</label>\r\n");
      out.write("                            <input name=\"name\" type=\"text\" class=\"form-control\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>Image</label>\r\n");
      out.write("                            <input name=\"image\" type=\"text\" class=\"form-control\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>Price</label>\r\n");
      out.write("                            <input name=\"price\" type=\"text\" class=\"form-control\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>Title</label>\r\n");
      out.write("                            <textarea name=\"title\" class=\"form-control\" required></textarea>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>Description</label>\r\n");
      out.write("                            <textarea name=\"description\" class=\"form-control\" required></textarea>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>Category</label>\r\n");
      out.write("                            <select name=\"category\" class=\"form-select\" aria-label=\"Default select example\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\r\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-success\" value=\"Add\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Edit Modal HTML -->\r\n");
      out.write("    <div id=\"editEmployeeModal\" class=\"modal fade\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <form>\r\n");
      out.write("                    <div class=\"modal-header\">\t\t\t\t\t\t\r\n");
      out.write("                        <h4 class=\"modal-title\">Edit Employee</h4>\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\t\t\t\t\t\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>Name</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>Email</label>\r\n");
      out.write("                            <input type=\"email\" class=\"form-control\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>Address</label>\r\n");
      out.write("                            <textarea class=\"form-control\" required></textarea>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>Phone</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" required>\r\n");
      out.write("                        </div>\t\t\t\t\t\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\r\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-info\" value=\"Save\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Delete Modal HTML -->\r\n");
      out.write("    <div id=\"deleteEmployeeModal\" class=\"modal fade\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <form>\r\n");
      out.write("                    <div class=\"modal-header\">\t\t\t\t\t\t\r\n");
      out.write("                        <h4 class=\"modal-title\">Delete Product</h4>\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\t\t\t\t\t\r\n");
      out.write("                        <p>Are you sure you want to delete these Records?</p>\r\n");
      out.write("                        <p class=\"text-warning\"><small>This action cannot be undone.</small></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\r\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-danger\" value=\"Delete\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!--   Core JS Files   -->\r\n");
      out.write("    <script src=\"js/core/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"js/core/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/plugins/perfect-scrollbar.min.js\"></script>\r\n");
      out.write("    <script src=\"js/plugins/smooth-scrollbar.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("                                                            var win = navigator.platform.indexOf('Win') > -1;\r\n");
      out.write("                                                            if (win && document.querySelector('#sidenav-scrollbar')) {\r\n");
      out.write("                                                                var options = {\r\n");
      out.write("                                                                    damping: '0.5'\r\n");
      out.write("                                                                }\r\n");
      out.write("                                                                Scrollbar.init(document.querySelector('#sidenav-scrollbar'), options);\r\n");
      out.write("                                                            }\r\n");
      out.write("    </script>\r\n");
      out.write("    <!-- Github buttons -->\r\n");
      out.write("    <script async defer src=\"https://buttons.github.io/buttons.js\"></script>\r\n");
      out.write("    <!-- Control Center for Soft Dashboard: parallax effects, scripts for the example pages etc -->\r\n");
      out.write("    <script src=\"js/argon-dashboard.min.js?v=2.0.2\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap5.min.js\"></script>\r\n");
      out.write("    <script src=\"./js/app.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                <tr>\r\n");
          out.write("\r\n");
          out.write("                                                    <td>\r\n");
          out.write("                                                        <div class=\"d-flex px-2 py-1\">\r\n");
          out.write("                                                            <div>\r\n");
          out.write("                                                                <img src=\"img/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.avatar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"avatar avatar-sm me-3\" alt=\"user1\">\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                            <div class=\"d-flex flex-column justify-content-center\">\r\n");
          out.write("                                                                <h6 class=\"mb-0 text-sm\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\r\n");
          out.write("                                                                <p class=\"text-xs text-secondary mb-0\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                    </td>\r\n");
          out.write("\r\n");
          out.write("                                                    <td class=\"align-middle text-center\">\r\n");
          out.write("                                                        <span class=\"text-secondary text-xs font-weight-bold\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                                                    </td>\r\n");
          out.write("\r\n");
          out.write("                                                    <td class=\"align-middle text-center\">\r\n");
          out.write("                                                        <span class=\"text-secondary text-xs font-weight-bold\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.fullName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                                                    </td>\r\n");
          out.write("                                                    <td class=\"align-middle text-center\">\r\n");
          out.write("                                                        <span class=\"text-secondary text-xs font-weight-bold\">\r\n");
          out.write("                                                            ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                            ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                            </span>\r\n");
          out.write("\r\n");
          out.write("                                                        </td>\r\n");
          out.write("                                                        <td class=\"align-middle text-center\">\r\n");
          out.write("                                                            <span class=\"text-secondary text-xs font-weight-bold\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                                                    </td>\r\n");
          out.write("                                                    <td class=\"align-middle text-center\">\r\n");
          out.write("                                                        <span class=\"text-secondary text-xs font-weight-bold\">\r\n");
          out.write("                                                            ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                            ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                            ");
          if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                            ");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                            </span>\r\n");
          out.write("                                                        </td>\r\n");
          out.write("\r\n");
          out.write("                                                        <td class=\"align-middle text-center text-sm\">\r\n");
          out.write("\r\n");
          out.write("                                                        ");
          if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(" \r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                                        ");
          if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(" \r\n");
          out.write("\r\n");
          out.write("                                                        </td>\r\n");
          out.write("\r\n");
          out.write("                                                        <td class=\"align-middle\">\r\n");
          out.write("                                                            <a href=\"LoadControl?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"text-success text-secondary font-weight-bold text-xs\" data-toggle=\"tooltip\" data-original-title=\"Edit user\"><i class=\"fas fa-pencil-alt text-dark me-2\" aria-hidden=\"true\"></i>\r\n");
          out.write("                                                            Edit\r\n");
          out.write("                                                        </a>\r\n");
          out.write("                                                    </td>\r\n");
          out.write("                                                    <td class=\"align-middle\">\r\n");
          out.write("                                                        <a href=\"delete?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"text-danger text-secondary font-weight-bold text-xs\" data-toggle=\"tooltip\" onclick=\"return confirm('Are you sure you want to delete this item?');\"><i class=\"far fa-trash-alt me-2\"></i>Delete</a>\r\n");
          out.write("\r\n");
          out.write("                                                    </td>\r\n");
          out.write("                                                    <td class=\"align-middle\">\r\n");
          out.write("                                                        <a href=\"DetailControl?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"text-secondary font-weight-bold text-xs\" data-toggle=\"tooltip\" data-original-title=\"Edit user\">\r\n");
          out.write("                                                            Detail\r\n");
          out.write("                                                        </a>\r\n");
          out.write("                                                    </td>\r\n");
          out.write("\r\n");
          out.write("                                                </tr>\r\n");
          out.write("                                            ");
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.gender == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Male");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.gender == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Female");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.role == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Admin");
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

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.role == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Manager");
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

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.role == 5}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Staff");
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

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.role == 4}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Customer");
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

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.status == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                            <span class=\"badge badge-sm bg-gradient-success\">Active</span>");
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

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.status == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" <span class=\"badge badge-sm bg-gradient-danger\">Deactive</span>");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
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
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                                ");
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
}
