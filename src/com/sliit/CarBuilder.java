package com.sliit;

public class CarBuilder extends VehicleBuilder {

    private Vehicle vehicle;

    public CarBuilder() {
        super();
        vehicle =  new Car();
    }

    @Override
    public void assembleTyres() {
        System.out.println("Add car tyres");
    }

    @Override
    public void assembleEngine() {
        System.out.println("Add car engine");
    }

    @Override
    public void assembleChassy() {
        System.out.println("Fix the chassy of the car");
    }

    @Override
    public void assembleOuterFramework() {
        System.out.println("Fix the outer frame and finish the assemble work");
    }

    @Override
    public Vehicle getVehicle() {
        System.out.println("Returning the Car");
        return vehicle;
    }
}
