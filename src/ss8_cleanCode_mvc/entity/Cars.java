package ss8_cleanCode_mvc.entity;

public class Cars extends Vehicles implements Comparable<Cars> {
    public static String brand = " BỘ CÔNG NÔNG";
    public int id;
    public int slot;

    public Cars() {
    }

    public Cars(int id) {
        super(id);

    }

    public Cars(int id, String model) {

    }

    @Override
    public Object getInfoToCSV() {
        return this.getModel() + "," + this.getId() + ",";
    }

    public Cars(int id, String model, int slot) {
        super(id, model);
        this.slot = slot;
    }
    public double getSlot(){
        return  slot;
    }
    public void setSlot(int slot){
        this.slot= slot;
    }
    public boolean equals(Vehicles v){
        Vehicles vehicles = (Vehicles) v;
        return this.getId() == vehicles.getId() && vehicles.getModel().equals(this.getModel());
    }

    @Override
    public int compareTo(Cars cars) {
        return this.getId() - cars.getId();
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + getId() +
                ", model="+getModel()+
                ", slot=" + getSlot() +
                '}';
    }
}

