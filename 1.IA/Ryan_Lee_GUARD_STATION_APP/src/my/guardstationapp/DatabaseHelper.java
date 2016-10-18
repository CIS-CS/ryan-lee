/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.guardstationapp;

import java.util.ArrayList;

/**
 *
 * @author chrl98
 */
public class DatabaseHelper {
    
    private static final DatabaseHelper INSTANCE = new DatabaseHelper();
    
    
       private ArrayList<String> students;
       
        public DatabaseHelper() {
     
        
        students = new ArrayList<>();
        
    }
       
   
}
