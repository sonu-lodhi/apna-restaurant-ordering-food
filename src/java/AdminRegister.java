/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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


public class AdminRegister extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection con;
       String sql="";
        PrintWriter out = response.getWriter();
       
        try {

            String admin_id = request.getParameter("admin_id");
   
            String admin_Password = request.getParameter("admin_password");
           // con = GetConnection.getconnection();
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/messbooking","root","root");
            sql = "insert into adminlogin(admin_id,admin_Password) values(?,?)";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

            ps.setString(1,admin_id);
            ps.setString(2,admin_Password);
            int x = ps.executeUpdate();
              if(x != 0)      
               {
                out.print("Login success");
                   RequestDispatcher rd = request.getRequestDispatcher("Viewprofile.jsp");
                   rd.forward(request, response);
               }
            else 
            {
                out.print("Your Entry is Wrong");

            }
              
        }
        catch (Exception e) 
        {
            out.print("Your Entry is Wrong");

            e.printStackTrace();
        }
    }
}
