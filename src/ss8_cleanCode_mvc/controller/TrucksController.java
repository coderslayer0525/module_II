package ss8_cleanCode_mvc.controller;

import ss8_cleanCode_mvc.entity.Cars;
import  ss8_cleanCode_mvc.entity.Trucks;
import ss8_cleanCode_mvc.service.CarsService;
import ss8_cleanCode_mvc.service.ICarsService;
import ss8_cleanCode_mvc.service.ITrucksService;
import ss8_cleanCode_mvc.service.TrucksService;
import ss8_cleanCode_mvc.view.CarsView;
import ss8_cleanCode_mvc.view.TrucksView;

import java.util.ArrayList;
import java.util.Scanner;


public class TrucksController {
    private ITrucksService iTrucksService = new TrucksService();

    public void displayMenu() {

        Scanner sc = new Scanner(System.in);
        final int DISPLAYOPPTIONS = 1;
        final int ADDVEHICLES = 2;
        final int SHOWVEHICLESINFORMATIONS = 3;
        final int REMOVEVEHICLES = 4;
        boolean flag = true;
        while (flag) {
            System.out.println("-<Global Vehicles Databases>- ");
            System.out.println("----> Functions table <----" +
                    "\n 1. Trucks Databases" +
                    "\n 2. Add new Trucks on Databases " +
                    "\n 3.  Specifications" +
                    "\n 4. Remove Trucks out of Databases " +
                    "\n 5. Back Main Menu.");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case DISPLAYOPPTIONS:
                    System.out.println("--Display trucks data list--");
                    ArrayList<Trucks> trucksArrayList = iTrucksService.findAll();
                    TrucksView.display(trucksArrayList);
                    break;
                case ADDVEHICLES:
                    System.out.println("-add new trucks-");
                    System.out.println("access.");
                    break;
                case SHOWVEHICLESINFORMATIONS:
                    System.out.println("-interview trucks-");
                    break;
                case REMOVEVEHICLES:
                    System.out.println("-remove / delete out of data list-");
                    System.out.println("--done--");
                    break;
                default :
                    flag = false;
            }
        }
    }
}
