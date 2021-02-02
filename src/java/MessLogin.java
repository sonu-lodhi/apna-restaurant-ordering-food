

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

public class MessLogin extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        java.sql.Connection con = null;
        try {
            

            int mess_id = Integer.parseInt(request.getParameter("m_id"));
            
            String mess_password = request.getParameter("m_pass");
           con = GetConnection.getConnection();
              //Class.forName("com.mysql.jdbc.Driver");
            //con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/messbooking","root","root");
            String sql = "select * from mess_registration where Mess_Id =? and Password =?";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, mess_id);
            ps.setString(2, mess_password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                out.print("Login success");
            RequestDispatcher rd = request.getRequestDispatcher("Messheader.jsp");
                rd.forward(request, response);
            } else {
                out.print("Login failed");
response.sendRedirect("messlogin.jsp");
            }
            con.close();
        } catch (Exception e) {
            out.print("Login failed");
            e.printStackTrace();
        }

    }
}

