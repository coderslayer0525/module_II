package ss8_cleanCode_mvc.repository;

import ss8_cleanCode_mvc.entity.Motorbikes;

import java.util.ArrayList;

public class MotorbikesRepository implements IMotorbikesRepository{
    private static ArrayList<Motorbikes> motorbikesList = new ArrayList<>();
    static {
        Motorbikes yamaha = new Motorbikes();
        Motorbikes ducati = new Motorbikes();
        Motorbikes harley = new Motorbikes();

        motorbikesList.add(yamaha);
        motorbikesList.add(ducati);
        motorbikesList.add(harley);
    }
    @Override
    public ArrayList<Motorbikes> findAll(){
        return motorbikesList;
    }
    @Override
    public boolean add(Motorbikes motorbikes){
        motorbikesList.add(motorbikes);
        return true;
    }
}
