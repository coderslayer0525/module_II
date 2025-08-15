package ss8_cleanCode_mvc.service;
import ss8_cleanCode_mvc.entity.Cars;
import ss8_cleanCode_mvc.repository.CarsRepository;
import ss8_cleanCode_mvc.repository.ICarsRepository;

import java.util.ArrayList;

public class CarsService implements ICarsService {
    private ICarsRepository carsRepository = new CarsRepository();

    @Override
    public ArrayList<Cars> findAll() {
        return carsRepository.findAll();
    }

    @Override
    public boolean add(Cars cars) {
        return carsRepository.add(cars);
    }
}