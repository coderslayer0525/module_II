package ss8_cleanCode_mvc.repository;

import ss8_cleanCode_mvc.entity.Trucks;

import java.util.ArrayList;

public interface ITrucksRepository {
    ArrayList<Trucks> findAll();
    boolean add(Trucks trucks);
}
