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
public class Rectangle extends Shape {
    
    public double width;
    public double length;
    
    public Rectangle(){
      
        super();
        width = 1.0;
        length = 1.0;
    }
   
    public Rectangle (double w, double l){
      
        super();
        width = w;
        length = l;
    }
   
    public Rectangle (double w, double l, String c, boolean f ){
        
        super(c, f);
        width = w;
        length = l;
        
    }
     
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double w){
        width = w;
    }
     
    public double getLength(){
        return length;
    }
   
    public void setLength(double l){
        
        length = l;
    }
    
    public double getArea(){
        return width*length;  
    }
   
    public double getPerimeter(){
        return 2*(width + length);
    }
    
    @Override
    public String toString(){
        return "A rectangle with width= " + width + " and length= " + length + ", which is a subclass of " + super.toString();
    }
}
