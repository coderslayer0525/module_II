package ss8_cleanCode_mvc.service;

import ss8_cleanCode_mvc.entity.Trucks;
import ss8_cleanCode_mvc.repository.ITrucksRepository;
import ss8_cleanCode_mvc.repository.TrucksRepository;

import java.util.ArrayList;

public class TrucksService  implements  ITrucksService{
    private ITrucksRepository trucksRepository = new TrucksRepository();
    @Override
    public ArrayList<Trucks> findAll(){
        return trucksRepository.findAll();
    }
    @Override
    public  boolean add(Trucks trucks){
        return trucksRepository.add(trucks);
    }
}
