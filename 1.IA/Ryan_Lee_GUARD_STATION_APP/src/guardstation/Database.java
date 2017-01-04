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
public class Database {
    
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
  
    //  Connect.
    public ArrayList<Student> read(String name, String id) throws ClassNotFoundException, SQLException // Do try catch blocks for this method. Error message in UI class needed.
    {
  //    String sql =  ("SELECT StudentID,FullName FROM student_table " +
             //      "WHERE FullName like  '%" + (name) + "%' " + "OR StudentID like '" + (id) +"'"); // +
               //  ("OR (StudentID like '"+(id)+"' AND FullName like '%"+ (name) + "%'"); //search by ID only works but name does not work
               // only use WHERE, LIKE, OR, ORDER
               
             //  String sql = ("SELECT StudentID, FullName FROM student_table WHERE FullName IN '%" + (name)+"'" + "OR StudentID IN'"+(id)+"'");     
             
        // Connect to database. Might be possible to a)Connect when app starts b)Separate it back to what it was before. DONT duplicate code.    
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
        
        String sql = "Select * FROM student_table WHERE";
             
        // Create SQL statement.     
        if (name.equals(""))
        {
           sql = sql + " StudentID like '"+ (id) + "';"; 
           // String sql = ("StudentID like '" + (id) + "'");
        } 
        else if (id.equals(""))
        {
           sql = sql + " FullName like '%" + (name) + "%';"; //+ " AND StudentID like'" + (id) + "';";
            //String sql = ("Select * FROM student_table WHERE FullName like'" + (name) + "'" + "AND StudentID like'" + (id) + "';");
        }
        else
        {
           sql = sql + " FullName like '%" + (name) + "%'" + " AND StudentID like'" + (id) + "';"; 
        }

        // Execute SQL statement.
        stmt = conn.createStatement();
        System.out.println(sql);
        rs = stmt.executeQuery(sql);
         
        // Clear the ArrayList
        students.clear();
        
        // Process the result set. 
        while(rs.next()) {    
            Student s = new Student(rs.getString("FullName"), rs.getString("StudentID"));    
            students.add(s);
        }     
        
        // Return ArrayList of Student objects.
        return students; 
    }
    
    //public ArrayList<Student> add(String name, String id) throws SQLException //adds entry to log table
    
    
    // public void writeToLog(String name, String id, String purpose) throws ClassNotFoundException, SQLException // reading ONE ROW only every time the button is pressed)
    public void writeToLog(String selectedObject) throws ClassNotFoundException, SQLException        
            // DONT SELECT MORE THAN ONE ITEM
            // CONSIDER multiple entries
    {
        //String sql = ("INSERT INTO studentlog WHERE FullName like'" + (name) + "' AND StudentID like '"+ (id) + " VALUES '" +  (name) +(id));
       // String sql = ("INSERT INTO studentlog '"+ (name) + "'WHERE FullName like'" + (name) + "' AND StudentID like '" " VALUES '" +  (name)";
  //   String sql = ("INSERT INTO studentlog '"+(name)+ (id)+"'" +"VALUES '"+(name)+(id)+"'");
    
        // Connect again here.
        
        
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
        
        
         String sql = "INSERT INTO studentlog (name,id,timein,timeout,reason) VALUES ('"+selectedObject+"',null,null,null,null);";
       // String sql = ("INSERT INTO studentlog (name,id) VALUES ('" + (name) +"', '" + (id) + "';");
       
        stmt = conn.createStatement();
        System.out.println(sql);
        rs = stmt.executeQuery(sql);
        
    }        
  
    public void getSystemTime()
    {
        Calendar now = Calendar.getInstance(); 
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int hour2 = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        System.out.println(now);
    }
    
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
            rs.close(); // check if rs is null or not
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
           }
           catch(SQLException se2){
           }// nothing we can do
           try{
              if(conn!=null)
                 conn.close();
           }
           catch(SQLException se){
              se.printStackTrace();
           }//end finally try
        }
        System.out.println("Goodbye");
    }  
}
