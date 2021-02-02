package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");
 
String paypal_url="https://www.sandbox.paypal.com/cgi-bin/webscr"; // Test Paypal API URL
String paypal_id="php1pmbatch-facilitator@gmail.com"; // Business email ID

      out.write("\n");
      out.write("<!--<h4>Welcome, Guest</h4>-->\n");
      out.write("\n");
      out.write("<div class=\"product\">            \n");
      out.write("<!--    <div class=\"image\">\n");
      out.write("        <img src=\"h5ttp://www.phpgang.com/wp-content/uploads/gang.jpg\" />\n");
      out.write("    </div>\n");
      out.write("    <div class=\"name\">\n");
      out.write("        PHPGang Payment\n");
      out.write("    </div>\n");
      out.write("    <div class=\"price\">\n");
      out.write("        Price:$10\n");
      out.write("    </div>-->\n");
      out.write("\n");
      out.write("    <div class=\"btn\">\n");
      out.write("    <form action=\"");
      out.print( paypal_url );
      out.write("\" method=\"post\" name=\"frmPayPal1\">\n");
      out.write("    <input type=\"hidden\" name=\"business\" value=\"");
      out.print( paypal_id );
      out.write("\">\n");
      out.write("    <input type=\"hidden\" name=\"cmd\" value=\"_xclick\">\n");
      out.write("    <input type=\"hidden\" name=\"item_name\" value=\"PHPGang Payment\">\n");
      out.write("    <input type=\"hidden\" name=\"item_number\" value=\"");
      out.print( "2" );
      out.write("\">\n");
      out.write("    <input type=\"hidden\" name=\"credits\" value=\"510\">\n");
      out.write("    <input type=\"hidden\" name=\"userid\" value=\"");
      out.print( "12");
      out.write("\">\n");
      out.write("    <input type=\"hidden\" name=\"amount\" value=\"");
      out.print( "20");
      out.write("\">\n");
      out.write("    <input type=\"hidden\" name=\"cpp_header_image\" value=\"http://www.phpgang.com/wp-content/uploads/gang.jpg\">\n");
      out.write("    <input type=\"hidden\" name=\"no_shipping\" value=\"1\">\n");
      out.write("    <input type=\"hidden\" name=\"currency_code\" value=\"USD\">\n");
      out.write("    <input type=\"hidden\" name=\"handling\" value=\"0\">\n");
      out.write("    <input type=\"hidden\" name=\"cancel_return\" value=\"http://localhost:8080/ApnaMess/paymentCancel.jsp\">\n");
      out.write("    <input type=\"hidden\" name=\"return\" value=\"http://localhost:8080/ApnaMess/paymentSuccess.jsp?item_number='2'\">\n");
      out.write("    <input type=\"image\" src=\"https://www.sandbox.paypal.com/en_US/i/btn/btn_buynowCC_LG.gif\" border=\"0\" name=\"submit\" alt=\"PayPal - The safer, easier way to pay online!\">\n");
      out.write("    <img alt=\"\" border=\"0\" src=\"https://www.sandbox.paypal.com/en_US/i/scr/pixel.gif\" width=\"1\" height=\"1\">\n");
      out.write("    </form> \n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
