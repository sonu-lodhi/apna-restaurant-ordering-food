import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/UpdateJdbcQueryServlet")
public class Update extends HttpServlet {
 
 Connection connection = null;
 ResultSet resultSet = null;
 Statement statement = null;
 static String query = null;
 String url = null;
 String UserId = null;
 String Password = null;
 
 public void init(ServletConfig config) throws ServletException {
 
  url = "jdbc:mysql://localhost:3306/messbooking";
  UserId = "30"; 
  Password = "9770201337"; 
  try {
   Class.forName("com.mysql.jdbc.Driver");
 
   connection = DriverManager.getConnection(url,UserId , Password);
  }
  catch (Exception e) {
 
   e.printStackTrace();
  }
 
 }
 
 
 protected void doGet(
   HttpServletRequest request, 
   HttpServletResponse response
   ) throws ServletException, IOException {
 
  doPost(request, response);
 
 }
 
 
 protected void doPost(
   HttpServletRequest request, 
   HttpServletResponse response
   ) throws ServletException, IOException {
 
  query = "update customer set User_Id='40' , Password='9039921337' , " +
    " where User_Id='30'";
 
  executeQuery(query);
 
}
 
 private void executeQuery(String query) {
 
  try {
 
   statement = connection.createStatement();
   statement.execute(query);
 
  }
  catch (SQLException e) {
 
   e.printStackTrace();
 
  }
 } 
 
 @Override
 public void destroy() {
  try {    
   statement.close();
   connection.close();
  }
  catch (SQLException e) {
 
   e.printStackTrace();
  } 
 
 }
 
}