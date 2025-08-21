package ss8_cleanCode_mvc.repository;

import ss8_cleanCode_mvc.entity.Cars;
import ss8_cleanCode_mvc.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarsRepository implements ICarsRepository {
    private final String CARS_FILE = "src/ss8_cleanCode_mvc/data/cars";
    @Override
    public List<Cars> findAll() {
        List<Cars> carsList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(CARS_FILE);
            String[] array = null;
            for (String line: stringList) {
                array = line.split(",");
//                int id, String model
                Cars cars = new Cars(Integer.parseInt(array[0]),array[1]);
                carsList.add(cars);
            }
        } catch (IOException e) {
            System.out.println("lỗi đọc file");
        }
        return carsList;
    }

    @Override
    public boolean add(Cars cars) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(int id, Cars newCars) {
        return false;
    }

    @Override
    public Cars findbyId(int id) {
        return null;
    }


}
