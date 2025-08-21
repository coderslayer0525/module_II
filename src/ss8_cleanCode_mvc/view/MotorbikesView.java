package ss8_cleanCode_mvc.view;

import ss8_cleanCode_mvc.entity.Motorbikes;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikesView {
    private static Scanner scanner = new Scanner(System.in);
    public static void display(ArrayList<Motorbikes> motorbikesArrayList){
        for(Motorbikes motorbikes : motorbikesArrayList){
            System.out.println(scanner);
        }
    }
    public static Motorbikes inputData(){
        System.out.println("Enter Id of Motor");
        int id = Integer.parseInt(scanner.nextLine());
        String model =scanner.nextLine();
        int speed = Integer.parseInt(scanner.nextLine());
        Motorbikes motorbikes = new Motorbikes(id,model,speed);
                return motorbikes;
    }
}
