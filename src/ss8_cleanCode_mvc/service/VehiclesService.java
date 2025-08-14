package ss8_cleanCode_mvc.service;
import ss8_cleanCode_mvc.entity.Vehicles;
import ss8_cleanCode_mvc.repository.IVehiclesRepository;
import ss8_cleanCode_mvc.repository.VehiclesRepository;
import java.util.ArrayList;

public class VehiclesService implements IVehiclesService{
    private IVehiclesRepository vehiclesRepository = new VehiclesRepository();

    @Override
    public ArrayList<Vehicles> findAll(){
        return vehiclesRepository.findAll();
    }
    @Override
    public boolean add(Vehicles vehicles){

        return vehiclesRepository.add(vehicles);
    }
}