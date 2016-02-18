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
public class RocketBike extends Bicycle {
    
    public int ammo;
	
     public RocketBike(int startCadence, int startSpeed, int startGear, int rocketAmmo)
             {
        super(startCadence,
              startSpeed,
              startGear);
        this.setAmmo(rocketAmmo);
            }
    
      public int getAmmo(){
      return this.ammo;
    }

    public void setAmmo(int rocketAmmo) {
        this.ammo = rocketAmmo;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The " + "MountainBike has " +
            getAmmo() + " rockets.");
    }
}
