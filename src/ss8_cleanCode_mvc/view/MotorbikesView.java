package ss8_cleanCode_mvc.view;

import ss8_cleanCode_mvc.entity.Motorbikes;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikesView {
    private static Scanner moto = new Scanner(System.in);
    public static void display(ArrayList<Motorbikes> motorbikesArrayList){
        for(Motorbikes motorbikes : motorbikesArrayList){
            System.out.println(moto);
        }
    }
    public static Motorbikes inputData(){
        System.out.println("Enter Id of Motor");
        int id = Integer.parseInt(moto.nextLine());
        String model = moto.nextLine();
        int speed = Integer.parseInt(moto.nextLine());
        Motorbikes motorbikes = new Motorbikes(id,model,speed);
                return motorbikes;
    }
}
