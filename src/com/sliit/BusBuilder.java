package com.sliit;

public class BusBuilder extends VehicleBuilder {

    private Vehicle vehicle;

    public BusBuilder() {
        super();
        vehicle = new Bus();
    }

    @Override
    public void assembleTyres() {
        System.out.println("Add bus tyres");
    }

    @Override
    public void assembleEngine() {
        System.out.println("Add bus engine");
    }

    @Override
    public void assembleChassy() {
        System.out.println("Fix the chassy of the bus");
    }

    @Override
    public void assembleOuterFramework() {
        System.out.println("Fix the outer frame and finish the assemble work");
    }

    @Override
    public Vehicle getVehicle() {
        System.out.println("Returning the Bus");
        return vehicle;
    }
}
