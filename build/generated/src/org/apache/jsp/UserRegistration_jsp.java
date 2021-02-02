package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Apna Mess.comt</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/layout.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<script src=\"js/jquery-1.7.1.minjs\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-yui.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-replace.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/Dynalight_400.font.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/FF-cash.js\" type=\"text/javascript\"></script>\n");
      out.write("<!--[if lt IE 9]><script type=\"text/javascript\" src=\"js/html5.js\"></script><![endif]-->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("function AllowAlphabet(){\n");
      out.write("if (!frm.nm.value.match(/^[a-zA-Z]+$/) && frm.nm.value !=\"\")\n");
      out.write("{\n");
      out.write("frm.nm.value=\"\";\n");
      out.write("frm.nm.focus();\n");
      out.write("alert(\"Please Enter only alphabets in text\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("if (!frm.ui.value.match(/^[a-zA-Z]+$/) && frm.ui.value !=\"\")\n");
      out.write("{\n");
      out.write("frm.ui.value=\"\";\n");
      out.write("frm.ui.focus();\n");
      out.write("alert(\"Please Enter only alphabets in text\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("function Validate() {\n");
      out.write("    var flag=true;\n");
      out.write("        var password = document.getElementById(\"u_pass\").value;\n");
      out.write("        var confirmPassword = document.getElementById(\"u_c_pass\").value;\n");
      out.write("        if (password != confirmPassword) {\n");
      out.write("            alert(\"Passwords do not match.\");\n");
      out.write("            flag=false;\n");
      out.write("        }\n");
      out.write("        return flag;\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<header>\n");
      out.write("  <div class=\"row-top\">\n");
      out.write("    <div class=\"main\">\n");
      out.write("      <div class=\"wrapper\">\n");
      out.write("        <h1><a href=\"index.jsp\">Apna Mess<span>.com</span></a></h1>\n");
      out.write("        <nav>\n");
      out.write("          <ul class=\"menu\">\n");
      out.write("             \n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("     <div class=\"row-bot\">\n");
      out.write("    <div class=\"row-bot-bg\">\n");
      out.write("      <div class=\"main\">\n");
      out.write("        <h2>Impressive Selection <span>for any Occasion</span></h2>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</header>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <br><br><br><br><br><br><br><br><br>\n");
      out.write("         <form action=\"./UserRegistration\">\n");
      out.write("             <center>\n");
      out.write("            <table>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td> User Name : </td>\n");
      out.write("                    <td><input type=\"text\" name=\"u_name\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Password  : </td>\n");
      out.write("                    <td><input type=\"Password\" name=\"u_pass\" id=\"u_pass\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Confirm password  : </td>\n");
      out.write("                    <td><input type=\"password\" name=\"u_c_pass\" id=\"u_c_pass\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Contact  :</td>\n");
      out.write("                    <td><input type=\"text\" name=\"u_contact\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>E-mail</td>\n");
      out.write("                    <td><input type=\"text\" name=\"u_email\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"Submit\" value=\"Register\" onclick=\"return Validate()\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("             </center>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("    </br></br></br></br></br></br> \n");
      out.write("    ");
      out.write("\n");
      out.write("<footer>\n");
      out.write("  <div class=\"main\">\n");
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
      out.write("</script>");
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
}
