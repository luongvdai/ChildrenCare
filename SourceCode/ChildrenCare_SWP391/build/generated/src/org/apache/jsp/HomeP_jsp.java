package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomeP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <title>ChildrenCare</title>\r\n");
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
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Navbar Start -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/Template/HeadMenuPublic.jsp", out, false);
      out.write("\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("        <!-- Navbar End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Carousel Start -->\r\n");
      out.write("        <div class=\"container-fluid p-0 mb-5\">\r\n");
      out.write("            <div class=\"owl-carousel header-carousel position-relative\">\r\n");
      out.write("                <div class=\"owl-carousel-item position-relative\">\r\n");
      out.write("                    <img class=\"img-fluid\" src=\"img/carousel-1.jpg\" alt=\"\">\r\n");
      out.write("                    <div class=\"position-absolute top-0 start-0 w-100 h-100 d-flex align-items-center\" style=\"background: rgba(0, 0, 0, .2);\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <div class=\"row justify-content-start\">\r\n");
      out.write("                                <div class=\"col-10 col-lg-8\">\r\n");
      out.write("                                    <h1 class=\"display-2 text-white animated slideInDown mb-4\">How children and young people come into care</h1>\r\n");
      out.write("                                    <p class=\"fs-5 fw-medium text-white mb-4 pb-2\">The Department for Child Protection has the significant responsibility of ensuring the safety of children and young people.</p>\r\n");
      out.write("                                    <a href=\"LoadSliderDetail?Sid=1\" class=\"btn btn-primary rounded-pill py-sm-3 px-sm-5 me-3 animated slideInLeft\">Learn More</a>\r\n");
      out.write("                                    <a href=\"\" class=\"btn btn-dark rounded-pill py-sm-3 px-sm-5 animated slideInRight\">Our Classes</a>\r\n");
      out.write("                                    \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"owl-carousel-item position-relative\">\r\n");
      out.write("                    <img class=\"img-fluid\" src=\"img/carousel-2.jpg\" alt=\"\">\r\n");
      out.write("                    <div class=\"position-absolute top-0 start-0 w-100 h-100 d-flex align-items-center\" style=\"background: rgba(0, 0, 0, .2);\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <div class=\"row justify-content-start\">\r\n");
      out.write("                                <div class=\"col-10 col-lg-8\">\r\n");
      out.write("                                    <h1 class=\"display-2 text-white animated slideInDown mb-4\">Make A Brighter Future For Your Child</h1>\r\n");
      out.write("                                    <p class=\"fs-5 fw-medium text-white mb-4 pb-2\">The Department for Child Protection has the significant responsibility of ensuring the safety of children and young people.</p>\r\n");
      out.write("                                    <a href=\"LoadSliderDetail?Sid=2\" class=\"btn btn-primary rounded-pill py-sm-3 px-sm-5 me-3 animated slideInLeft\">Learn More</a>\r\n");
      out.write("                                    <a href=\"\" class=\"btn btn-dark rounded-pill py-sm-3 px-sm-5 animated slideInRight\">Our Classes</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Carousel End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Danh sách dịch vụ -->\r\n");
      out.write("        <div class=\"container-xxl py-5\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"text-center mx-auto mb-5 wow fadeInUp\" data-wow-delay=\"0.1s\" style=\"max-width: 600px;\">\r\n");
      out.write("                    <h1 class=\"mb-3\">Featured service</h1>\r\n");
      out.write("                    <p>Our team always brings you the most modern and best healthcare services on the market with doctors who specialize in the fields.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row g-4\">\r\n");
      out.write("                    <div class=\"col-lg-3 col-sm-6 wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                        <div class=\"facility-item\">\r\n");
      out.write("                            <div class=\"facility-icon bg-primary\">\r\n");
      out.write("                                <span class=\"bg-primary\"></span>\r\n");
      out.write("                                <i class=\"fas fa-briefcase-medical\"></i>\r\n");
      out.write("                                <span class=\"bg-primary\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"facility-text bg-primary\">\r\n");
      out.write("                                <h3 class=\"text-primary mb-3\">Khám Định Kỳ</h3>\r\n");
      out.write("                                <p class=\"mb-0\">Eirmod sed ipsum dolor sit rebum magna erat lorem kasd vero ipsum sit</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-sm-6 wow fadeInUp\" data-wow-delay=\"0.3s\">\r\n");
      out.write("                        <div class=\"facility-item\">\r\n");
      out.write("                            <div class=\"facility-icon bg-success\">\r\n");
      out.write("                                <span class=\"bg-success\"></span>\r\n");
      out.write("                                <i class=\"fa fa-futbol fa-3x text-success\"></i>\r\n");
      out.write("                                <span class=\"bg-success\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"facility-text bg-success\">\r\n");
      out.write("                                <h3 class=\"text-success mb-3\">Khám Hàng tháng</h3>\r\n");
      out.write("                                <p class=\"mb-0\">Eirmod sed ipsum dolor sit rebum magna erat lorem kasd vero ipsum sit</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-sm-6 wow fadeInUp\" data-wow-delay=\"0.5s\">\r\n");
      out.write("                        <div class=\"facility-item\">\r\n");
      out.write("                            <div class=\"facility-icon bg-warning\">\r\n");
      out.write("                                <span class=\"bg-warning\"></span>\r\n");
      out.write("                                <i class=\"fa fa-home fa-3x text-warning\"></i>\r\n");
      out.write("                                <span class=\"bg-warning\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"facility-text bg-warning\">\r\n");
      out.write("                                <h3 class=\"text-warning mb-3\">Kiểm tra sức khỏe</h3>\r\n");
      out.write("                                <p class=\"mb-0\">Eirmod sed ipsum dolor sit rebum magna erat lorem kasd vero ipsum sit</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-sm-6 wow fadeInUp\" data-wow-delay=\"0.7s\">\r\n");
      out.write("                        <div class=\"facility-item\">\r\n");
      out.write("                            <div class=\"facility-icon bg-info\">\r\n");
      out.write("                                <span class=\"bg-info\"></span>\r\n");
      out.write("                                <i class=\"fa fa-chalkboard-teacher fa-3x text-info\"></i>\r\n");
      out.write("                                <span class=\"bg-info\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"facility-text bg-info\">\r\n");
      out.write("                                <h3 class=\"text-info mb-3\">Hỗ Trợ tư vấn tâm lý</h3>\r\n");
      out.write("                                <p class=\"mb-0\">Eirmod sed ipsum dolor sit rebum magna erat lorem kasd vero ipsum sit</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- danh sách dịch vụ End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- About Start -->\r\n");
      out.write("        <div class=\"container-xxl py-5\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row g-5 align-items-center\">\r\n");
      out.write("                    <div class=\"col-lg-6 wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                        <h1 class=\"mb-4\">Learn More About Our Work And Our Cultural Activities</h1>\r\n");
      out.write("                        <p>Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit. Aliqu diam amet diam et eos. Clita erat ipsum et lorem et sit, sed stet lorem sit clita duo justo magna dolore erat amet</p>\r\n");
      out.write("                        <p class=\"mb-4\">Stet no et lorem dolor et diam, amet duo ut dolore vero eos. No stet est diam rebum amet diam ipsum. Clita clita labore, dolor duo nonumy clita sit at, sed sit sanctus dolor eos, ipsum labore duo duo sit no sea diam. Et dolor et kasd ea. Eirmod diam at dolor est vero nonumy magna.</p>\r\n");
      out.write("                        <div class=\"row g-4 align-items-center\">\r\n");
      out.write("                            <div class=\"col-sm-6\">\r\n");
      out.write("                                <a class=\"btn btn-primary rounded-pill py-3 px-5\" href=\"LoadPostD?Did=1\">Read More</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-6\">\r\n");
      out.write("                                <div class=\"d-flex align-items-center\">\r\n");
      out.write("                                    <img class=\"rounded-circle flex-shrink-0\" src=\"img/user.jpg\" alt=\"\" style=\"width: 45px; height: 45px;\">\r\n");
      out.write("                                    <div class=\"ms-3\">\r\n");
      out.write("                                        <h6 class=\"text-primary mb-1\">Jhon Doe</h6>\r\n");
      out.write("                                        <small>CEO & Founder</small>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-6 about-img wow fadeInUp\" data-wow-delay=\"0.5s\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-12 text-center\">\r\n");
      out.write("                                <img class=\"img-fluid w-75 rounded-circle bg-light p-3\" src=\"img/about-1.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-6 text-start\" style=\"margin-top: -150px;\">\r\n");
      out.write("                                <img class=\"img-fluid w-100 rounded-circle bg-light p-3\" src=\"img/about-2.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-6 text-end\" style=\"margin-top: -150px;\">\r\n");
      out.write("                                <img class=\"img-fluid w-100 rounded-circle bg-light p-3\" src=\"img/about-3.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- About End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Call To Action Start -->\r\n");
      out.write("<section class=\"section\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row justify-content-center\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <div class=\"section-title text-center mb-4 pb-2\">\r\n");
      out.write("                            <span class=\"badge badge-pill badge-soft-primary mb-3\">Dịch vụ chăm sóc sức khỏe</span>\r\n");
      out.write("                            <h4 class=\"title mb-4\">Những dịch vụ nổi bật của chúng tôi</h4>\r\n");
      out.write("                            <p class=\"text-muted mx-auto para-desc mb-0\">Đội ngũ Nhân viên của chúng tôi luôn đem đến cho bạn những dịch vụ chăm sóc sức khỏe hiện đại và tốt nhất trên thị trường với những bác sĩ chuyên sâu trong các lĩnh vực .</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div> \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row align-items-center\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <div class=\"col-12 mt-4 pt-2 text-center\">\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-primary\">Tìm kiếm nhiều hơn</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Call To Action End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("        <!-- Appointment Start -->\r\n");
      out.write("        <div class=\"container-xxl py-5\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"bg-light rounded\">\r\n");
      out.write("                    <div class=\"row g-0\">\r\n");
      out.write("                        <div class=\"col-lg-6 wow fadeIn\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                            <div class=\"h-100 d-flex flex-column justify-content-center p-5\">\r\n");
      out.write("                                <h1 class=\"mb-4\">Schedule a Health Consultation</h1>\r\n");
      out.write("                                <form onsubmit=\"return validate()\">\r\n");
      out.write("                                    <div class=\"row g-3\">\r\n");
      out.write("                                        <div class=\"col-sm-6\">\r\n");
      out.write("                                            <div class=\"form-floating\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control border-0\" id=\"name\" placeholder=\"Gurdian Name\">\r\n");
      out.write("                                                <label for=\"gname\">Gurdian Name</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-sm-6\">\r\n");
      out.write("                                            <div class=\"form-floating\">\r\n");
      out.write("                                                <input type=\"email\" class=\"form-control border-0\" id=\"gmail\" placeholder=\"Gurdian Email\">\r\n");
      out.write("                                                <label for=\"gmail\">Gurdian Email</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-sm-6\">\r\n");
      out.write("                                            <div class=\"form-floating\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control border-0\" id=\"name\" placeholder=\"Child Name\">\r\n");
      out.write("                                                <label for=\"cname\">Child Name</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-sm-6\">\r\n");
      out.write("                                            <div class=\"form-floating\">\r\n");
      out.write("                                                <input type=\"text\" class=\"form-control border-0\" id=\"age\" placeholder=\"Child Age\">\r\n");
      out.write("                                                <label for=\"cage\">Child Age</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-12\">\r\n");
      out.write("                                            <div class=\"form-floating\">\r\n");
      out.write("                                                <textarea class=\"form-control border-0\" placeholder=\"Leave a message here\" id=\"message\" style=\"height: 100px\"></textarea>\r\n");
      out.write("                                                <label for=\"message\">Message</label>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"col-12\">\r\n");
      out.write("                                            <button class=\"btn btn-primary w-100 py-3\" type=\"submit\">Submit</button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-6 wow fadeIn\" data-wow-delay=\"0.5s\" style=\"min-height: 400px;\">\r\n");
      out.write("                            <div class=\"position-relative h-100\">\r\n");
      out.write("                                <img class=\"position-absolute w-100 h-100 rounded\" src=\"img/appointment.jpg\" style=\"object-fit: cover;\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Appointment End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Team Start -->\r\n");
      out.write("        <div class=\"container-xxl py-5\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"text-center mx-auto mb-5 wow fadeInUp\" data-wow-delay=\"0.1s\" style=\"max-width: 600px;\">\r\n");
      out.write("                    <h1 class=\"mb-3\">Team of Doctors</h1>\r\n");
      out.write("                    <p>We gather a team of experts, doctors, pharmacists and nurses who are professionally trained in Vietnam and many countries with developed medicine such as the US, UK, France... Always taking the patient as the center, Vinmec is committed to bringing comprehensive and high-quality healthcare services to customers.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row g-4\">\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                        <div class=\"team-item position-relative\">\r\n");
      out.write("                            <img class=\"img-fluid rounded-circle w-75\" src=\"img/team-1.jpg\" alt=\"\">\r\n");
      out.write("                            <div class=\"team-text\">\r\n");
      out.write("                                <h3>Văn Cương</h3>\r\n");
      out.write("                                <p>Bác sĩ Tư vấn</p>\r\n");
      out.write("                                <div class=\"d-flex align-items-center\">\r\n");
      out.write("                                    <a class=\"btn btn-square btn-primary mx-1\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                                    <a class=\"btn btn-square btn-primary  mx-1\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                                    <a class=\"btn btn-square btn-primary  mx-1\" href=\"\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 wow fadeInUp\" data-wow-delay=\"0.3s\">\r\n");
      out.write("                        <div class=\"team-item position-relative\">\r\n");
      out.write("                            <img class=\"img-fluid rounded-circle w-75\" src=\"img/team-2.jpg\" alt=\"\">\r\n");
      out.write("                            <div class=\"team-text\">\r\n");
      out.write("                                <h3>Hữu Đạt</h3>\r\n");
      out.write("                                <p>Bác sĩ Hỗ trợ</p>\r\n");
      out.write("                                <div class=\"d-flex align-items-center\">\r\n");
      out.write("                                    <a class=\"btn btn-square btn-primary mx-1\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                                    <a class=\"btn btn-square btn-primary  mx-1\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                                    <a class=\"btn btn-square btn-primary  mx-1\" href=\"\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 wow fadeInUp\" data-wow-delay=\"0.5s\">\r\n");
      out.write("                        <div class=\"team-item position-relative\">\r\n");
      out.write("                            <img class=\"img-fluid rounded-circle w-75\" src=\"img/team-3.jpg\" alt=\"\">\r\n");
      out.write("                            <div class=\"team-text\">\r\n");
      out.write("                                <h3>Đình Thái</h3>\r\n");
      out.write("                                <p>Bác sĩ Khám</p>\r\n");
      out.write("                                <div class=\"d-flex align-items-center\">\r\n");
      out.write("                                    <a class=\"btn btn-square btn-primary mx-1\" href=\"\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("                                    <a class=\"btn btn-square btn-primary  mx-1\" href=\"\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("                                    <a class=\"btn btn-square btn-primary  mx-1\" href=\"\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("                <section class=\"section\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row justify-content-center\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <div class=\"section-title text-center mb-4 pb-2\">\r\n");
      out.write("                            <span class=\"badge badge-pill badge-soft-primary mb-3\">Dịch vụ bác sĩ </span>\r\n");
      out.write("                            <h4 class=\"title mb-4\">Đội ngũ chuyên gia</h4>\r\n");
      out.write("                            <p class=\"text-muted mx-auto para-desc mb-0\">Chúng tôi quy tụ đội ngũ chuyên gia, bác sĩ, dược sĩ và điều dưỡng được đào tạo bài bản đến chuyên sâu tại Việt nam và nhiều nước có nên y học phát triển như Mỹ, Anh, Pháp... \r\n");
      out.write("                                Luôn lấy người bệnh là trung tâm, Vinmec cam kết mang lại dịch vụ chăm sóc sức khỏe toàn diện và chất lượng cao cho khách hàng.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div> \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-12 mt-4 pt-2 text-center\">\r\n");
      out.write("                        <a href=\"#\" class=\"btn btn-primary\">Tìm kiếm nhiều hơn</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- Team End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Testimonial Start -->\r\n");
      out.write("        <div class=\"container-xxl py-5\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"text-center mx-auto mb-5 wow fadeInUp\" data-wow-delay=\"0.1s\" style=\"max-width: 600px;\">\r\n");
      out.write("                    <h1 class=\"mb-3\">Our Clients Say!</h1>\r\n");
      out.write("                    <p>Eirmod sed ipsum dolor sit rebum labore magna erat. Tempor ut dolore lorem kasd vero ipsum sit eirmod sit. Ipsum diam justo sed rebum vero dolor duo.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"owl-carousel testimonial-carousel wow fadeInUp\" data-wow-delay=\"0.1s\">\r\n");
      out.write("                    <div class=\"testimonial-item bg-light rounded p-5\">\r\n");
      out.write("                        <p class=\"fs-5\">Tempor stet labore dolor clita stet diam amet ipsum dolor duo ipsum rebum stet dolor amet diam stet. Est stet ea lorem amet est kasd kasd erat eos</p>\r\n");
      out.write("                        <div class=\"d-flex align-items-center bg-white me-n5\" style=\"border-radius: 50px 0 0 50px;\">\r\n");
      out.write("                            <img class=\"img-fluid flex-shrink-0 rounded-circle\" src=\"img/testimonial-1.jpg\" style=\"width: 90px; height: 90px;\">\r\n");
      out.write("                            <div class=\"ps-3\">\r\n");
      out.write("                                <h3 class=\"mb-1\">Client Name</h3>\r\n");
      out.write("                                <span>Profession</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <i class=\"fa fa-quote-right fa-3x text-primary ms-auto d-none d-sm-flex\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"testimonial-item bg-light rounded p-5\">\r\n");
      out.write("                        <p class=\"fs-5\">Tempor stet labore dolor clita stet diam amet ipsum dolor duo ipsum rebum stet dolor amet diam stet. Est stet ea lorem amet est kasd kasd erat eos</p>\r\n");
      out.write("                        <div class=\"d-flex align-items-center bg-white me-n5\" style=\"border-radius: 50px 0 0 50px;\">\r\n");
      out.write("                            <img class=\"img-fluid flex-shrink-0 rounded-circle\" src=\"img/testimonial-2.jpg\" style=\"width: 90px; height: 90px;\">\r\n");
      out.write("                            <div class=\"ps-3\">\r\n");
      out.write("                                <h3 class=\"mb-1\">Client Name</h3>\r\n");
      out.write("                                <span>Profession</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <i class=\"fa fa-quote-right fa-3x text-primary ms-auto d-none d-sm-flex\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"testimonial-item bg-light rounded p-5\">\r\n");
      out.write("                        <p class=\"fs-5\">Tempor stet labore dolor clita stet diam amet ipsum dolor duo ipsum rebum stet dolor amet diam stet. Est stet ea lorem amet est kasd kasd erat eos</p>\r\n");
      out.write("                        <div class=\"d-flex align-items-center bg-white me-n5\" style=\"border-radius: 50px 0 0 50px;\">\r\n");
      out.write("                            <img class=\"img-fluid flex-shrink-0 rounded-circle\" src=\"img/testimonial-3.jpg\" style=\"width: 90px; height: 90px;\">\r\n");
      out.write("                            <div class=\"ps-3\">\r\n");
      out.write("                                <h3 class=\"mb-1\">Client Name</h3>\r\n");
      out.write("                                <span>Profession</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <i class=\"fa fa-quote-right fa-3x text-primary ms-auto d-none d-sm-flex\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Testimonial End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Footer Start -->\r\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/Template/FooterPublic.jsp", out, false);
      out.write("\r\n");
      out.write("        <!-- Footer End -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Back to Top -->\r\n");
      out.write("        <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- JavaScript Libraries -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/wow/wow.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/easing/easing.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/waypoints/waypoints.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Javascript -->\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.service}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("s");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <div class=\"col-xl-4 col-lg-4 col-md-6 mt-4 pt-2\">\r\n");
          out.write("                            <div class=\"card team border-0 rounded shadow overflow-hidden\">\r\n");
          out.write("                                <div class=\"team-img position-relative\">\r\n");
          out.write("                                    <img style=\"height: 14rem;width: 100%\"src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"img-fluid\" alt=\"\">\r\n");
          out.write("                                </div>\r\n");
          out.write("                                <div class=\"card-body content text-center\">\r\n");
          out.write("                                    <a href=\"listserviceservlet\" class=\"title text- h5 d-block mb-0\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.servicename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                                    \r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    ");
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
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${doctor}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("d");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <div class=\"col-xl-3 col-lg-3 col-md-6 mt-4 pt-2\">\r\n");
          out.write("                            <div class=\"card team border-0 rounded shadow overflow-hidden\">\r\n");
          out.write("                                <div class=\"team-img position-relative\">\r\n");
          out.write("                                    <img src=\"data:image/png;base64,");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"display: block;margin-left: auto;margin-right: auto;\" class=\"rounded img-fluid\" alt=\"\">\r\n");
          out.write("                                </div>\r\n");
          out.write("                                <div class=\"card-body content text-center\">\r\n");
          out.write("                                    <a href=\"doctor?action=detail&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.doctor_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"title text- h5 d-block mb-0\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.doctor_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                                    <small class=\"text-muted speciality\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.setting.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
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
