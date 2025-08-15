package ss8_cleanCode_mvc.entity;

public class Trucks {
    private int id;
    private String model;
    private int power;

    public Trucks() {
    }

    public Trucks(int id, int power, String model) {
        this.id = id;
        this.power = power;
        this.model = model;
    }

    public Trucks(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ",model'" + model +
                ", power'" + power;
    }
}
