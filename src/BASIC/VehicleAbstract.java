// File: VehicleAbstract.java
package BASIC;

abstract class Vehicle {
    abstract void start();  

    void stop() {           
        System.out.println("Vehicle stopped");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a kick");
    }

    void stop() {           
        System.out.println("Bike stopped");
    }
}

public class VehicleAbstract {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        v.stop();
    }
}
