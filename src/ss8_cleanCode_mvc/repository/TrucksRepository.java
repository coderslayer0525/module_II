package ss8_cleanCode_mvc.repository;

import ss8_cleanCode_mvc.entity.Trucks;

import java.util.ArrayList;

public class TrucksRepository implements  ITrucksRepository {
    private static ArrayList<Trucks> trucksList = new ArrayList<>();
    static {
        Trucks trucks = new Trucks();
        Trucks conteiener = new Trucks();
        Trucks vans = new Trucks();
        trucksList.add(trucks);
        trucksList.add(conteiener);
        trucksList.add(vans);
    }
    @Override
    public ArrayList<Trucks> findAll(){
        return trucksList;
    }
    @Override
    public boolean add(Trucks trucks){
     trucksList.add(trucks);
     return true;
    }
}
