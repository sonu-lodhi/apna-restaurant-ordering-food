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


public class MessRegistration extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection con;
       String sql="";
        PrintWriter out = response.getWriter();
       
        try {

            String Mess_name = request.getParameter("mess_name");
            String Mess_Owner_name = request.getParameter("mess_owner_name");
            String Address = request.getParameter("mess_address");
            String Location = request.getParameter("mess_location");
            String Contact = request.getParameter("mess_contact");
            String Email = request.getParameter("mess_email");
            String Password = request.getParameter("mess_password");
           // con = GetConnection.getconnection();
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/messbooking","root","root");
            sql = "insert into mess_registration(Mess_name,Mess_Owner_Name,Address,Location,Contact,Email,Password) values(?,?,?,?,?,?,?)";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

            ps.setString(1,Mess_name);
            ps.setString(2,Mess_Owner_name);
            ps.setString(3,Address);
            ps.setString(4,Location);
            ps.setString(5,Contact);
            ps.setString(6,Email);
            ps.setString(7,Password);
            int x = ps.executeUpdate();
              if(x != 0){      
              // out.print("mess registered");
                        
                       // String to=Email;
                       // String subject="From Mess_Register";
                       // String msg="Login-ID : CLU_"+Email+" \n Password : "+Password;
		
        		//Emaill.send(to, subject, msg);
                       
                    RequestDispatcher rd = request.getRequestDispatcher("MessRegistration.jsp");
                    //request.setAttribute("Message", "Mess Added");
                    rd.forward(request, response);
              }else 
            {
                
                        RequestDispatcher rd = request.getRequestDispatcher("");
                        request.setAttribute("Message", "Mess Not Added");
                        rd.forward(request, response);
                    
            }
              
        }
         
        catch (Exception e) 
        {
            out.print("Login failed");
            e.printStackTrace();
        }
    }
}
