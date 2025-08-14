package ss8_cleanCode_mvc.service;

import ss8_cleanCode_mvc.entity.Vehicles;

import java.util.ArrayList;

public interface IVehiclesService {
    ArrayList<Vehicles> findAll();
    boolean add(Vehicles vehicles);
}
