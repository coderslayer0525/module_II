package ss8_cleanCode_mvc.view;

import ss8_cleanCode_mvc.entity.Cars;

import java.util.ArrayList;
import java.util.Scanner;

public class CarsView {
    private static Scanner sc = new Scanner(System.in);
    public static void display(ArrayList<Cars> carsArrayList){
        for(Cars cars: carsArrayList){
            System.out.println(cars);
        }
    }
    public static Cars inputData(){
        System.out.println(" enter ID of Vehicles .");
        int id = Integer.parseInt(sc.nextLine());
        String model =sc.nextLine();
        Cars cars = new Cars(id, model);
        return cars;
    }
}
