package ss8_cleanCode_mvc.repository;

import ss8_cleanCode_mvc.entity.Cars;
import ss8_cleanCode_mvc.entity.Vehicles;

import java.util.ArrayList;

public class CarsRepository implements ICarsRepository {
    private static ArrayList<Cars> carsList = new ArrayList<>();

    static {
        Cars au = new Cars();
        Cars mez = new Cars();
        Cars bmw = new Cars();
        carsList.add(au);
        carsList.add(mez);
        carsList.add(bmw);
    }
    @Override
    public ArrayList<Cars> findAll(){

        return  carsList;
    }
    @Override
    public  boolean add(Cars cars){
        carsList.add(cars);
        return true;
    }
}