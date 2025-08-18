package ss8_cleanCode_mvc.service;

import ss8_cleanCode_mvc.entity.Cars;

import java.util.ArrayList;

public interface ICarsService {
    ArrayList<Cars> findAll();
    boolean add(Cars cars);
    boolean delete(int id);
    boolean update(int id, Cars newCars);
    Cars findbyId(int id);
}
