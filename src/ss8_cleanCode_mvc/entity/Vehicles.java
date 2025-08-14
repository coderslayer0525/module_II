package ss8_cleanCode_mvc.entity;
import ss8_cleanCode_mvc.service.VehiclesService;
import ss8_cleanCode_mvc.repository.VehiclesRepository;
import ss8_cleanCode_mvc.controller.VehiclesController;
import ss8_cleanCode_mvc.view.VehiclesView;
public class Vehicles {
    private int id;
    private String  model;

    public Vehicles(){
    }
    public Vehicles(int id, String model){
        this.id = id;
        this.model = model;
    }
    public Vehicles(int id){
        this.id = id;
    }
    public int getId(){
        return  id;
    }
    public void  setId(int id){
        this.id = id;
    }
    public String getModel(){
        return  model;
    }
    public void  setModel(String model){
        this.model = model;
    }
    @Override
    public String toString(){
        return
                "id=" + id +
                        ", model'" + model;
    }
}
