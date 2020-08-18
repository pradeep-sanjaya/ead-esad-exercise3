package com.sliit;

public abstract class VehicleBuilder {

    public VehicleBuilder() {
        System.out.println("Start assemble the vehicle");
    }

    public abstract void assembleTyres();
    public abstract void assembleEngine();
    public abstract void assembleChassy();
    public abstract void assembleOuterFramework();
    public abstract Vehicle getVehicle();
}
