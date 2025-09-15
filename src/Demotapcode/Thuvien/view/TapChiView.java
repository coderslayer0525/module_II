package Demotapcode.Thuvien.view;

import Demotapcode.Thuvien.entity.TapChi;

import java.util.ArrayList;
import java.util.Scanner;

public class TapChiView {
    private static Scanner scanner = new Scanner(System.in);


    public static void display(ArrayList<TapChi> tapChiArrayList){
        if (tapChiArrayList.isEmpty()){
            System.out.println("Danh sach Trong");
            return;
        }
        for (TapChi tapChi : tapChiArrayList){
            System.out.println(tapChi);
        }
    }
    public static TapChi inputData(){
        try{
            System.out.println("Ma Tai Lieu");
            int maTaiLieu = Integer.parseInt(scanner.nextLine());

            System.out.println("So Phat Hanh");
            int soPhatHanh = Integer.parseInt(scanner.nextLine());

            System.out.println("Thang phat Hanh");
            int thangPhatHanh = Integer.parseInt(scanner.nextLine());

            System.out.println(" Ten Tac Gia");
            String tenTacGia = scanner.nextLine();

            System.out.println("Nam Xuat Ban");
            int namXuatban = Integer.parseInt(scanner.nextLine());

            return new TapChi(maTaiLieu,tenTacGia,soPhatHanh,thangPhatHanh,namXuatban);
        }catch (NumberFormatException e){
            return null;
        }
    }
}
