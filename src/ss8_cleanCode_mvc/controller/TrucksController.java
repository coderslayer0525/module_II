/*
package ss8_cleanCode_mvc.controller;

import ss8_cleanCode_mvc.service.TrucksService;
import ss8_cleanCode_mvc.service.ITrucksService;
import ss8_cleanCode_mvc.view.CarsView;

import java.util.ArrayList;
import java.util.Scanner;

public class TrucksController {
    private ITrucksService trucksService = new TrucksService();
    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        final int MODELCARS = 1;
        final int SEARCHOWNER = 2;
        final int SEARCHNUMBERPLATE = 3;
        final  int BACKMENU = 4;
        boolean flag = true;
        while (flag){
            System.out.println("-- Kiêm tra tình trạng và vị trí --  ");
            System.out.println(" -- Nhập thông tin --" +
                    "\n 1. Nhập Model xe" +
                    "\n 2. Nhập tên chủ sở hữu" +
                    "\n 3. Nhâập biển số xe" +
                    "\n 4. Quay lại sảnh chính ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("-xem tình trang xe và vị trí GPRS hiện tại-");
                    ArrayList<Trucks> TrucksList = this.trucksService.findAll();
                    CarsView.display(trucksList);
                    break;
                case 2:
                    System.out.println("Tim kiem  ten chu so huu ");
                    break;
                case 3:
                    System.out.println("-tim kiem bien so xe-");
                    break;
                case 4:
                    System.out.println(" quay lai sanh chinh");
                    break;
                default:
                    flag = false;
            }
        }
    }
}*/
