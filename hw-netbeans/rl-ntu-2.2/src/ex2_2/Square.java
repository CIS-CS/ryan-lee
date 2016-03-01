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
public class Square extends Rectangle {
    
    public Square (){
        super();
    }
  
    public Square (double side){
        super(side, side);
    }
   
    public Square (double side, String color, boolean filled){
        super (side, side, color, filled );
    }
    
    public double getSide(){
        return super.getLength();
    }
    
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
    public void setWidth(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
    public String toString (){
        return "A square with side= "  + getSide() + ", which is a subclass of " + super.toString();
    }  
}
