package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entity.User;
import java.util.List;
import DAO.UserDAO;

public final class ReservationContact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Reservation Contact</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template/DesignPublic.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 UserDAO dao = new UserDAO();
      out.write("\n");
      out.write("        ");
List<User> lst = (List<User>) dao.GetStaffActive();
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template/HeadMenuPublic.jsp", out, false);
      out.write("\n");
      out.write("        <form method=\"Post\" action=\"reservationcontact\">\n");
      out.write("            <table class=\"table\">\n");
      out.write("                <th scope=\"col\" style=\"color: orange\">Service Name</th>\n");
      out.write("                <th scope=\"col\" style=\"color: orange\">Children Name</th>\n");
      out.write("                <th scope=\"col\" style=\"color: orange\">Age</th>\n");
      out.write("                <th scope=\"col\" style=\"color: orange\"></th>\n");
      out.write("                <th scope=\"col\" style=\"color: orange\">Date</th>\n");
      out.write("                <th scope=\"col\" style=\"color: orange\"></th>\n");
      out.write("                <th scope=\"col\" style=\"color: orange\">Time</th>\n");
      out.write("                <th scope=\"col\" style=\"color: orange\">Doctor</th>\n");
      out.write("                <th scope=\"col\">Total</th>\n");
      out.write("                <th scope=\"col\"></th>\n");
      out.write("                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rd}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("o");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                    <tr>\n");
            out.write("                        <td scope=\"row\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.service_Name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                        <td scope=\"row\"><h4><input type=\"text\" class=\"form-control\" name=\"children");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" required=\"\"></h4></td>\n");
            out.write("                        <td scope=\"row\"><input type=\"number\" class=\"form-control\" name=\"Age");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" required=\"\"><td>\n");
            out.write("                        <td scope=\"row\"><input type=\"date\" class=\"form-control\" name=\"Date");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" required=\"\"><td>\n");
            out.write("                        <td scope=\"row\"><select class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\" name=\"Time");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("                                    <option value=\"7:30\">7:30</option>\n");
            out.write("                                    <option value=\"9:00\">9:00</option>\n");
            out.write("                                    <option value=\"10:40\">10:40</option>\n");
            out.write("                                    <option value=\"12:50\">12:50</option>\n");
            out.write("                                    <option value=\"14:30\">14:30</option>\n");
            out.write("                                    <option value=\"14:30\">16:00</option>\n");
            out.write("                            </select></td>\n");
            out.write("                       <td scope=\"row\"><select class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\" name=\"Doctor");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("                                   ");
for(int i = 0; i < lst.size();i++){
            out.write("\n");
            out.write("                                   <option value=\"");
            out.print( lst.get(i).getUser_ID());
            out.write('"');
            out.write('>');
            out.print( lst.get(i).getFullName());
            out.write("</option>   \n");
            out.write("                               ");
}
            out.write("\n");
            out.write("                            </select></td>\n");
            out.write("                        <td scope=\"row\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                        <td></td>\n");
            out.write("                    ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n");
      out.write("            </table>\n");
      out.write("            <a href=\"ReservationDetails.jsp\" class=\"btn btn-secondary\">Change</a>\n");
      out.write("            <input type=\"submit\" value=\"Submit\" class=\"btn btn-secondary\">\n");
      out.write("        </form>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Template/FooterPublic.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
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
}
