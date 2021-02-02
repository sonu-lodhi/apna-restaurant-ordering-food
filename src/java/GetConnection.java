
import java.sql.Connection;
import java.sql.DriverManager;


public class GetConnection {
   static Connection getConnection()
   {
      Connection con = null; 
      try
      {
         Class.forName("com.mysql.jdbc.Driver");
          System.out.println("Driver Loaded..");
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
      try
      {
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/messbooking","root","root");
          System.out.println("Connection Established..");
      }
      catch(Exception e)
      {
          System.out.println("Connection not Established..");
          e.printStackTrace();
      }
      return con;
   }

}
   
    


