package ss8_cleanCode_mvc.view;
import ss8_cleanCode_mvc.controller.VehiclesController;
import  java.util.Scanner;


public class RunApp {
    public static void main(String[] args){
        displayMain();
    }
    public static void  displayMain(){
        VehiclesController vehiclesController = new VehiclesController();
        Scanner sc = new Scanner(System.in);
        final int CARS = 1;
        final int TRUCKS = 2;
        final  int MOTORBIKES = 3;
        final  int EXITPROCESS = 4;
        boolean flag = true;
        while (flag){
            System.out.println(" chose a  kind of vehicles");
            System.out.println("---Model---" +
                    "\n 1. Cars" +
                    "\n 2. Trucks" +
                    "\n 3. Motorbikes" +
                    "\n 4. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case  CARS:
                    System.out.println("Informations details CarsModels");
                    vehiclesController.displayMenu();
                    break;
                case TRUCKS:
                    System.out.println(" Informations details TrucksModels");
                    vehiclesController.displayMenu();
                    break;
                case MOTORBIKES:
                    System.out.println(" Informations details MotorsModels");
                    vehiclesController.displayMenu();
                    break;
                case EXITPROCESS:
                    System.out.println("Exited");
                default:
                    flag = false;
            }
        }
    }
}

