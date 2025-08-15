package ss8_cleanCode_mvc.entity;

public class Cars {
    private int id;
    private String  model;

    public Cars(){
    }
    public Cars(int id, String model){
        this.id = id;
        this.model = model;
    }
    public Cars(int id){
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
