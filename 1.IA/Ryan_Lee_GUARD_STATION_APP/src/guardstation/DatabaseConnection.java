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
    
    private static ArrayList<Student> students = new ArrayList<Student>();
    
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
   
   
    public ArrayList<Student> read(String name, String id) throws SQLException // Do try catch blocks for this method. Error message in UI class needed.
    {
        
      //  String sql = "SELECT StudentID,FullName FROM student_table " +
           //          "WHERE StudentID like '1009498' " + 
         //            "AND FullName    like '%Ryan%' ";
       
      String sql =  ("SELECT StudentID,FullName FROM student_table " +
                   "WHERE StudentID like  '" + (id) + "'   " +
                   "AND FullName like '%" + (name) +"%' ");
      stmt = conn.createStatement();
      System.out.println(sql);
        
        students.clear();
        
        rs = stmt.executeQuery(sql);
        while(rs.next()) {    
        //    students.add(rs.getString("FullName"),rs.getInt("StudentID"));      
            Student s = new Student(rs.getString("FullName"), rs.getString("StudentID"));   
            students.add(s);
        }
       
        return students; 
    }
    
  //  public ArrayList<Student> add(String name, String id) //throws SQLException //adds entry to log table
   // {
     //   String sql = ("INSERT INTO studentlog (name, id) VALUES '" +(name));
     //   stmt = conn.createStatement();
       // rs = stmt.executeQuery(sql);
        
   // }        
    
    public void createLogTable() throws SQLException
    {
        stmt = conn.createStatement();
        String sql = "CREATE TABLE Log(Name String, ID String)";  
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
   
}
