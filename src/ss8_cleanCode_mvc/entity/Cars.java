package ss8_cleanCode_mvc.entity;

public class Cars extends Vehicles implements Comparable<Cars> {
    public static String model = " AUDI";
    private int id;
    private int powerMachine;

    public Cars(){
    }
    public Cars(int id){
        super(id);
    }
    public Cars(int id, String model, int powerMachine){
        super(id,model);
        this.powerMachine = powerMachine;
    }
    public Cars(int id, String model){
        super(id,model);
    }
    public int getPowerMachine(){
        return powerMachine;
    }
    public void  setPowerMachine(int powerMachine){
        this.powerMachine = powerMachine;
    }
    @Override
    public String toString(){
        return "Cars :" + super.toString() +"PowerMachine"+ powerMachine;
    }

    @Override
    public int compareTo(Cars o) {
        return 0;
    }
}
