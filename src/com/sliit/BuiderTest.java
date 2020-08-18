package com.sliit;

public class BuiderTest {

    public static void main(String[] args) {
        VehicleBuilder carBuilder = new CarBuilder();
        VehicleAssembler assembler1 = new VehicleAssembler(carBuilder);
        assembler1.assembleVehicle();
        assembler1.getVehicle();

        System.out.println("========================================");

        VehicleBuilder busBuilder = new BusBuilder();
        VehicleAssembler assembler2 = new VehicleAssembler(busBuilder);
        assembler2.assembleVehicle();
        assembler2.getVehicle();

    }
}
