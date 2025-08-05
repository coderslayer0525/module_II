package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("nhap  chiều cao :");
        String height = sc.nextLine();
        System.out.println("chiều cao  :" + height);


        Scanner dc = new Scanner(System.in);
        System.out.println("nhập cân năg");
        String map = dc.nextLine();
        System.out.println("cân nang : " + map);


        double h = Double.parseDouble(height);
        double c = Double.parseDouble(map);
        double body = h + c;
        System.out.println(" BMI " + body);

        Scanner scanner = new Scanner(System.in);
        int somay;
        somay = scanner.nextInt();
        if (somay < 0) {
            System.out.println(" éo thích đọc");
        } else if (somay > 0 && somay < 10) {
            switch (somay) {
                case 1:
                    somay = 1;
                    System.out.print("môt");
                    break;
                case 2:
                    somay = 2;
                    System.out.print("hai");
                    break;
                case 3:
                    somay = 3;
                    System.out.print("ba");
                    break;
                case 4:
                    somay = 4;
                    System.out.print("bốn");
                    break;
                case 5:
                    somay = 5;
                    System.out.print("năm");
                    break;
                case 6:
                    somay = 6;
                    System.out.print("sáu");
                    break;
                case 7:
                    somay = 7;
                    System.out.print("bảy");
                    break;
                case 8:
                    somay = 8;
                    System.out.print("tam");
                    break;
                case 9:
                    somay = 9;
                    System.out.print("chín");
            }
        }
        System.out.println(" số " + somay);
        if(somay >= 10 && somay < 20){
          switch (somay) {
              case 11:
                  somay = 11;
                  System.out.println("eleven");
                  break;
              case 12:
                  somay = 12;
                  System.out.println("twelve");
              case 13:
                  somay = 13;
                  System.out.println("thirteen");
              case 14:
                  somay = 14;
                  System.out.println("fourteen");
              case 15:
                  somay = 15;
                  System.out.println("fifteen");
              case 16:
                  somay = 16;
                  System.out.println("sixteen");
              case 17:
                  somay = 17;
                  System.out.println("seventeen");
              case 18:
                  somay = 18;
                  System.out.println("eighteen");
              case 19:
                  somay = 19;
                  System.out.println("nineteen");
            }
        }
        if(somay >= 100 && somay < 1000){
            switch (somay++) {
                case 100:
                    somay = 100;
                    System.out.println("one hundred");
                    break;
                case 101:
                    somay = 101;
                    System.out.println("one hundred one");
                    break;
                case 102:
                    somay = 102;
                    System.out.println("one hundred two");
                    break;
                case 300:
                    somay = 300;
                    System.out.println("three hundred");
                    break;
                case 461:
                    somay = 461;
                    System.out.println("four hundred sixty one");
                    break;
                case 999:
                    somay = 999;
                    System.out.println("nai nai nai");
            }
        }
        System.out.println(somay);
    }
}