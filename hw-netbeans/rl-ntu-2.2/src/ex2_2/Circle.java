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
public class Circle extends Shape {
    private double radius;
    
    public Circle() {
      super();
      radius = 1.0;
    }
    
    public Circle(double r) {
      super();
      radius = r;   
    }
    
    public Circle(double r, String c, boolean f) {
      super(c,f);
      radius = r;
    }
    
    public double getRadius() {
      return radius;
    }
    
    public void setRadius(double r) {
        radius = r;   
    }
    
    public double getArea () {
        return Math.PI*radius*radius;
    }
    
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    
    public String toString() { 
        return "A circle with radius= " + radius + ", which is a subclass of " + super.toString();
    }
}
