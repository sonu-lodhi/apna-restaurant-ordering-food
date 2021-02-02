/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.Connection;
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
public class UserLogin extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            java.sql.Connection con = null;

            String User_id = request.getParameter("user_id");
            String User_password = request.getParameter("user_password");
            con = GetConnection.getConnection();
            String sql = "select * from user_registration where User_id =? and Password =?";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, User_id);
            ps.setString(2, User_password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                out.print("Login success");
                RequestDispatcher rd =request.getRequestDispatcher("Userheader.jsp");
                rd.forward(request, response);
            } else {
                out.print("Login failed");
response.sendRedirect("userlogin.jsp");

            }
            con.close();
        } catch (Exception e) {
            out.print("Login failed");
            e.printStackTrace();
        }

    }
}

