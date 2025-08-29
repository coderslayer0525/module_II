package ss8_cleanCode_mvc.repository;

import ss8_cleanCode_mvc.entity.Cars;
import ss8_cleanCode_mvc.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarsRepository implements ICarsRepository {
    private final String CARS_FILE = "src/ss8_cleanCode_mvc/data/cars";
    List<Cars> carsList = new ArrayList<>();
    @Override
    public List<Cars> findAll() {
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(CARS_FILE);
            String[] array = null;
            for (String line: stringList) {
                array = line.split(",");
                Cars cars = new Cars(Integer.parseInt(array[0]),array[1], Integer.parseInt(array[2]));
                carsList.add(cars);
            }
        } catch (Exception e) {
            System.out.println("lỗi đọc file");
            e.printStackTrace();
        }
        return carsList;
    }

    @Override
    public boolean add(Cars cars) {
        carsList.add(cars);
        try{
            ReadAndWriteFile.writeFileCSV(CARS_FILE, carsList,true);
        }catch (Exception e){
            System.out.println(" Loi Ghi file");
            return  false;
        }
        return true;
    }

    @Override
    public boolean delete(int id) {
        return true;
    }

    @Override
    public boolean update(int id, Cars newCars, double slot) {
        return true;
    }



    @Override
    public Cars findbyId(int id) {
        return null;
    }


}
