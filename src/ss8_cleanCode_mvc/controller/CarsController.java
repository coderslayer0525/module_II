package ss8_cleanCode_mvc.controller;

import ss12_product.repository.IProductRepository;
import ss8_cleanCode_mvc.entity.Cars;
import ss8_cleanCode_mvc.service.CarsService;
import ss8_cleanCode_mvc.repository.CarsRepository;
import ss8_cleanCode_mvc.repository.ICarsRepository;
import ss8_cleanCode_mvc.service.CarsService;
import ss8_cleanCode_mvc.service.ICarsService;
import ss8_cleanCode_mvc.view.CarsView;

import java.util.List;
import java.util.Scanner;

public class CarsController {
    private final ICarsService carsService = new CarsService();


    public void displayMenu() {

        Scanner sc = new Scanner(System.in);
        final int DISPLAYOPPTIONS = 1;
        final int ADDCARS = 2;
        final int REMOVECARS = 3;
        boolean flag = true;
        while (flag) {
            System.out.println("-<LỚP XE OTO (4-7 GHẾ)>- ");
            System.out.println("CHọn chức năng :" +
                    "\n 1. Danh sach xe đang trong bãi:" +
                    "\n 2. Thêm xe vào bãi : " +
                    "\n 3. Xuất xe khỏi bãi : " +
                    "\n 4. Quay lại bản quản ly chính. ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case DISPLAYOPPTIONS:
                    System.out.println("Danh sách xe đang bị thu giữ :");
                    List<Cars> carsList = this.carsService.findAll();
                    CarsView.display(carsList);
                    break;
                case ADDCARS:
                    System.out.println("Thêm xe vào bãi.");
                    Cars cars = CarsView.inputData();
                    boolean isSucess = this.carsService.add(cars);
                    if (isSucess) {
                        System.out.println("Đã thêm.");
                        break;
                    }else {
                        System.out.println("ERROR");
                    }
                    break;
                case REMOVECARS:
                    System.out.println("-Xuất xe ra bãi.");
                    Cars cs = CarsView.inputData();
                    boolean isOk = this.carsService.delete(cs.getId());
                    if (isOk){
                        System.out.println(" Xoa thanh cong ");
                }else {
                        System.out.println(" khong the tim thay thong tin cua xe");
                    }

                break;
                default:
                    flag = false;
            }
        }
    }
}