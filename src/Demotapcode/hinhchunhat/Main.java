package Demotapcode.hinhchunhat;

import ss4_oop.bai_tap_stopWatch.StopWatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the width");
        double width = sc.nextDouble();
        System.out.print("enter the height");
        double height = sc.nextDouble();
        HinhChuNhat hinhChuNhat = new HinhChuNhat(width, height);
        System.out.println("hinhcn\n" + hinhChuNhat.display());
        System.out.println("Perimeter of HinhCn : "+ hinhChuNhat.getPerimeter());
        System.out.println(" "+ hinhChuNhat.getArea());
    }
}
