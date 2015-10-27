/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package csm10j.lab09;

import interfaces.CarB;
import interfaces.ConvertibleB;
import interfaces.Drivable;
import polymorphism.CarA;
import polymorphism.ConvertibleA;
import polymorphism.Vehicle;

/**
 *
 * @author 
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Part A polymorphism
		CarA carPoly = new CarA();
		ConvertibleA convertiblePoly = new ConvertibleA();
		System.out.println("Part A - Polymporphism");
		// Make the tests print true
		System.out.println("Car is a vehicle: " + (carPoly instanceof Vehicle));
		System.out.println("Convertible is a vehicle: " + (convertiblePoly instanceof Vehicle));
		System.out.println("Car is not a convertible: " + !(carPoly instanceof ConvertibleA));
		System.out.println("Convertible is a car: " + (convertiblePoly instanceof CarA));
		carPoly.Drive();
		carPoly.Start();
		carPoly.Drive();
		// Expected output
		//Start the vehicle first
		//Starting vehicle
		//Driving vehicle
		convertiblePoly.Start();
		convertiblePoly.PutTopDown();
		convertiblePoly.PutTopDown();
		convertiblePoly.Drive();
		// Expected output
		// Starting vehicle
		// Putting top down
		// Top already down
		// Driving vehicle
		// Part B convertible
                
                CarB carDrivable = new CarB();
		ConvertibleB convertibleDrivable = new ConvertibleB();
		System.out.println("Part B - interface");
		// Make the tests print true
		// Why dont these compile?
		// System.out.println("Is car a convertible? " + (carDrivable instanceof ConvertibleB));
		// System.out.println("Is convertible a car ? " + (convertibleDrivable instanceof CarB));
                
                //above two statement are not compiled because carDrivable and convertibleDrivable both
                //are not extending from same super class
                
		// Why do these compile?
		System.out.println("CarPoly is not drivable: " + !(carPoly instanceof Drivable));
		System.out.println("ConvertiblePoly is not drivable: " + ! (convertiblePoly instanceof Drivable));
		System.out.println("CarDrivable is drivable : " + (carDrivable instanceof Drivable));
		System.out.println("ConvertibleB is drivable : " + (convertibleDrivable instanceof Drivable));
		carDrivable.Drive();
		carDrivable.Start();
		carDrivable.Drive();
		// Expected output
		//Start the vehicle first
		//Starting vehicle
		//Driving vehicle
                
                convertibleDrivable.Start();
		convertibleDrivable.PutTopDown();
		convertibleDrivable.PutTopDown();
		convertibleDrivable.PutTopUp();
		convertibleDrivable.Drive();
		// Expected output
		// Starting vehicle
		// Putting top down
		// Top already down
		// Putting top up
		// Driving vehicle
    }
    
}
