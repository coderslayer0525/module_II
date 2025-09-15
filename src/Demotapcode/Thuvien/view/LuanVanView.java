package Demotapcode.Thuvien.view;

import Demotapcode.Thuvien.entity.LuanVan;

import java.util.ArrayList;
import java.util.Scanner;

public class LuanVanView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(ArrayList<LuanVan> luanVanArrayList) {
        if (luanVanArrayList.isEmpty()) {
            System.out.println("Danh sach trong");
            return;
        }
        for (LuanVan luanVan : luanVanArrayList) {
            System.out.println(luanVan);
        }
    }

    public static LuanVan inputData() {
        try {
            System.out.println("Ma Tai Lieu");
            int maTaiLieu = Integer.parseInt(sc.nextLine());

            System.out.println("Nguoi huong Dan");
            String nguoiHuongDan = sc.nextLine();

            System.out.println("Ten Tai Lieu: ");
            String tenTaiLieu = sc.nextLine();

            System.out.println("Nam Xuat Ban: ");
            int namXuatBan = Integer.parseInt(sc.nextLine());

            System.out.println("Ten Tac Gia: ");
            String tenTacGia = sc.nextLine();

            return new LuanVan(maTaiLieu, tenTaiLieu, namXuatBan, tenTacGia, nguoiHuongDan, "Ngành học mặc định");
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
