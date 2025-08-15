package ss8_cleanCode_mvc.view;
import ss8_cleanCode_mvc.controller.CarsController;
import ss8_cleanCode_mvc.controller.TrucksController;
import ss8_cleanCode_mvc.controller.MotorbikesController;

import  java.util.Scanner;



public class RunApp {
    public static void main(String[] args){
        displayMain();
    }
    public static void  displayMain(){
        CarsController carsController = new CarsController();
        TrucksController trucksController = new TrucksController();
        Scanner sc = new Scanner(System.in);
        final int CARS = 1;
        final int TRUCKS = 2;
        final  int MOTORBIKES = 3;
        final  int EXITPROCESS = 4;
        boolean flag = true;
        while (flag){
            System.out.println(" Vehicles DuTys Managerent");
            System.out.println("---Enter a call---" +
                    "\n 1. Cars" +
                    "\n 2. Trucks" +
                    "\n 3. Motorbikes" +
                    "\n 4. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case  CARS:
                    System.out.println("Informations details CarsModels");
                    carsController.displayMenu();
                    break;
                case TRUCKS:
                    System.out.println(" Informations details TrucksModels");
                    trucksController.displayMenu();
                    break;
                case MOTORBIKES:
                    System.out.println(" Informations details MotorsModels");
                    MotorbikesController motorbikesController = new MotorbikesController();
                    motorbikesController.displayMenu();
                    break;
                case EXITPROCESS:
                    System.out.println("Exited");
                default:
                    flag = false;
            }
        }
    }
}

