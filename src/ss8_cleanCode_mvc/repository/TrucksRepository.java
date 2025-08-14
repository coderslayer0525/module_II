/*
package ss8_cleanCode_mvc.repository;

import ss8_CleanCode_mvc.entity.Trucks;
import java.util.ArrayList;

public class TrucksRepository implements ITrucksRepository {
    private ArrayList<Trucks> trucksList = new ArrayList<>();

    @Override
    public ArrayList<Trucks> findAll() {
        return trucksList;
    }

    @Override
    public Trucks findByOwner(String ownerName) {
        for (Trucks t : trucksList) {
            if (t.getOwnerName().equalsIgnoreCase(ownerName)) {
                return t;
            }
        }
        return null;
    }

    @Override
    public Trucks findByNumberPlate(String numberPlate) {
        for (Trucks t : trucksList) {
            if (t.getNumberPlate().equalsIgnoreCase(numberPlate)) {
                return t;
            }
        }
        return null;
    }

    @Override
    public void add(Trucks truck) {
        trucksList.add(truck);
    }

    @Override
    public void remove(String numberPlate) {
        trucksList.removeIf(t -> t.getNumberPlate().equalsIgnoreCase(numberPlate));
    }
}*/
