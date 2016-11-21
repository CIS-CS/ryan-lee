package guardstation;

import java.util.ArrayList;

/**
 * @author Mhayes
 */
public class Student {
    
    //implements Comparable
   
    private String fullName;
    private String studentID;
    
    public Student(String fullName, String studentID) {
        this.fullName = fullName;
        this.studentID = studentID;
    }
    
    public String getFullName() {
        return fullName;
    }
 
    public String getStudentID() {
        return studentID;
    }

    public String toString()
    {
        return (getFullName() +  " - " + getStudentID());
    }

}
