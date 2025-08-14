package ss8_cleanCode_mvc.service;

import ss8_cleanCode_mvc.entity.Cars;

import java.util.ArrayList;

public interface ICarsService {
    ArrayList<Cars> findAll();
    boolean add(Cars cars);
}
