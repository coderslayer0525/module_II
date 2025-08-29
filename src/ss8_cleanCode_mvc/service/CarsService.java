package ss8_cleanCode_mvc.service;

import ss8_cleanCode_mvc.entity.Cars;
import ss8_cleanCode_mvc.repository.CarsRepository;
import ss8_cleanCode_mvc.repository.ICarsRepository;

import java.util.ArrayList;
import java.util.List;

public class CarsService implements ICarsService {
    private ICarsRepository carsRepository = new CarsRepository();

    @Override
    public List<Cars> findAll() {
        return carsRepository.findAll();
    }

    @Override
    public boolean add(Cars cars) {
        return carsRepository.add(cars);
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(int id, Cars newCars, int slot) {
        return false;
    }



    @Override
    public Cars findbyId(int id) {
        return null;
    }
}