package ss8_cleanCode_mvc.repository;

import ss8_cleanCode_mvc.entity.Cars;
import ss8_cleanCode_mvc.entity.Motorbikes;
import ss8_cleanCode_mvc.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MotorbikesRepository implements IMotorbikesRepository{
   private final String MOTORS_FILE = "src/ss8_cleanCode_mvc/data/motors";
    @Override
    public List<Motorbikes> findAll(){
        List<Motorbikes> motorbikesList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(MOTORS_FILE);
            String[] array = null;
            for (String line: stringList) {
                array = line.split(",");
//                int id, String model
                Motorbikes motorbikes = new Motorbikes(Integer.parseInt(array[0]),array[1],Integer.parseInt(array[2]));
                motorbikesList.add(motorbikes);
            }
        } catch (IOException e) {
            System.out.println("lỗi đọc file");
        }
        return motorbikesList;
    }
    @Override
    public boolean add(Motorbikes motorbikes){
        return true;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(int id, Motorbikes newMotorbikes) {
        return true;
    }

    @Override
    public Motorbikes findbyId(int id) {
        return null;
    }
}
