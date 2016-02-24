/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5.polymorphism.pkg5e;

/**
 *
 * @author chrl98
 */
public class ElectricBike extends Bicycle {
    
    public double battery;
	
     public ElectricBike(int startCadence, int startSpeed, int startGear, double currentBattery)
             {
        super(startCadence,
              startSpeed,
              startGear);
        this.setBattery(currentBattery);
            }
    
      public double getBattery(){
      return this.battery;
    }

    public void setBattery(double currentBattery) {
        this.battery = currentBattery;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "ElectricBike has " +
            getBattery() + " of battery.");
    }
    
}
