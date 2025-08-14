package ss8_cleanCode_mvc.controller;

import ss8_cleanCode_mvc.entity.Vehicles;

import ss8_cleanCode_mvc.service.IVehiclesService;
import ss8_cleanCode_mvc.view.VehiclesView;
import ss8_cleanCode_mvc.service.VehiclesService;

import java.util.ArrayList;
import java.util.Scanner;

public class VehiclesController {
    private IVehiclesService vehiclesService = new VehiclesService();

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
                    "\n 1. Vehicles Databases" +
                    "\n 2. Add new Vehicles on Databases " +
                    "\n 3. Vehicles Specifications" +
                    "\n 4. Remove Vehicle out of Databases " +
                    "\n 5. Back Main Menu.");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case DISPLAYOPPTIONS:
                    System.out.println("--Hiện thị Danh sách phương tiện--");
                    ArrayList<Vehicles> vehiclesArrayList = vehiclesService.findAll();
                    VehiclesView.display(vehiclesArrayList);
                    break;
                case ADDVEHICLES:
                    System.out.println("-Thêm một Phương tiện mới-");
                    System.out.println("Đã thêm.");
                    break;
                case SHOWVEHICLESINFORMATIONS:
                    System.out.println("-xem thông số ky thuat-");
                    break;
                case REMOVEVEHICLES:
                    System.out.println("-Gỡ/ xóa phương tiện-");
                    System.out.println("--Đã xóa--");
                    break;
                default :
                    flag = false;
            }
        }
    }
}