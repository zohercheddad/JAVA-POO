package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Polymorphisme {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Vehicle electric = new ElVehicle();
        Vehicle hybrid = new HybridVehicle();

        vehicle.start();
        vehicle.resource();

        electric.start();
        electric.resource();

        hybrid.start();
        hybrid.resource();
    }
}

class Vehicle {
    public void start() {
        System.out.println("Starting");
    }

    public void resource() {
        System.out.println("I use petrol");
    }
}

class ElVehicle extends Vehicle {
    @Override
    public void resource() {
        System.out.println("I use electricity");
    }
}

class HybridVehicle extends Vehicle {
    @Override
    public void resource() {
        System.out.println("I use both petrol and electricity");
    }
}
