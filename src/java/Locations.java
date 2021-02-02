

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Locations extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        java.sql.Connection con = null;
        try {
            String Location = request.getParameter("loctn");
           con = GetConnection.getConnection();
             Class.forName("com.mysql.jdbc.Driver");
            //con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/messbooking","root","root");
            String sql = "select * from mess_registration where Location =?";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
           
            ps.setString(1,Location);
            ResultSet rs = ps.executeQuery();
  //          out.print("<table border='1'><tbody><tr><td>Meass name</td><td>Mess Image</td></tr>");
            if (rs.next()) {
//                out.print("Login success");
           RequestDispatcher rd = request.getRequestDispatcher("messlist.jsp");
               rd.include(request, response);

//                out.print("<table border='1'><tbody><tr><td><img src=''></td><td></td></tr></tbody></table>");
                

            } 
            con.close();
        } catch (Exception e) {
            out.print("Login failed");
            e.printStackTrace();
        }

    }
}

