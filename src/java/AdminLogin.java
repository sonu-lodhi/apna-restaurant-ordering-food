/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kapiltank
 */
public class AdminLogin extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        java.sql.Connection con = null;
        try {
         

            String admin_id = request.getParameter("admin_id");
            String admin_password = request.getParameter("admin_password");
            con = GetConnection.getConnection();
            String sql = "select * from adminlogin where admin_id =? and admin_password =?";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1,admin_id);
            ps.setString(2,admin_password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                out.print("Login success");
                RequestDispatcher rd =request.getRequestDispatcher("/AdminViewProfile.jsp");
                rd.forward(request, response);
                        
            } else {
                out.print("Login failed");
                  response.sendRedirect("Login.jsp");
            }
            
        } catch (Exception e) {
            out.print("Login failed");
            e.printStackTrace();
        }
        finally{
            try
            {
               con.close(); 
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

    }
}