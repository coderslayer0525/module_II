package ss8_cleanCode_mvc.entity;

public abstract  class Vehicles{
    private int id;
    private String name;

    public Vehicles() {
    }

    public Vehicles(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Vehicles(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", name='" + name ;
    }
}
