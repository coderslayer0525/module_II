package ss8_cleanCode_mvc.service;

import ss8_cleanCode_mvc.entity.Trucks;

import java.util.ArrayList;

public interface ITrucksService {
    ArrayList<Trucks> findAll();
    boolean add(Trucks trucks);
}
