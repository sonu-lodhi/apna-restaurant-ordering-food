

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

public class PDetailsCheck extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        java.sql.Connection con = null;
        try {
            

            String PlateId = request.getParameter("p_id");
            
            String PlateName = request.getParameter("p_name");
           con = GetConnection.getConnection();
              //Class.forName("com.mysql.jdbc.Driver");
            //con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/messbooking","root","root");
            String sql = "select * from plate_details where Plate_id =? and Plate_Name =?";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, PlateId);
            ps.setString(2, PlateName);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                out.print("Checked");
            RequestDispatcher rd = request.getRequestDispatcher("SimplePlate.jsp");
                rd.forward(request, response);
            } else {
                out.print("Not Checked");
response.sendRedirect("platedetails.jsp");
            }
            con.close();
        } catch (Exception e) {
            out.print("Not Checked");
            e.printStackTrace();
        }

    }
}

