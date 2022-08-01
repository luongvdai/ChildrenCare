package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entity.Type;
import DAO.SettingDAO;
import java.util.List;
import Entity.Setting;

public final class ListSetting_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_end_begin.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"img/apple-icon.png\">\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"img/favicon.png\">\n");
      out.write("        <title>\n");
      out.write("            Setting list\n");
      out.write("        </title>\n");
      out.write("        <!--     Fonts and icons     -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Nucleo Icons -->\n");
      out.write("        <link href=\"css/nucleo-icons.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/nucleo-svg.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Font Awesome Icons -->\n");
      out.write("        <script src=\"https://kit.fontawesome.com/42d5adcbca.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"css/nucleo-svg.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- CSS Files -->\n");
      out.write("        <link id=\"pagestyle\" href=\"css/argon-dashboard.css?v=2.0.2\" rel=\"stylesheet\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Setting</title>\n");
      out.write("        ");
 SettingDAO dao = new SettingDAO(); 
      out.write("\n");
      out.write("        ");
 List<Type> listT = dao.GetAllType();
      out.write("\n");
      out.write("        ");
 List<Setting> list = (List<Setting>) request.getAttribute("listSetting");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    ");
      DAO.SettingDAO a = null;
      synchronized (request) {
        a = (DAO.SettingDAO) _jspx_page_context.getAttribute("a", PageContext.REQUEST_SCOPE);
        if (a == null){
          a = new DAO.SettingDAO();
          _jspx_page_context.setAttribute("a", a, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        <body class=\"g-sidenav-show   bg-gray-100\">\n");
      out.write("            <div class=\"min-height-300 bg-primary position-absolute w-100\"></div>\n");
      out.write("            <aside class=\"sidenav bg-white navbar navbar-vertical navbar-expand-xs border-0 border-radius-xl my-3 fixed-start ms-4 \" id=\"sidenav-main\">\n");
      out.write("                <div class=\"sidenav-header\">\n");
      out.write("                    <i class=\"fas fa-times p-3 cursor-pointer text-secondary opacity-5 position-absolute end-0 top-0 d-none d-xl-none\" aria-hidden=\"true\" id=\"iconSidenav\"></i>\n");
      out.write("                    <a class=\"navbar-brand m-0\" href=\" https://demos.creative-tim.com/argon-dashboard/pages/dashboard.html \" target=\"_blank\">\n");
      out.write("                        <img src=\"img/logo-ct-dark.png\" class=\"navbar-brand-img h-100\" alt=\"main_logo\">\n");
      out.write("                        <span class=\"ms-1 font-weight-bold\">Children Care</span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <hr class=\"horizontal dark mt-0\">\n");
      out.write("                <div class=\"collapse navbar-collapse  w-auto \" id=\"sidenav-collapse-main\">\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link \" href=\"dashboard\">\n");
      out.write("                                <div class=\"icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center\">\n");
      out.write("                                    <i class=\"ni ni-tv-2 text-primary text-sm opacity-10\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"nav-link-text ms-1\">Dashboard</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"manager\">\n");
      out.write("                                <div class=\"icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center\">\n");
      out.write("                                    <i class=\"ni ni-calendar-grid-58 text-warning text-sm opacity-10\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"nav-link-text ms-1\">Tables</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link \" href=\"pages/billing.html\">\n");
      out.write("                                <div class=\"icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center\">\n");
      out.write("                                    <i class=\"ni ni-credit-card text-success text-sm opacity-10\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"nav-link-text ms-1\">Billing</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link \" href=\"../pages/virtual-reality.html\">\n");
      out.write("                                <div class=\"icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center\">\n");
      out.write("                                    <i class=\"ni ni-app text-info text-sm opacity-10\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"nav-link-text ms-1\">Virtual Reality</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"settinglist\">\n");
      out.write("                                <div class=\"icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center\">\n");
      out.write("                                    <i class=\"ni ni-settings text-dark text-sm opacity-10\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"nav-link-text ms-1\">Setting</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item mt-3\">\n");
      out.write("                            <h6 class=\"ps-4 ms-2 text-uppercase text-xs font-weight-bolder opacity-6\">Account pages</h6>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link \" href=\"pages/profile.html\">\n");
      out.write("                                <div class=\"icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center\">\n");
      out.write("                                    <i class=\"ni ni-single-02 text-dark text-sm opacity-10\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"nav-link-text ms-1\">Profile</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link \" href=\"../pages/sign-in.html\">\n");
      out.write("                                <div class=\"icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center\">\n");
      out.write("                                    <i class=\"ni ni-single-copy-04 text-warning text-sm opacity-10\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"nav-link-text ms-1\">Sign In</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link \" href=\"pages/sign-up.html\">\n");
      out.write("                                <div class=\"icon icon-shape icon-sm border-radius-md text-center me-2 d-flex align-items-center justify-content-center\">\n");
      out.write("                                    <i class=\"ni ni-collection text-info text-sm opacity-10\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <span class=\"nav-link-text ms-1\">Sign Up</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </aside>\n");
      out.write("            <main class=\"main-content position-relative border-radius-lg \">\n");
      out.write("                <!-- Navbar -->\n");
      out.write("                <nav class=\"navbar navbar-main navbar-expand-lg px-0 mx-4 shadow-none border-radius-xl \" id=\"navbarBlur\" data-scroll=\"false\">\n");
      out.write("                    <div class=\"container-fluid py-1 px-3\">\n");
      out.write("                        <nav aria-label=\"breadcrumb\">\n");
      out.write("                            <ol class=\"breadcrumb bg-transparent mb-0 pb-0 pt-1 px-0 me-sm-6 me-5\">\n");
      out.write("                                <li class=\"breadcrumb-item text-sm\"><a class=\"opacity-5 text-white\" href=\"javascript:;\">Pages</a></li>\n");
      out.write("                                <li class=\"breadcrumb-item text-sm text-white active\">Setting</li>\n");
      out.write("                            </ol>\n");
      out.write("                            <h6 class=\"font-weight-bolder text-white mb-0\">Setting</h6>\n");
      out.write("                        </nav>\n");
      out.write("                        <div class=\"collapse navbar-collapse mt-sm-0 mt-2 me-md-0 me-sm-4\" id=\"navbar\">\n");
      out.write("                            <div class=\"ms-md-auto pe-md-3 d-flex align-items-center\">\n");
      out.write("                                <form action=\"SearchSetting\" method=\"post\">\n");
      out.write("                                    <div class=\"input-group\">\n");
      out.write("                                        <button  class=\"input-group-text text-body\"><i type=\"submit\" class=\"fas fa-search\" aria-hidden=\"true\"></i></button>\n");
      out.write("                                        <input name=\"txt\" type=\"text\" class=\"form-control\" placeholder=\"Type here...\">\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <ul class=\"navbar-nav  justify-content-end\">\n");
      out.write("                                <li class=\"nav-item d-flex align-items-center\">\n");
      out.write("                                    <a href=\"javascript:;\" class=\"nav-link text-white font-weight-bold px-0\">\n");
      out.write("                                        <i class=\"fa fa-user me-sm-1\"></i>\n");
      out.write("                                        <span class=\"d-sm-inline d-none\">Sign In</span>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item d-xl-none ps-3 d-flex align-items-center\">\n");
      out.write("                                    <a href=\"javascript:;\" class=\"nav-link text-white p-0\" id=\"iconNavbarSidenav\">\n");
      out.write("                                        <div class=\"sidenav-toggler-inner\">\n");
      out.write("                                            <i class=\"sidenav-toggler-line bg-white\"></i>\n");
      out.write("                                            <i class=\"sidenav-toggler-line bg-white\"></i>\n");
      out.write("                                            <i class=\"sidenav-toggler-line bg-white\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item px-3 d-flex align-items-center\">\n");
      out.write("                                    <a href=\"javascript:;\" class=\"nav-link text-white p-0\">\n");
      out.write("                                        <i class=\"fa fa-cog fixed-plugin-button-nav cursor-pointer\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item dropdown pe-2 d-flex align-items-center\">\n");
      out.write("                                    <a href=\"javascript:;\" class=\"nav-link text-white p-0\" id=\"dropdownMenuButton\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                        <i class=\"fa fa-bell cursor-pointer\"></i>\n");
      out.write("                                        <ul class=\"dropdown-menu  dropdown-menu-end  px-2 py-3 me-sm-n4\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                                        </ul>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                <!-- End Navbar -->\n");
      out.write("                <div class=\"container-fluid py-4\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <div class=\"card mb-4\">\n");
      out.write("                                <div class=\"card-header pb-0\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-4\">\n");
      out.write("                                            <h6>SETTING LIST</h6>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-2\">\n");
      out.write("                                            <li style=\"list-style: none\" class=\"nav-item dropdown\">\n");
      out.write("                                                <a class=\"dropdown-toggle\" data-bs-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-expanded=\"false\">Type</a>\n");
      out.write("                                                <ul class=\"dropdown-menu\">\n");
      out.write("                                                ");
 for (Type t : listT) {
      out.write("\n");
      out.write("                                                <li><a class=\"dropdown-item\" href=\"SearchSetting?type=");
      out.print( t.getType_ID());
      out.write('"');
      out.write('>');
      out.print( t.getType_Name());
      out.write("</a></li>\n");
      out.write("                                                    ");
}
      out.write("\n");
      out.write("                                            </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-2\">\n");
      out.write("                                        <li style=\"list-style: none\" class=\"nav-item dropdown\">\n");
      out.write("                                            <a class=\"dropdown-toggle\" data-bs-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-expanded=\"false\">Status</a>\n");
      out.write("                                            <ul class=\"dropdown-menu\">\n");
      out.write("                                                <li><a class=\"dropdown-item\" href=\"SearchSetting?active=1\">Active</a></li>\n");
      out.write("                                                <li><a class=\"dropdown-item\" href=\"SearchSetting?active=0\">Deactive</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-success\" data-bs-toggle=\"modal\" data-bs-target=\"#AddnewSetting\">add new setting</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"modal fade\" id=\"AddnewSetting\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("                                        <div class=\"modal-dialog\">\n");
      out.write("                                            <div class=\"modal-content\">\n");
      out.write("                                                <div class=\"modal-header\">\n");
      out.write("                                                    <h5 class=\"modal-title\" id=\"exampleModalLabel\">New setting</h5>\n");
      out.write("                                                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                                                </div>\n");
      out.write("                                                <form action=\"addsetting\" method=\"post\">\n");
      out.write("                                                    <div class=\"modal-body\">\n");
      out.write("                                                        <div>\n");
      out.write("                                                            <div class=\"col-lg-5\">\n");
      out.write("                                                                <label for=\"type\" class=\"col-form-label\">Type:</label>\n");
      out.write("                                                                <select class=\"form-control m-b-10\" name=\"type\">\n");
      out.write("                                                                    ");
 for (Type t : listT) {
      out.write("\n");
      out.write("                                                                    <option value=\"");
      out.print( t.getType_ID());
      out.write('"');
      out.write('>');
      out.print( t.getType_Name());
      out.write("</option>\n");
      out.write("                                                                    ");
}
      out.write("\n");
      out.write("                                                                </select>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"mb-3\">\n");
      out.write("                                                                <label for=\"value\" class=\"col-form-label\">Value:</label>\n");
      out.write("                                                                <input type=\"text\" name=\"value\" class=\"form-control\" required=\"\" >\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"mb-3\">\n");
      out.write("                                                                <label for=\"description\" class=\"col-form-label\">Description:</label>\n");
      out.write("                                                                <textarea class=\"form-control\" name=\"description\" required=\"\" autofocus=\"\"></textarea>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"modal-footer\">\n");
      out.write("                                                            <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\n");
      out.write("                                                            <button type=\"submit\" class=\"btn btn-primary\">add</button>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </form>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-body px-0 pt-0 pb-5\">\n");
      out.write("                                    <div class=\"table-responsive p-0\">\n");
      out.write("                                        <table class=\"table align-items-center justify-content-center mb-0\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th class=\"text-uppercase text-secondary text-xx font-weight-bolder opacity-50 ps-4\">Setting ID</th>\n");
      out.write("                                                    <th class=\"text-uppercase text-secondary text-xx font-weight-bolder opacity-50 ps-2\">type</th>\n");
      out.write("                                                    <th class=\"text-uppercase text-secondary text-xx font-weight-bolder opacity-50 ps-2\">value</th>\n");
      out.write("                                                    <th class=\"text-uppercase text-secondary text-xx font-weight-bolder text-center opacity-50 ps-3\">Status</th>\n");
      out.write("                                                    <th class=\"text-uppercase text-secondary text-xx font-weight-bolder opacity-50 ps-3\">Details</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            ");
 for (int i = 0; i < list.size(); i++) {
      out.write("\n");
      out.write("                                            <tbody>\n");
      out.write("                                                <tr>\n");
      out.write("\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <p class=\"text-sm font-weight-bold mb-0 ps-4\">");
      out.print( list.get(i).getSetting_ID());
      out.write("</p>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <p class=\"text-sm font-weight-bold mb-0\">");
      out.print( dao.GetTypeName(list.get(i).getType_ID()));
      out.write("</p>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <span class=\"text-uppercase text-xs font-weight-bold\">");
      out.print( list.get(i).getValue());
      out.write("</span>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    ");
 if (list.get(i).isStatus()) {
      out.write("\n");
      out.write("                                                    <td class=\"align-middle text-center text-sm ps-0\">\n");
      out.write("                                                        <span class=\"badge badge-sm bg-gradient-success\" >Active</span>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    ");
} else {
      out.write("\n");
      out.write("                                                    <td class=\"align-middle text-center text-sm ps-0\">\n");
      out.write("                                                        <span class=\"badge badge-sm bg-gradient-danger\">Deactive</span>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    ");
}
      out.write("\n");
      out.write("                                                    <td class=\"align-middle\">\n");
      out.write("                                                        <a type=\"button\" class=\"btn btn-primary mb-0\" href=\"settingdetails?id=");
      out.print( list.get(i).getSetting_ID());
      out.write("\">\n");
      out.write("                                                            view\n");
      out.write("                                                        </a>\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </tbody>\n");
      out.write("                                            ");
}
      out.write("\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div style=\"margin: 20px auto; width: 500px\" aria-label=\"...\">\n");
      out.write("                                        <ul class=\"pagination\">\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("        </main>\n");
      out.write("        <div class=\"fixed-plugin\">\n");
      out.write("            <a class=\"fixed-plugin-button text-dark position-fixed px-3 py-2\">\n");
      out.write("                <i class=\"fa fa-cog py-2\"> </i>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"card shadow-lg\">\n");
      out.write("                <div class=\"card-header pb-0 pt-3 \">\n");
      out.write("                    <div class=\"float-end\">\n");
      out.write("                        <h5 class=\"mt-3 mb-0\">Argon Configurator</h5>\n");
      out.write("                        <p>See our dashboard options.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"float-start mt-4\">\n");
      out.write("                        <button class=\"btn btn-link text-dark p-0 fixed-plugin-close-button\">\n");
      out.write("                            <i class=\"fa fa-close\"></i>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Toggle Button -->\n");
      out.write("                </div>\n");
      out.write("                <hr class=\"horizontal dark my-1\">\n");
      out.write("                <div class=\"card-body pt-sm-3 pt-0 overflow-auto\">\n");
      out.write("                    <!-- Sidebar Backgrounds -->\n");
      out.write("                    <div>\n");
      out.write("                        <h6 class=\"mb-0\">Sidebar Colors</h6>\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"javascript:void(0)\" class=\"switch-trigger background-color\">\n");
      out.write("                        <div class=\"badge-colors my-2 text-end\">\n");
      out.write("                            <span class=\"badge filter bg-gradient-primary active\" data-color=\"primary\" onclick=\"sidebarColor(this)\"></span>\n");
      out.write("                            <span class=\"badge filter bg-gradient-dark\" data-color=\"dark\" onclick=\"sidebarColor(this)\"></span>\n");
      out.write("                            <span class=\"badge filter bg-gradient-info\" data-color=\"info\" onclick=\"sidebarColor(this)\"></span>\n");
      out.write("                            <span class=\"badge filter bg-gradient-success\" data-color=\"success\" onclick=\"sidebarColor(this)\"></span>\n");
      out.write("                            <span class=\"badge filter bg-gradient-warning\" data-color=\"warning\" onclick=\"sidebarColor(this)\"></span>\n");
      out.write("                            <span class=\"badge filter bg-gradient-danger\" data-color=\"danger\" onclick=\"sidebarColor(this)\"></span>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                    <!-- Sidenav Type -->\n");
      out.write("                    <div class=\"mt-3\">\n");
      out.write("                        <h6 class=\"mb-0\">Sidenav Type</h6>\n");
      out.write("                        <p class=\"text-sm\">Choose between 2 different sidenav types.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-flex\">\n");
      out.write("                        <button class=\"btn bg-gradient-primary w-100 px-3 mb-2 active ms-2\" data-class=\"bg-white\" onclick=\"sidebarType(this)\">White</button>\n");
      out.write("                        <button class=\"btn bg-gradient-primary w-100 px-3 mb-2\" data-class=\"bg-default\" onclick=\"sidebarType(this)\">Dark</button>\n");
      out.write("                    </div>\n");
      out.write("                    <p class=\"text-sm d-xl-none d-block mt-2\">You can change the sidenav type just on desktop view.</p>\n");
      out.write("                    <!-- Navbar Fixed -->\n");
      out.write("                    <div class=\"d-flex my-3\">\n");
      out.write("                        <h6 class=\"mb-0\">Navbar Fixed</h6>\n");
      out.write("                        <div class=\"form-check form-switch ps-0 ms-auto my-auto\">\n");
      out.write("                            <input class=\"form-check-input mt-1 float-end me-auto\" type=\"checkbox\" id=\"navbarFixed\" onclick=\"navbarFixed(this)\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr class=\"horizontal dark my-sm-4\">\n");
      out.write("                    <div class=\"mt-2 mb-5 d-flex\">\n");
      out.write("                        <h6 class=\"mb-0\">Light / Dark</h6>\n");
      out.write("                        <div class=\"form-check form-switch ps-0 ms-auto my-auto\">\n");
      out.write("                            <input class=\"form-check-input mt-1 float-end me-auto\" type=\"checkbox\" id=\"dark-version\" onclick=\"darkMode(this)\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--   Core JS Files   -->\n");
      out.write("        <script src=\"js/core/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/core/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/plugins/perfect-scrollbar.min.js\"></script>\n");
      out.write("        <script src=\"js/plugins/smooth-scrollbar.min.js\"></script>\n");
      out.write("        <script src=\"js/plugins/chartjs.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                                var ctx1 = document.getElementById(\"chart-line\").getContext(\"2d\");\n");
      out.write("\n");
      out.write("                                var gradientStroke1 = ctx1.createLinearGradient(0, 230, 0, 50);\n");
      out.write("\n");
      out.write("                                gradientStroke1.addColorStop(1, 'rgba(94, 114, 228, 0.2)');\n");
      out.write("                                gradientStroke1.addColorStop(0.2, 'rgba(94, 114, 228, 0.0)');\n");
      out.write("                                gradientStroke1.addColorStop(0, 'rgba(94, 114, 228, 0)');\n");
      out.write("                                new Chart(ctx1, {\n");
      out.write("                                    type: \"line\",\n");
      out.write("                                    data: {\n");
      out.write("                                        labels: [\"Apr\", \"May\", \"Jun\", \"Jul\", \"Aug\", \"Sep\", \"Oct\", \"Nov\", \"Dec\"],\n");
      out.write("                                        datasets: [{\n");
      out.write("                                                label: \"Mobile apps\",\n");
      out.write("                                                tension: 0.4,\n");
      out.write("                                                borderWidth: 0,\n");
      out.write("                                                pointRadius: 0,\n");
      out.write("                                                borderColor: \"#5e72e4\",\n");
      out.write("                                                backgroundColor: gradientStroke1,\n");
      out.write("                                                borderWidth: 3,\n");
      out.write("                                                        fill: true,\n");
      out.write("                                                data: [50, 40, 300, 220, 500, 250, 400, 230, 500],\n");
      out.write("                                                maxBarThickness: 6\n");
      out.write("\n");
      out.write("                                            }],\n");
      out.write("                                    },\n");
      out.write("                                    options: {\n");
      out.write("                                        responsive: true,\n");
      out.write("                                        maintainAspectRatio: false,\n");
      out.write("                                        plugins: {\n");
      out.write("                                            legend: {\n");
      out.write("                                                display: false,\n");
      out.write("                                            }\n");
      out.write("                                        },\n");
      out.write("                                        interaction: {\n");
      out.write("                                            intersect: false,\n");
      out.write("                                            mode: 'index',\n");
      out.write("                                        },\n");
      out.write("                                        scales: {\n");
      out.write("                                            y: {\n");
      out.write("                                                grid: {\n");
      out.write("                                                    drawBorder: false,\n");
      out.write("                                                    display: true,\n");
      out.write("                                                    drawOnChartArea: true,\n");
      out.write("                                                    drawTicks: false,\n");
      out.write("                                                    borderDash: [5, 5]\n");
      out.write("                                                },\n");
      out.write("                                                ticks: {\n");
      out.write("                                                    display: true,\n");
      out.write("                                                    padding: 10,\n");
      out.write("                                                    color: '#fbfbfb',\n");
      out.write("                                                    font: {\n");
      out.write("                                                        size: 11,\n");
      out.write("                                                        family: \"Open Sans\",\n");
      out.write("                                                        style: 'normal',\n");
      out.write("                                                        lineHeight: 2\n");
      out.write("                                                    },\n");
      out.write("                                                }\n");
      out.write("                                            },\n");
      out.write("                                            x: {\n");
      out.write("                                                grid: {\n");
      out.write("                                                    drawBorder: false,\n");
      out.write("                                                    display: false,\n");
      out.write("                                                    drawOnChartArea: false,\n");
      out.write("                                                    drawTicks: false,\n");
      out.write("                                                    borderDash: [5, 5]\n");
      out.write("                                                },\n");
      out.write("                                                ticks: {\n");
      out.write("                                                    display: true,\n");
      out.write("                                                    color: '#ccc',\n");
      out.write("                                                    padding: 20,\n");
      out.write("                                                    font: {\n");
      out.write("                                                        size: 11,\n");
      out.write("                                                        family: \"Open Sans\",\n");
      out.write("                                                        style: 'normal',\n");
      out.write("                                                        lineHeight: 2\n");
      out.write("                                                    },\n");
      out.write("                                                }\n");
      out.write("                                            },\n");
      out.write("                                        },\n");
      out.write("                                    },\n");
      out.write("                                });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            var win = navigator.platform.indexOf('Win') > -1;\n");
      out.write("            if (win && document.querySelector('#sidenav-scrollbar')) {\n");
      out.write("                var options = {\n");
      out.write("                    damping: '0.5'\n");
      out.write("                }\n");
      out.write("                Scrollbar.init(document.querySelector('#sidenav-scrollbar'), options);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <!-- Github buttons -->\n");
      out.write("        <script async defer src=\"https://buttons.github.io/buttons.js\"></script>\n");
      out.write("        <!-- Control Center for Soft Dashboard: parallax effects, scripts for the example pages etc -->\n");
      out.write("        <script src=\"js/argon-dashboard.min.js?v=2.0.2\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setBegin(1);
    _jspx_th_c_forEach_0.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.numberPage}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                <li class=\"page-item ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${index == i ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><a class=\"page-link\" href=\"settinglist?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                                ");
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
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
