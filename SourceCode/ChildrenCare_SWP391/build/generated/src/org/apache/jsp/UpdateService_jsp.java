package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdateService_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicon.ico\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("\r\n");
      out.write("        <title>Update Service</title>\r\n");
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
      out.write("                                        <h4 class=\"title text-bolder\">Update  Service</h4>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"content\">\r\n");
      out.write("                                        <form action=\"updateservice\" method=\"post\">\r\n");
      out.write("                                            <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"modal-footer\">\r\n");
      out.write("                                                <a href=\"servicecontroller\" class=\"btn btn-default\" data-dismiss=\"modal\">Back to manager</a>\r\n");
      out.write("\r\n");
      out.write("                                                <input type=\"submit\" class=\"btn btn-success\" value=\"Update\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("    <!--   Core JS Files   -->\r\n");
      out.write("    <script src=\"assets/js/jquery.3.2.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!--  Charts Plugin -->\r\n");
      out.write("    <script src=\"assets/js/chartist.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!--  Notifications Plugin    -->\r\n");
      out.write("    <script src=\"assets/js/bootstrap-notify.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!--  Google Maps Plugin    -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->\r\n");
      out.write("    <script src=\"assets/js/light-bootstrap-dashboard.js?v=1.4.0\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Light Bootstrap Table DEMO methods, don't include it in your project! -->\r\n");
      out.write("    <script src=\"assets/js/demo.js\"></script>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("l");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                    <div class=\"row\">\r\n");
          out.write("                                                        <div>\r\n");
          out.write("                                                            <p class=\"text-muted\">Service photo update</p>\r\n");
          out.write("                                                            <div id=\"myfileupload\">\r\n");
          out.write("                                                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"50\" height=\"50\"><br>\r\n");
          out.write("                                                                <input  type=\"file\" name=\"Image\" name=\"ImageUpload\" accept=\"image/*\" id=\"uploadfile\" onchange=\"readURL(this);\" />\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                            <div id=\"thumbbox\">\r\n");
          out.write("                                                                <img class=\"rounded\" height=\"20%\" width=\"30%\" alt=\"Thumb image\" id=\"thumbimage\" style=\"display: none\" />\r\n");
          out.write("                                                                <a class=\"removeimg\" href=\"javascript:\"></a>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                            <div id=\"boxchoice\">\r\n");
          out.write("                                                                <a href=\"javascript:\" class=\"Choicefile\"><i class=\"fas fa-cloud-upload-alt\"></i> Choose a photo</a>\r\n");
          out.write("                                                                <p style=\"clear:both\"></p>\r\n");
          out.write("                                                            </div> \r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                        <div class=\"col-md-9\">\r\n");
          out.write("                                                            <div class=\"form-group\">\r\n");
          out.write("                                                                <label>ServiceId</label>\r\n");
          out.write("                                                                <input name=\"ServiceId\" type=\"text\"  value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.serviceid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" readonly class=\"form-control\" required>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                        <div class=\"col-md-9\">\r\n");
          out.write("                                                            <div class=\"form-group\">\r\n");
          out.write("                                                                <label>Service_Name</label>\r\n");
          out.write("                                                                <input name=\"Service_Name\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.servicename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-control\" required>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                        <div class=\"col-md-9\">\r\n");
          out.write("                                                            <div class=\"form-group\">\r\n");
          out.write("                                                                <label>Detail</label>\r\n");
          out.write("                                                                <input name=\"Detail\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.detail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-control\" required>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                    <div class=\"row\">\r\n");
          out.write("                                                        <div class=\"col-md-6\">\r\n");
          out.write("                                                            <div class=\"form-group\">\r\n");
          out.write("                                                                <label>Title</label>\r\n");
          out.write("                                                                <input name=\"Title\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-control\" required>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("               \r\n");
          out.write("                                                        <div class=\"col-md-9\">\r\n");
          out.write("                                                            <div class=\"form-group\">\r\n");
          out.write("                                                                <label>Price</label>\r\n");
          out.write("                                                                <input name=\"Price\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-control\" required>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                        <div class=\"col-md-9\">\r\n");
          out.write("                                                            <div class=\"form-group\">\r\n");
          out.write("                                                                <label>Discount</label>\r\n");
          out.write("                                                                <input name=\"Discount\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.discount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-control\" required>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("\r\n");
          out.write("                                                        <div class=\"col-md-9\">\r\n");
          out.write("                                                            <div class=\"form-group\">\r\n");
          out.write("                                                                <label>Rate</label>\r\n");
          out.write("                                                                <input name=\"Rate\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.rate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"form-control\" required>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                                    <div class=\"col-md-4\">\r\n");
          out.write("                                                        <div class=\"form-group\">\r\n");
          out.write("                                                            <label>Status</label>\r\n");
          out.write("                                                            <select name=\"status\" style=\"margin-top: 26px;padding: 10px;margin-left: 10px\">  \r\n");
          out.write("                                                                <option value=\"1\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.status == 1 ? \"selected\": \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">Active</option>\r\n");
          out.write("                                                                <option value=\"0\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${l.status == 0 ? \"selected\": \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">Deactive</option>\r\n");
          out.write("                                                            </select>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("\r\n");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
