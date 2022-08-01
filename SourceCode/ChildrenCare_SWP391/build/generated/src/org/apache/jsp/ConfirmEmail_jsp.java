package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ConfirmEmail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        \r\n");
      out.write("        <meta charset='utf-8'>\r\n");
      out.write("        <meta name='viewport' content='width=device-width, initial-scale=1'>\r\n");
      out.write("        <title>Confirm Account</title>\r\n");
      out.write("        <link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css' rel='stylesheet'>\r\n");
      out.write("        <link href='#' rel='stylesheet'>\r\n");
      out.write("        <script type='text/javascript' src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>\r\n");
      out.write("        <style>::-webkit-scrollbar {\r\n");
      out.write("                width: 8px;\r\n");
      out.write("            }\r\n");
      out.write("            /* Track */\r\n");
      out.write("            ::-webkit-scrollbar-track {\r\n");
      out.write("                background: #F45677; \r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* Handle */\r\n");
      out.write("            ::-webkit-scrollbar-thumb {\r\n");
      out.write("                background: #888; \r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            /* Handle on hover */\r\n");
      out.write("            ::-webkit-scrollbar-thumb:hover {\r\n");
      out.write("                background: #555; \r\n");
      out.write("            } #</style>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body style=\"background-color: #F45677;  margin: 0 !important; padding: 0 !important;\">\r\n");
      out.write("            <!-- HIDDEN PREHEADER TEXT -->\r\n");
      out.write("            <div style=\"display: none; font-size: 1px; color: #fefefe; line-height: 1px; font-family: 'Lato', Helvetica, Arial, sans-serif; max-height: 0px; max-width: 0px; opacity: 0; overflow: hidden;\"> We're thrilled to have you here! Get ready to dive into your new account.\r\n");
      out.write("            </div>\r\n");
      out.write("            <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("                <!-- LOGO -->\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td bgcolor=\"#F45677 align=\"center\">\r\n");
      out.write("                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width: 600px;\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td align=\"center\" valign=\"top\" style=\"padding: 40px 10px 40px 10px;\"> </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td bgcolor=\"#F45677\" align=\"center\" style=\"padding: 0px 10px 0px 10px;\">\r\n");
      out.write("                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width: 600px;\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td bgcolor=\"#ffffff\" align=\"center\" valign=\"top\" style=\"padding: 40px 20px 20px 20px; border-radius: 4px 4px 0px 0px; color: #111111; font-family: 'Lato', Helvetica, Arial, sans-serif; font-size: 48px; font-weight: 400; letter-spacing: 4px; line-height: 48px;\">\r\n");
      out.write("                                    <h1 style=\"font-size: 48px; font-weight: 400; margin: 2;\">Confirm Your Account </h1> <img src=\" https://img.icons8.com/clouds/100/000000/handshake.png\" width=\"125\" height=\"120\" style=\"display: block; border: 0px;\" />\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td bgcolor=\"#F45677\" align=\"center\" style=\"padding: 0px 10px 0px 10px;\">\r\n");
      out.write("                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"max-width: 600px;\">\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td bgcolor=\"#ffffff\" align=\"left\" style=\"padding: 20px 30px 40px 30px; color: #666666; font-family: 'Lato', Helvetica, Arial, sans-serif; font-size: 18px; font-weight: 400; line-height: 25px;\">\r\n");
      out.write("                                    <p style=\"margin: 0;\">This is the account we found through the email you provided. \r\n");
      out.write("                                    If it is your account, and you forgot the password. Click Send Email below to change your account password.</p>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td bgcolor=\"#ffffff\" align=\"left\" style=\"padding: 20px 30px 40px 30px; color: #666666; font-family: 'Lato', Helvetica, Arial, sans-serif; font-size: 30px; font-weight: 400; line-height: 25px;\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                             \r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td bgcolor=\"#ffffff\" align=\"left\">\r\n");
      out.write("                                    <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td bgcolor=\"#ffffff\" align=\"center\" style=\"padding: 20px 30px 60px 30px;\">\r\n");
      out.write("                                                <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <td align=\"center\" style=\"border-radius: 3px;\" bgcolor=\"#F45677\"><a href=\"#\" target=\"_blank\" style=\"font-size: 20px; font-family: Helvetica, Arial, sans-serif; color: #ffffff; text-decoration: none; color: #ffffff; text-decoration: none; padding: 15px 25px; border-radius: 2px; border: 1px solid #FFA73B; display: inline-block;\">Send Email to change Password</a></td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                </table>\r\n");
      out.write("                                            </td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr> <!-- COPY -->\r\n");
      out.write("                            \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td bgcolor=\"#ffffff\" align=\"left\" style=\"padding: 0px 30px 20px 30px; color: #666666; font-family: 'Lato', Helvetica, Arial, sans-serif; font-size: 18px; font-weight: 400; line-height: 25px;\">\r\n");
      out.write("                                    <p style=\"margin: 0;\">If you have any questions, just reply to this email—we're always happy to help out.</p>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td bgcolor=\"#ffffff\" align=\"left\" style=\"padding: 0px 30px 40px 30px; border-radius: 0px 0px 4px 4px; color: #666666; font-family: 'Lato', Helvetica, Arial, sans-serif; font-size: 18px; font-weight: 400; line-height: 25px;\">\r\n");
      out.write("                                    <p style=\"margin: 0;\">Cuong,<br>Thai Team</p>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            </table>\r\n");
      out.write("        </body>\r\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UserD}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                        <table>\r\n");
          out.write("                                            <tr>\r\n");
          out.write("                                            <p style=\"margin: 0;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.user_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                            <p style=\"margin: 0;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                            <p style=\"margin: 0;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                        </tr>\r\n");
          out.write("                                        </table>          \r\n");
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
}
