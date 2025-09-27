package ParkingLot.Model;

import java.util.List;

public class ParkingLot extends BaseModel{
    private int id;
    private List<Gate> entryGate;
    private List<Gate> exitGate;
    private List<ParkingFloor> parkingFloors;
    private List<VehicleType> vehicles;
    private int capacity;;
    private Status parkingFloorStatus;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Gate> getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(List<Gate> entryGate) {
        this.entryGate = entryGate;
    }

    public List<Gate> getExitGate() {
        return exitGate;
    }

    public void setExitGate(List<Gate> exitGate) {
        this.exitGate = exitGate;
    }

    public List<VehicleType> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<VehicleType> vehicles) {
        this.vehicles = vehicles;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }
}
