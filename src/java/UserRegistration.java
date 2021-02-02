


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


public class UserRegistration extends HttpServlet {
 Connection con = null;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
       
        try {

            String User_Name = request.getParameter("u_name");
              String Password = request.getParameter("u_pass");
            String Conform_Password = request.getParameter("u_c_pass");
         
            String Contact = request.getParameter("u_contact");
            String Email = request.getParameter("u_email");
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/messbooking","root","root");
           // con = GetConnection.getconnection();
            String sql = "insert into user_registration(User_Name,Password,Conform_Password,Contact,Email) values(?,?,?,?,?)";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

            ps.setString(1,User_Name);
            ps.setString(2,Password);
            ps.setString(3,Conform_Password);
            ps.setString(4,Contact);           
            ps.setString(5,Email);
           
            int x = ps.executeUpdate();
            if (x  != 0) 
            {
                out.print("Login success");
                RequestDispatcher rd =request.getRequestDispatcher("userlogin.jsp");
                rd.forward(request, response);
            } 
            else {
                out.print("Login failed");
//response.sendRedirect("UserRegistration");
            }
           //con.close();
        } catch (Exception e) {
            out.print("Login failed");
            e.printStackTrace();
        
        }
     
    }
}
