package labs.module14;

import java.io.Serializable;

public class Vehicle implements Serializable
{
    // Properties of the class. Transient properties are not serialised    
    private String vehicleManufacturer;
    private String vehicleType;

    // Example for transient
    transient private String vehicleChasisNumber;

    public Vehicle(String vehicleManufacturer, String vehicleType, String vehicleChasisNumber) {
        this.vehicleManufacturer = vehicleManufacturer;
        this.vehicleType = vehicleType;
        this.vehicleChasisNumber = vehicleChasisNumber;
    }

    public String getVehicleManufacturer() {
        return vehicleManufacturer;
    }

    public void setVehicleManufacturer(String vehicleManufacturer) {
        this.vehicleManufacturer = vehicleManufacturer;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public String getVehicleChasisNumber() {
        return vehicleChasisNumber;
    }

    public void setVehicleChasisNumber(String vehicleChasisNumber) {
        this.vehicleChasisNumber = vehicleChasisNumber;
    }

    @Override
    public String toString() {
        return "Vehicle [vehicleManufacturer=" + vehicleManufacturer + ", vehicleType=" + vehicleType
                + ", vehicleChasisNumber=" + vehicleChasisNumber +  "]";
    }

} // End of Vehicle class
