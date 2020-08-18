package com.sliit;

public class VehicleAssembler {

    private VehicleBuilder builder;

    public VehicleAssembler(VehicleBuilder builder) {
        this.builder = builder;
    }

    public void assembleVehicle() {
        builder.assembleTyres();
        builder.assembleEngine();
        builder.assembleChassy();
        builder.assembleOuterFramework();
    }

    public Vehicle getVehicle() {
        return builder.getVehicle();
    }
}
