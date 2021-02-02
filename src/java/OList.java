
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OList extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection con = null;
        PrintWriter out = response.getWriter();

        try {

            String Order_id = request.getParameter("o_id");
            String Mess_Id = request.getParameter("m_id");
            String Plate_id = request.getParameter("p_id");

            int Quantity = Integer.parseInt(request.getParameter("qua"));
            String Date = request.getParameter("date");
            int Total_Amount = Integer.parseInt(request.getParameter("t_amount"));
            String Status = request.getParameter("st");
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/messbooking", "root", "root");
            // con = GetConnection.getconnection();
            String sql = "insert into mess_order(Order_id,Mess_Id,Plate_id,Quantity,Date,Total_Amount,Status) values(?,?,?,?,?,?,?)";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

            ps.setString(1, Order_id);
            ps.setString(2, Mess_Id);
            ps.setString(3, Plate_id);
            ps.setInt(4, Quantity);
            ps.setString(5, Date);
            ps.setInt(6, Total_Amount);
            ps.setString(7, Status);
            int x = ps.executeUpdate();
            if (x != 0) {
                out.print("Login success");
               RequestDispatcher rd =request.getRequestDispatcher("MessOrderList.jsp");
               rd.forward(request, response);
            } else {
                out.print("Login failed");
//response.sendRedirect("MessOrder.jsp");
            }
            con.close();
        } catch (Exception e) {
            out.print("Login failed");
            e.printStackTrace();

        }

    }
}
