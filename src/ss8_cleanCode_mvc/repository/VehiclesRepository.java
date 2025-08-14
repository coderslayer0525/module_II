package ss8_cleanCode_mvc.repository;

import ss8_cleanCode_mvc.entity.Vehicles;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class VehiclesRepository implements IVehiclesRepository {
    private  static ArrayList<Vehicles> vehiclesList = new ArrayList<>();
    static {
        Vehicles trucks = new Vehicles();
        Vehicles cars = new Vehicles();
        Vehicles motorbikes = new Vehicles();
        vehiclesList.add(trucks);
        vehiclesList.add(cars);
        vehiclesList.add(motorbikes);
    }
    @Override
    public ArrayList<Vehicles> findAll(){

        return  vehiclesList;
    }
    @Override
    public  boolean add(Vehicles vehicles){
        vehiclesList.add(vehicles);
        return true;
    }
}
