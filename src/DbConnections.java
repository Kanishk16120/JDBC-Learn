import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLOutput;


public class DbConnections{
    public Connection connect_to_db()
    {

      Connection conn=null;
      try {
          Class.forName("org.postgresql.Driver");
          conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/tudb",
                  "postgres", "492416");
          if(conn!=null)
          {
              System.out.println("Connection Established!");
          }
          else {
              System.out.println("Connection Failed!");
          }

      }catch(Exception e)
      {
         System.out.println(e);
      }
    return conn;
    }
}

