/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2_2;

/**
 *
 * @author chrl98
 */
public class Shape {
   
   private String color;
   private boolean filled;
   
   public Shape() {
      filled = true;
      color = "green";
   }
   
   public Shape(String c,boolean f) {
      
      filled = f;
      color = c;
   }
   
   public String getColor() {
      return color; 
   }
   
   public void setColor(String c) {
      color = c;
   }
   
   public boolean getFilledStatus() {
      return filled;
   }
   
   public void setFilledStatus(boolean f) {
      filled = f;
   }
   
   public String toString() { 
       
   if (filled == false){
        return "A shape with color of " + color + " and not filled"  ;
   }
   else {
       return "A shape with color of " + color + " and filled";
   }
}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
