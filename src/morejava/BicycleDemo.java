/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morejava;

/**
 *
 * @author imamu
 */
class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 0;
    
    void changeCadence(int newValue) {
        cadence = newValue;
    }
    
    void changeGear(int newValue) {
        gear = newValue;
    }
    
    void speedUp(int increment) {
        speed = speed + increment;
    }
    
    void applyBrakes(int decrement) {
        speed = speed - decrement;                                             ;
    }
    
    void printStates() {
        System.out.println("Cadence: " + cadence + " Speed: " + speed + " Gear: " + gear + "\n");
    }
    
}

public class BicycleDemo {
    public static void main(String[] args) {
        //Create two different Bicycle object
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        System.out.println("Bike 1 Status: ");
        bike1.printStates();
        
        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        System.out.println("Bike 2 Status: ");
        bike2.printStates();
    }
}
