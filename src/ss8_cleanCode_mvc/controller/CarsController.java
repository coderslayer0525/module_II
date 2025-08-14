package ss8_cleanCode_mvc.controller;
import ss8_cleanCode_mvc.entity.Cars;
import ss8_cleanCode_mvc.entity.Vehicles;

import ss8_cleanCode_mvc.service.CarsService;
import ss8_cleanCode_mvc.service.ICarsService;
import ss8_cleanCode_mvc.service.IVehiclesService;
import ss8_cleanCode_mvc.view.CarsView;
import ss8_cleanCode_mvc.view.VehiclesView;
import ss8_cleanCode_mvc.service.VehiclesService;

import java.util.ArrayList;
import java.util.Scanner;

public class CarsController {
    private ICarsService carsService = new CarsService();

    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        final  int DETAILSOFCAR = 1;
        final int ADDNEWCARS = 2;
        final int CARSINFORMATIONS = 3;
        final int REMOVE = 4;
        boolean flag = true;
        while (flag){
            System.out.println("--DUTYS LIST--");
            System.out.println(">-Select-<" +
                    "\n 1. Cars Databases" +
                    "\n 2. Add a new car" +
                    "\n 3. Cars specifications" +
                    "\n 4. Remove cars out of Databases" +
                    "\n 5.Back Main Menu.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case DETAILSOFCAR :
                    System.out.println("danh sach xe oto tren he thong");
                    ArrayList<Cars> carsArrayList = carsService.findAll();
                    CarsView.display(carsArrayList);
                    break;
                case ADDNEWCARS:
                    System.out.println("them kieu xe vao he thong");
                    System.out.println(" da them thanh cong");
                    break;
                case CARSINFORMATIONS:
                    System.out.println("thong tin cua xe");
                    break;
                case REMOVE:
                    System.out.println(" xoa xe khoi he thong");
                    System.out.println(" -da xoa-");
                    break;
                default:
                    flag = false;
            }
        }

    }
}
