/*
package ss8_cleanCode_mvc.repository;

import ss8_CleanCode_mvc.entity.Vehicles;
import java.util.ArrayList;

public class VehiclesRepository implements IVehiclesRepository {
    private ArrayList<Vehicles> vehiclesList = new ArrayList<>();

    @Override
    public ArrayList<Vehicles> findAll() {
        return vehiclesList;
    }

    @Override
    public Vehicles findByOwner(String ownerName) {
        for (Vehicles v : vehiclesList) {
            if (v.getOwnerName().equalsIgnoreCase(ownerName)) {
                return v;
            }
        }
        return null;
    }

    @Override
    public Vehicles findByNumberPlate(String numberPlate) {
        for (Vehicles v : vehiclesList) {
            if (v.getNumberPlate().equalsIgnoreCase(numberPlate)) {
                return v;
            }
        }
        return null;
    }

    @Override
    public void add(Vehicles vehicle) {
        vehiclesList.add(vehicle);
    }

    @Override
    public void remove(String numberPlate) {
        vehiclesList.removeIf(v -> v.getNumberPlate().equalsIgnoreCase(numberPlate));
    }
}*/
