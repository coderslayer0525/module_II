/*


package ss8_CleanCode_mvc.repository;

import ss8_CleanCode_mvc.entity.Cars;
import java.util.ArrayList;

public class CarsRepository implements ICarsRepository {
    private ArrayList<Cars> carsList = new ArrayList<>();

    @Override
    public ArrayList<Cars> findAll() {
        return carsList;
    }

    @Override
    public Cars findByOwner(String ownerName) {
        for (Cars c : carsList) {
            if (c.getOwnerName().equalsIgnoreCase(ownerName)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public Cars findByNumberPlate(String numberPlate) {
        for (Cars c : carsList) {
            if (c.getNumberPlate().equalsIgnoreCase(numberPlate)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void add(Cars car) {
        carsList.add(car);
    }

    @Override
    public void remove(String numberPlate) {
        carsList.removeIf(c -> c.getNumberPlate().equalsIgnoreCase(numberPlate));
    }
}*/
