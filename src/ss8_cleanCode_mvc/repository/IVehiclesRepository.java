package ss8_cleanCode_mvc.repository;

import ss8_cleanCode_mvc.entity.Vehicles;

import java.util.ArrayList;
public interface IVehiclesRepository {
    ArrayList<Vehicles> findAll();
    boolean add(Vehicles vehicles);
}