package ss8_cleanCode_mvc.repository;

import ss8_cleanCode_mvc.entity.Cars;

import java.util.ArrayList;

public class CarsRepository implements ICarsRepository {
    private  static ArrayList<Cars> carsList = new ArrayList<>();
    static {
        Cars trucks = new Cars();
        Cars cars = new Cars();
        Cars motorbikes = new Cars();
        carsList.add(trucks);
        carsList.add(cars);
        carsList.add(motorbikes);
    }
    @Override
    public ArrayList<Cars> findAll(){

        return carsList;
    }
    @Override
    public  boolean add(Cars cars){
        carsList.add(cars);
        return true;
    }
}
