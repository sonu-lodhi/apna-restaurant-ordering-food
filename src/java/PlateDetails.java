
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


public class PlateDetails extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection con;
       String sql="";
        PrintWriter out = response.getWriter();
       
        try {

            String PlateId = request.getParameter("p_id");
            String PlateName  = request.getParameter("p_name");
           
           
           // con = GetConnection.getconnection();
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/messbooking","root","root");
            sql = "insert into plate_details(Plate_id,Plate_Name) values(?,?)";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

            ps.setString(1,PlateId);
            ps.setString(2,PlateName);
            
           
            int x = ps.executeUpdate();
              if(x != 0){      
               out.print("Data Insert");
                        
                       // String to=Email;
                       // String subject="From Mess_Register";
                       // String msg="Login-ID : CLU_"+Email+" \n Password : "+Password;
		
        		//Emaill.send(to, subject, msg);
                       
                    RequestDispatcher rd = request.getRequestDispatcher("platedetails.jsp");
                    //request.setAttribute("Message", "Mess Added");
                   rd.forward(request, response);
              }else 
            {
                out.print("Not Insert");
                      //  RequestDispatcher rd = request.getRequestDispatcher("");
                       // request.setAttribute("Message", "Mess Not Added");
                       // rd.forward(request, response);
                   //response.sendRedirect("platedetails.jsp");
            }
              con.close();
        }
         
        catch (Exception e) 
        {
            out.print("Not Insert ");
            e.printStackTrace();
        }
    }
}
