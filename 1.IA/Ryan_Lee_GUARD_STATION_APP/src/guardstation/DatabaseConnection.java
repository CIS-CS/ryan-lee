package guardstation;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.*;


/**
 *
 * @author chrl98
 */
public class DatabaseConnection {
    
    private ArrayList<Student> students = new ArrayList<Student>();
    
    // JDBC driver name and database URL
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    private static final String DB_URL = "jdbc:mysql://localhost:3306/cis_security";

    //  Database credentials
    private static final String USER = "root";
    private static final String PASS = "password";
    
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    
    /**
     * Establishes connection to the database.
     * 
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public void connect() throws ClassNotFoundException, SQLException //error message in UI class needed
    {
        try {
           // Register JDBC driver
           Class.forName("com.mysql.jdbc.Driver");

           // Open a connection
           System.out.println("Connecting to database...");
           conn = DriverManager.getConnection(DB_URL, USER, PASS);
        }
        catch (ClassNotFoundException e) {
            throw e;
        }  
        catch (SQLException e) {
            throw e;
        }    
    }        
    
    /**
     * Reads the SQL database to retrieve student data.
     * 
     * @return ArrayList of student objects
     * @throws Exception 
     */
    public ArrayList read() throws SQLException // Do try catch blocks for this method. Error message in UI class needed.
    {
        try {
        // Execute a query
        //System.out.println("Creating statement...");
        stmt = conn.createStatement();
        String sql = "SELECT fullName, StudentID FROM student_table;";
        rs = stmt.executeQuery(sql);
        //System.out.println(sql);

        // Extract data from result set
        while(rs.next()) {
            
            Student student = new Student(rs.getString("FullName"), rs.getString("StudentID"));
            students.add(student);
        }
        return students;
    }
        
         catch (SQLException e) {
            throw e;
        } 
    }
    
    /**
     * Closes the database connection.
     * 
     * @throws Exception 
     */
    public void close() throws SQLException  // Error message in UI class needed.
    {
        try {
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
        System.out.println("Goodbye");
    }
    
     public static void main(String args[]) {
         
    }
   
}
