package my.guardstationapp;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author chrl98
 */
public class DatabaseConnection {
    
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/cis_security";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "password";
   
   public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try{
           //STEP 2: Register JDBC driver
           Class.forName("com.mysql.jdbc.Driver");

           //STEP 3: Open a connection
           System.out.println("Connecting to database...");
           conn = DriverManager.getConnection(DB_URL, USER, PASS);

           //STEP 4: Execute a query
           System.out.println("Creating statement...");
           stmt = conn.createStatement();
           String sql;
           sql = "SELECT name, age FROM test;";
           ResultSet rs = stmt.executeQuery(sql);

           //STEP 5: Extract data from result set
           while(rs.next()){
              //Retrieve by column name
              String name  = rs.getString("name");
              int age = rs.getInt("age");
              //String advisory = rs.getString("advisory");
              //String id = rs.getString("id");

              //Display values
              System.out.println("Name: " + name  + " " + "Age: " + age);
              //System.out.println("Age: " + age);
              //System.out.print("Advisory: " + advisory);
              //System.out.println("ID: " + id);
           }
           //STEP 6: Clean-up environment
           rs.close();
           stmt.close();
           conn.close();
        }
        catch(SQLException se){
           //Handle errors for JDBC
           se.printStackTrace();
        }
        catch(Exception e){
           //Handle errors for Class.forName
           e.printStackTrace();
        }
        finally{
           //finally block used to close resources
           try{
              if(stmt!=null)
                 stmt.close();
           }catch(SQLException se2){
           }// nothing we can do
           try{
              if(conn!=null)
                 conn.close();
           }catch(SQLException se){
              se.printStackTrace();
           }//end finally try
        }
        System.out.println("Goodbye!");
        }
    
}
