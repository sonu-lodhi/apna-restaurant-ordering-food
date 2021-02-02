package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <style>\n");
      out.write("        #wrap {\n");
      out.write("\twidth:100%;\n");
      out.write("       height: 130px;\n");
      out.write("\toverflow:hidden;\n");
      out.write("      \n");
      out.write("        \n");
      out.write("}\n");
      out.write(" #wrap1 {\n");
      out.write("\twidth:100%;\n");
      out.write("       height: 70px;\n");
      out.write("\toverflow:hidden;\n");
      out.write("      \n");
      out.write("        \n");
      out.write("}\n");
      out.write("        ul li\n");
      out.write("        {\n");
      out.write("            position: relative;\n");
      out.write("            position: center;\n");
      out.write("        }\n");
      out.write("        ul li ul\n");
      out.write("        {\n");
      out.write("            display:none;\n");
      out.write("             \n");
      out.write("            position: absolute;\n");
      out.write("            width: 150px;\n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        ul li:hover ul\n");
      out.write("        {\n");
      out.write("            display: block;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        #subli\n");
      out.write("        {\n");
      out.write("            display: inline;\n");
      out.write("        }\n");
      out.write("        #subul\n");
      out.write("        {\n");
      out.write("            margin-left: -40px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("<title>Catering.com</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<script src=\"js/jquery-1.7.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.cycle.all.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-yui.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-replace.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/Dynalight_400.font.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/FF-cash.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/tms-0.3.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/tms_presets.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.easing.1.3.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.equalheights.js\" type=\"text/javascript\"></script>\n");
      out.write("<!--[if lt IE 9]><script type=\"text/javascript\" src=\"js/html5.js\"></script><![endif]-->\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function ()\n");
      out.write("    {\n");
      out.write("       $(\".slider1\").cycle(); \n");
      out.write("    });\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body id=\"page1\">\n");
      out.write("<!--==============================header=================================-->\n");
      out.write("<header>\n");
      out.write("  <div class=\"row-top\">\n");
      out.write("    <div class=\"main\">\n");
      out.write("        <div class=\"wrapper\" id=\"wrap\">\n");
      out.write("        <h1><a href=\"header.jsp\">Catering<span>.com</span></a></h1>\n");
      out.write("        <nav>\n");
      out.write("          <ul class=\"menu\">\n");
      out.write("              <li><a class=\"active\" href=\"header.jsp\">Home</a></li>\n");
      out.write("              <li><a href=\"\">Menu</a>\n");
      out.write("                  <ul id=\"subul\">\n");
      out.write("                      <li id=\"subli\"><a href=\"SimplePlate.jsp\">Simple Plate</a></li>\n");
      out.write("                      <li id=\"subli\"><a href=\"DeliciousPlate.jsp\">Delicious Plate</a></li>\n");
      out.write("                      <li id=\"subli\"><a href=\"SpecialPlate.jsp\">Special Plate</a></li>\n");
      out.write("                      \n");
      out.write("                  </ul>\n");
      out.write("              \n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"UserRegistration.jsp\">User Registration</a></li>\n");
      out.write("              <li><a href=\"Location.jsp\">Location</a></li>\n");
      out.write("              <li><a href=\"\">Login</a>\n");
      out.write("                 <ul id=\"subul\">\n");
      out.write("                     <li id=\"subul\"><a href=\"Login.jsp\">Admin Login</a></li><br>\n");
      out.write("                      \n");
      out.write("                     <li id=\"subul\"><a href=\"userlogin.jsp\">User Login</a></li><br>\n");
      out.write("                      <li id=\"subul\"><a href=\"messlogin.jsp\">Mess Login</a></li>\n");
      out.write("                 </ul>\n");
      out.write("                  \n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"HomeContact.jsp\">Contact</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"row-bot\">\n");
      out.write("    <div class=\"row-bot-bg\">\n");
      out.write("      <div class=\"main\">\n");
      out.write("        <h2>Impressive Selection <span>for any Occasion</span></h2>\n");
      out.write("        <div class=\"slider-wrapper\">\n");
      out.write("          <div class=\"slider1\">\n");
      out.write("              <img src=\"images/kapil3.jpg\" alt=\"\" style=\"height:466px;width:940px\"/>\n");
      out.write("              <img src=\"images/mess1.jpg\" class=\"image1\" alt=\"\" style=\"height:466px;width:940px\"/>\n");
      out.write("              <img src=\"images/slider-img3.jpg\" class=\"image1\" alt=\"\"style=\"height:466px;width:940px\" />\n");
      out.write("<!--            <ul class=\"items\">\n");
      out.write("              <li> <img src=\"images/mess3.jpg\" alt=\"\" class=\"image1\"/> </li>\n");
      out.write("              <li> <img src=\"images/slider-img2.jpg\" class=\"image1\"\n");
      out.write("                        alt=\"\" /> </li>\n");
      out.write("              <li> <img src=\"images/slider-img3.jpg\" class=\"image1\" alt=\"\" /> </li>\n");
      out.write("            </ul>-->\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</header>\n");
      out.write("<!--==============================content================================-->\n");
      out.write("<section id=\"content\">\n");
      out.write("  <div class=\"main\">\n");
      out.write("    <div class=\"wrapper img-indent-bot\">\n");
      out.write("      <article class=\"col-1\"> <a href=\"#\"><img class=\"img-border\" src=\"images/mess1.jpg\" alt=\"\" height=\"220\" width=\"320\"></a> </article>\n");
      out.write("      <article class=\"col-1\"> <a href=\"#\"><img class=\"img-border\" src=\"images/plate.jpg\" alt=\"\" height=\"220\" width=\"320\"></a> </article>\n");
      out.write("      <article class=\"col-2\"> <a href=\"#\"><img class=\"img-border\" src=\"images/thali1.jpg\" alt=\"\" height=\"220\" width=\"320\"></a> </article>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("      <article class=\"column-1\">\n");
      out.write("        <div class=\"indent-left\">\n");
      out.write("          <div class=\"maxheight indent-bot\">\n");
      out.write("            <h3>Our Services</h3>\n");
      out.write("            <ul class=\"list-1\">\n");
      out.write("              <li><a href=\"#\">Tasty food are available as customer requirment. </a></li>\n");
      out.write("              <li><a href=\"#\">Neat and clean environment are provided. </a></li>\n");
      out.write("              <li><a href=\"#\">food prepare in neat and clean kitchen. </a></li>\n");
      out.write("              <li><a href=\"#\">Home delivery are avaliable. </a></li>\n");
      out.write("              <li><a href=\"#\">order of wedding are taken with minimum rates. </a></li>\n");
      out.write("              <li><a href=\"#\">every kind of occassion order are taken . </a></li>\n");
      out.write("              <li><a href=\"#\">Best Catering services are available here.... </a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("      </article>\n");
      out.write("      <article class=\"column-2\">\n");
      out.write("        <div class=\"maxheight indent-bot\">\n");
      out.write("          <h3 class=\"p1\">About the Catering</h3>\n");
      out.write("          <h6 class=\"p2\">The wedding is remembered for the food, quality  and variety even after it is over. The conversation of the wedding and  generosity of the host is showcased by the food catered. We understand this  perfecly.</h6>\n");
      out.write("          <p>Therefore our menu is customized as per the need of season  and palette. The serving style showcased is our pride.We offer a wide variety of menus for every need and they can  be customized. You can select from our huge range of menus and dining ideas.</p>\n");
      out.write("          <p class=\"p2\">&nbsp;</p>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("<!--==============================footer=================================-->\n");
      out.write("<footer>\n");
      out.write("  <div class=\"main\" id=\"wrap1\" >\n");
      out.write("    <div class=\"aligncenter\"> <span>Copyright &copy; 2016 <a href=\"#\">Catering.com </a> All Rights Reserved</span></div>\n");
      out.write("  </div>\n");
      out.write("</footer>\n");
      out.write("<script type=\"text/javascript\">Cufon.now();</script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(window).load(function () {\n");
      out.write("    $('.slider')._TMS({\n");
      out.write("        duration: 1000,\n");
      out.write("        easing: 'easeOutQuint',\n");
      out.write("        preset: 'slideDown',\n");
      out.write("        slideshow: 7000,\n");
      out.write("        banners: false,\n");
      out.write("        pauseOnHover: true,\n");
      out.write("        pagination: true,\n");
      out.write("        pagNums: false\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
