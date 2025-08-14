/*
package ss8_cleanCode_mvc.repository;

import ss8_CleanCode_mvc.entity.Sedans;
import java.util.ArrayList;

public class SedansRepository implements ISedansRepository {
    private ArrayList<Sedans> sedansList = new ArrayList<>();

    @Override
    public ArrayList<Sedans> findAll() {
        return sedansList;
    }

    @Override
    public Sedans findByOwner(String ownerName) {
        for (Sedans s : sedansList) {
            if (s.getOwnerName().equalsIgnoreCase(ownerName)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public Sedans findByNumberPlate(String numberPlate) {
        for (Sedans s : sedansList) {
            if (s.getNumberPlate().equalsIgnoreCase(numberPlate)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void add(Sedans sedan) {
        sedansList.add(sedan);
    }

    @Override
    public void remove(String numberPlate) {
        sedansList.removeIf(s -> s.getNumberPlate().equalsIgnoreCase(numberPlate));
    }
}*/
