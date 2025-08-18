package ss8_cleanCode_mvc.controller;

import ss8_cleanCode_mvc.entity.Motorbikes;
import ss8_cleanCode_mvc.repository.IMotorbikesRepository;
import ss8_cleanCode_mvc.service.IMotorbikesService;
import ss8_cleanCode_mvc.service.MotorbikesService;
import ss8_cleanCode_mvc.view.MotorbikesView;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikesController {
    private IMotorbikesService iMotorbikesService = new MotorbikesService();
    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        final int MOTORMAJOR = 1;
        final int ADDNEWOBJECT = 2;
        final int SPECIFICATIONSOBJECT = 3;
        final int DELOBJECT = 4;
        boolean flag = true;
        while (flag){
            System.out.println("---->Call of Duty<--- " +
                    "\n 1. Motors majors" +
                    "\n 2. Add new Motor" +
                    "\n 3. factory Specificatons" +
                    "\n 4. Remove motor" +
                    "\n 5. Back to menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case MOTORMAJOR :
                    System.out.println("Display Motors datalist");
                    ArrayList<Motorbikes> motorbikesArrayList = iMotorbikesService.findAll();
                    MotorbikesView.display(motorbikesArrayList);
                    break;
                case ADDNEWOBJECT:
                    System.out.println("Add new motorbike");
                        System.out.println("added");
                case SPECIFICATIONSOBJECT:
                    System.out.println("Specifications");
                    break;
                case DELOBJECT:
                    System.out.println("Remove motor");
                    System.out.println("Done");
                    break;
                default:
                    flag = false;
            }
        }
    }
}
