package ss4_oop.bai_tap_Fan;

public class main {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public main(){
    }
public int getSpeed(){
    return speed;
}
public void setSpeed(int speed){
        this.speed = speed;
}
public boolean isOn(){
        return on;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
