package org.apache.jsp.reservations;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model_staff.reservations_user;
import java.util.List;

public final class reservation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("        <title>RESERVATIONS</title>\r\n");
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
      out.write("                height: 100%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            .table_r {\r\n");
      out.write("\r\n");
      out.write("                border-collapse: collapse;\r\n");
      out.write("                overflow: hidden;\r\n");
      out.write("                box-shadow: 0 0 20px rgba(0,0,0,0.1);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            .table_r td {\r\n");
      out.write("                padding: 15px;\r\n");
      out.write("                background-color: rgba(255,255,255,0.2);\r\n");
      out.write("                color: #000;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .table_r th {\r\n");
      out.write("                text-align: left;  \r\n");
      out.write("                padding: 15px;\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                background-color: #5a5a5a;\r\n");
      out.write("            }\r\n");
      out.write("            .alltable{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                top: 30%;\r\n");
      out.write("                left: 50%;\r\n");
      out.write("                transform: translate(-50%, -50%);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("        <div class=\"alltable\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <form method=\"get\" action=\"searchreservation\">\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th><input type=\"text\" name=\"rid\"  placeholder=\"enter reservation id\"></th>\r\n");
      out.write("                            <th><input type=\"text\" name=\"name\" placeholder=\"enter customer name\"></th>\r\n");
      out.write("                            <th><button type=\"submit\">search</button></th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <form method=\"get\" action=\"filterreservation\">\r\n");
      out.write("                    <table>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th><input type=\"date\" name=\"datefrom\" ></th>\r\n");
      out.write("                            <th><input type=\"date\" name=\"dateto\" ></th>\r\n");
      out.write("                            <th><select name=\"status\">\r\n");
      out.write("                                    <option value=\"\">all status</option>\r\n");
      out.write("                                    <option value=\"wait\">wait</option>\r\n");
      out.write("                                    <option value=\"being\">being</option>\r\n");
      out.write("                                </select></th>\r\n");
      out.write("                            <th>\r\n");
      out.write("                                <select name=\"staff\">\r\n");
      out.write("                                    <option value=\"\">all staff</option>\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </th>\r\n");
      out.write("                            <th><button type=\"submit\">filter</button></th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <table class=\"table_r\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th></th>\r\n");
      out.write("                        <th class=\"show\" style=\"display: none;\">Reservation id</th>\r\n");
      out.write("                        <th>Reservation date</th>\r\n");
      out.write("                        <th>Customer name</th>\r\n");
      out.write("                        <th class=\"show\" style=\"display: none;\">Service name</th>\r\n");
      out.write("                        <th>Total cost</th>\r\n");
      out.write("                        <th>Status</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <button onclick=\"myFunction()\" >show full list</button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.staff}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("s");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.userid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setValue(new String("1"));
    _jspx_th_c_set_0.setVar("count");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
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
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.all}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("a");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("                        <tr>                 \r\n");
          out.write("\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td> \r\n");
          out.write("                            <td class=\"show\" style=\"text-align:center; display: none;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.reservationid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.ordertime}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.user.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td class=\"show\" style=\"display: none;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.service.servicename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.totalcost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                        <h1 hidden>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count=count +1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h1>\r\n");
          out.write("                        \r\n");
          out.write("                        </tr>\r\n");
          out.write("                    ");
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
