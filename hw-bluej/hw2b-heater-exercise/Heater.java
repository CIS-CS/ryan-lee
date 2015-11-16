/**
 * Write a description of class Heater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heater
{
    private double temperature;
    private double min;
    private double max;
    private double increment;

    /**
     * Constructor for objects of class Heater
     */
    public Heater(double setMinimum, double setMaximum)
    {
        temperature = 15.0;
        increment = 5.0;
        min = setMinimum;
        max = setMaximum;
    }
    
    public void warmer()
    {   
        temperature = temperature + increment;
        if (temperature > max)
            temperature = max;
    }
    
    public void cooler()
    {
        temperature = temperature - increment;
        if (temperature < min)
            temperature = min;
    }
    
    public double getTemperature()
    {
        return temperature;
    }
    
    // takes paraameter and sets value of increment, Boolean to test if it works or not
    public boolean setIncrement(double incrementValue)
    { 
       if (incrementValue > 0)
       {
           increment = incrementValue;
           return true;
        }
       else 
       {
           return false;
       }
    }
}