package ss8_cleanCode_mvc.view;

import ss8_cleanCode_mvc.entity.Trucks;

import java.util.ArrayList;
import java.util.Scanner;


public class TrucksView {
    private  static Scanner sc = new Scanner(System.in);
    public static void  display(ArrayList<Trucks> trucksArrayList){
        for (Trucks trucks : trucksArrayList){
            System.out.println(trucks);
        }
    }
    public static Trucks inputData(){
        System.out.println(" --------");
        int id = Integer.parseInt(sc.nextLine());
        int power = Integer.parseInt(sc.nextLine());
        String model = sc.nextLine();
        Trucks trucks = new Trucks(id,power,model);
        return trucks;
    }
}
