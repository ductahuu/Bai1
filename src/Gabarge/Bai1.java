package Gabarge;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {

    public static void showListCB(ArrayList<CanBo> listCB){
        if (listCB.size() == 0){
            System.out.println("Không có dữ liệu");
        }else {
            for (CanBo canBo : listCB){
                System.out.println(canBo);
            }
        }
    }

    public static void menu() {
        do {
            Scanner scanner = new Scanner(System.in);
            ListCB list = new ListCB();
            System.out.println("1.Thêm mới cán bộ");
            System.out.println("\n2.Tìm kiếm theo họ tên");
            System.out.println("\n3.Hiển thị thông tin về danh sách các cán bộ");
            System.out.println("\n4.Thoát khỏi chương trình");
            System.out.println("\nMời bạn nhập số : ");
            int nhap = scanner.nextInt();
            switch (nhap) {
                case 1:
                    scanner.nextLine();
                    System.out.println("1.Thêm mới cán bộ");
                    System.out.println("Nhập tên : ");
                    String hoTen = scanner.nextLine();
                    System.out.println("Nhap tuổi : ");
                    int tuoi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập giới tính : ");
                    String gioiTinh = scanner.nextLine();
                    System.out.println("Nhập địa chỉ : ");
                    String diaChi = scanner.nextLine();

                    CanBo canBo = new CanBo(hoTen, tuoi, gioiTinh, diaChi);
                    Utils.listCB.add(canBo);
                    if(canBo.getGioiTinh()=="nam" || canBo.getGioiTinh()=="nu" ||canBo.getGioiTinh()=="khac"){

                    }
                    System.out.println("Thoong tin can bo : "+canBo.toString());
                    break;
                case 2 :

                    System.out.println("Tim kiem theo ho ten can bo");
                    System.out.println("Moi nhap ten can bo can tim : ");
                    String ten = scanner.nextLine();
                    int i = list.find(ten);
                    if (i<0){
                        System.out.println("Khong tim thay");
                    }else {
                        System.out.println("Da tim thay"+list.toString());
                    }
                    break;
                case 3 :
                    showListCB(Utils.listCB);
                    break;
                case 4:
                    System.out.println("Thoat");
                    return;


            }
        }while (true);
    }





    public static void main(String[] args) {
        menu();
    }
}
