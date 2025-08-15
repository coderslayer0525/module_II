package ss8_cleanCode_mvc.repository;

import ss8_cleanCode_mvc.entity.Motorbikes;

import java.util.ArrayList;

public interface IMotorbikesRepository {
    ArrayList<Motorbikes> findAll();
    boolean add(Motorbikes motorbikes);
}
