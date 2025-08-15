package ss8_cleanCode_mvc.service;

import ss8_cleanCode_mvc.entity.Motorbikes;
import ss8_cleanCode_mvc.repository.IMotorbikesRepository;
import ss8_cleanCode_mvc.repository.MotorbikesRepository;

import java.util.ArrayList;

public class MotorbikesService implements IMotorbikesService {
    private IMotorbikesRepository motorbikesRepository = new MotorbikesRepository();
    @Override
    public ArrayList<Motorbikes> findAll(){
        return motorbikesRepository.findAll();
    }
    @Override
    public boolean add(Motorbikes motorbikes){
        return motorbikesRepository.add(motorbikes);
    }
}
