package ss8_cleanCode_mvc.entity;

public class Motorbikes {
    private int id;
    private String model;
    private int speed;
    public Motorbikes(){

    }
    public Motorbikes(int id,String model,int speed){
        this.id = id;
        this.model = model;
        this.speed = speed;
    }
    public Motorbikes(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString(){
        return "id=" + id +
                ", model'" + model +
                ", speed'"+ speed;
    }
}
