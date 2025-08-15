package ss8_cleanCode_mvc.repository;

import ss8_cleanCode_mvc.entity.Cars;

import java.util.ArrayList;
public interface ICarsRepository {
    ArrayList<Cars> findAll();
    boolean add(Cars cars);
}