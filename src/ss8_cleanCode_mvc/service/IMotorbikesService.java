package ss8_cleanCode_mvc.service;

import ss8_cleanCode_mvc.entity.Motorbikes;

import java.util.ArrayList;

public interface IMotorbikesService {
    ArrayList<Motorbikes> findAll();
    boolean add(Motorbikes motorbikes);
}
