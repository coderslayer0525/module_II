package ss8_cleanCode_mvc.repository;

import ss8_cleanCode_mvc.entity.Cars;

import java.util.ArrayList;

public interface ICarsRepository {
    ArrayList<Cars> findAll();

    boolean add(Cars cars);

    boolean delete(int id);

    boolean update(int id, Cars newCars);

    Cars findbyId(int id);
}

