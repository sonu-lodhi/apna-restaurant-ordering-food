package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class MessOrderList_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("          <title>Apna Mess.comt</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("<script src=\"js/jquery-1.7.1.minjs\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-yui.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/cufon-replace.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/Dynalight_400.font.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/FF-cash.js\" type=\"text/javascript\"></script>\n");
      out.write("<!--[if lt IE 9]><script type=\"text/javascript\" src=\"js/html5.js\"></script><![endif]-->\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <center>\n");
      out.write("        <body bgcolor=\"orange\">\n");
      out.write("    <header>\n");
      out.write("  <div class=\"row-top\">\n");
      out.write("    <div class=\"main\">\n");
      out.write("      <div class=\"wrapper\">\n");
      out.write("        <h1><a href=\"index.html\">Apna Mess<span>.com</span></a></h1>\n");
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
      out.write("        </body>\n");
      out.write("    </center>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("     </br><br></br><br></br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

//String id = request.getParameter("userId");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "messbooking";


try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write("\n");
      out.write("<h2 align=\"center\" ><font color=\"red\"><strong>List of order</strong></font></h2>\n");
      out.write("<center>\n");
      out.write("<table align=\"center\" cellpadding=\"5\" cellspacing=\"5\" border=\"white\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr bgcolor=\"#A52A2A\">\n");
      out.write("<td><b>Order Id</b></td>\n");
      out.write("<td><b>Mess Id</b></td>\n");
      out.write("<td><b>Plate Id</b></td>\n");
      out.write("<td><b>Quantity</b></td>\n");
      out.write("<td><b>date</b></td>\n");
      out.write("<td><b>Total Amount</b></td>\n");
      out.write("<td><b>Status</b></td>\n");
      out.write("<td><b>Delete</b></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");

try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, "root", "root");
statement=connection.createStatement();
String sql ="select * from mess_order";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("<tr bgcolor=\"red\">\n");
      out.write("\n");
      out.write("<td>");
      out.print(resultSet.getString("Order_id") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("Mess_Id") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("Plate_id") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getInt("Quantity") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("Date") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getInt("Total_Amount") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("Status") );
      out.write("</td>\n");
      out.write("\n");
      out.write("<td>  <a href=\"./OrderDeleteList?o_id=");
      out.print(resultSet.getString("Order_id"));
      out.write("\"> Delete</a></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
 
}

} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("</br><br></br><br></br><br></br>\n");
      out.write("<center>\n");
      out.write(" ");
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
      out.write("</center>\n");
      out.write(" </html>");
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
