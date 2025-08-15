package ss8_cleanCode_mvc.controller;

import ss8_cleanCode_mvc.entity.Cars;

import ss8_cleanCode_mvc.repository.CarsRepository;
import ss8_cleanCode_mvc.repository.ICarsRepository;
import ss8_cleanCode_mvc.service.CarsService;
import ss8_cleanCode_mvc.service.ICarsService;
import ss8_cleanCode_mvc.view.CarsView;

import java.util.ArrayList;
import java.util.Scanner;

public class CarsController {
    private ICarsService iCarsService = new CarsService();

    public void displayMenu() {

        Scanner sc = new Scanner(System.in);
        final int DISPLAYOPPTIONS = 1;
        final int ADDCARS = 2;
        final int SHOWVEHICLESINFORMATIONS = 3;
        final int REMOVECARS = 4;
        boolean flag = true;
        while (flag) {
            System.out.println("-<Global Vehicles Databases>- ");
            System.out.println("----> Functions table <----" +
                    "\n 1. Cars Databases" +
                    "\n 2. Add new Cars on Databases " +
                    "\n 3. Vehicles Specifications" +
                    "\n 4. Remove Vehicle out of Databases " +
                    "\n 5. Back Main Menu.");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case DISPLAYOPPTIONS:
                    System.out.println("--Hiện thị Danh sách phương tiện--");
                    ArrayList<Cars> carsArrayList = iCarsService.findAll();
                    CarsView.display(carsArrayList);
                    break;
                case ADDCARS:
                    System.out.println("-Thêm một Phương tiện mới-");
                    System.out.println("Đã thêm.");
                    break;
                case SHOWVEHICLESINFORMATIONS:
                    System.out.println("-xem thông số ky thuat-");
                    break;
                case REMOVECARS:
                    System.out.println("-Gỡ/ xóa phương tiện-");
                    System.out.println("--Đã xóa--");
                    break;
                default :
                    flag = false;
            }
        }
    }
}