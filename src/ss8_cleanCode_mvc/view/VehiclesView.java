package ss8_cleanCode_mvc.view;
import ss8_cleanCode_mvc.entity.Vehicles;
import java.util.ArrayList;
import java.util.Scanner;

public class VehiclesView {
    private static Scanner sc = new Scanner(System.in);
    public static void display(ArrayList<Vehicles> vehiclesArrayList){
        for(Vehicles vehicles: vehiclesArrayList){
            System.out.println(vehicles);
        }
    }
    public static Vehicles inputData(){
        System.out.println(" enter ID of Vehicles .");
        int id = Integer.parseInt(sc.nextLine());
        String model =sc.nextLine();
        Vehicles vehicles = new Vehicles(id, model);
        return vehicles;
    }
}
