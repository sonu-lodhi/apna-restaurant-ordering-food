

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrderDeleteList extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection con = null;
        PrintWriter out = response.getWriter();

        try {

            //con = GetConnection.getConnection();
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/messbooking","root","root");   
            String order_id =request.getParameter("o_id");
            String sql = "delete from mess_order where Order_id =?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,order_id);
            int i = ps.executeUpdate();
            
            if (i != 0) {
                out.print("mess deleted");
               RequestDispatcher rd = request.getRequestDispatcher("MessOrderList.jsp");
               rd.forward(request, response);

            } else {
                out.print("club not deleted");
            }
        }
        //.close();
        catch (Exception e) {
            out.print("club not deleted");
            e.printStackTrace();
        } 

    }

}
