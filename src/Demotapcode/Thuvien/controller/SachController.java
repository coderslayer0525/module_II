package Demotapcode.Thuvien.controller;

import Demotapcode.Thuvien.service.ISachService;
import Demotapcode.Thuvien.service.SachService;
import Demotapcode.Thuvien.view.SachView;
import Demotapcode.Thuvien.entity.Sach;

import java.util.ArrayList;
import java.util.Scanner;

public class SachController {
    private final ISachService sachService= new SachService();

    public void displayMenu(){
        Scanner sc = new Scanner(System.in);

        final int ADD_FILES = 1;
        final int DISPLAY_FILES = 2;
        final int DELETE_FILIES = 3;
        final int FIND_FILES = 4;
        final int BACK = 5;
        boolean flag = true;
        while (flag){
            System.out.println("Sach Manager");
            System.out.println("chon chuc nang " +
                    "\n 1. Them Sach moi." +
                    "\n 2. Hien thi thu vien sach" +
                    "\n 3. xoa Sach" +
                    "\n 4. Tim kiem Sach" +
                    "\n 5. Quay lai trang quan ly chinh");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case ADD_FILES :
                    System.out.println("them moi Sach");
                    Sach sach = SachView.inputData();
                    boolean yes = this.sachService.add(sach);
                    if (yes){
                        System.out.println("Da Them");
                    }else {
                        System.out.println("ERROR");
                    }
                    break;
                case DISPLAY_FILES:
                    System.out.println("Hien Thi Thu vien Sach");
                    ArrayList<Sach> sachArrayList = this.sachService.findAll();
                    SachView.display(sachArrayList);
                    break;
                case DELETE_FILIES:
                    System.out.println("xoa Sach");
                    Sach cs = SachView.inputData();
                    boolean isOk= this.sachService.delete(cs.getMaTaiLieu());
                    if (isOk){
                        System.out.println("xoa Thanh cong");
                    }else {
                        System.out.println("khong tim thay thong tin cua Sach");
                    }
                    break;
                case FIND_FILES:
                    System.out.println("tim Sex");
                    Sach scanner = SachView.inputData();
                    int MaTaiLieu = Integer.parseInt(scanner.nextline());
                    Sach found = sachService.findById(MaTaiLieu);
                    if (found != null){
                        System.out.println("Tim thay "+found);
                    }else {
                        System.out.println("khong tim thay sach");
                    }
                    break;
                case BACK:
                    flag = false;
                    break;
                default:
                    System.out.println("lua chon khong hop le");
            }
        }
    }
}
