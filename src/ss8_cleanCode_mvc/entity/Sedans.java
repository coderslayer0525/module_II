package ss8_cleanCode_mvc.entity;

public class Sedans {
    private int id;
    private String name;

    public Sedans() {
    }

    public Sedans(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Sedans(int id) {
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
