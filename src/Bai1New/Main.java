package Bai1New;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<CanBo> ls = new ArrayList<>();
    static CanBo canBo;

    public static void main(String[] args) {
        while (true)
            menu();
    }

    private static void menu() {
        System.out.println("Chương trình quản lý cán bộ");
        System.out.println("1.Thêm cán bộ");
        System.out.println("2.Tìm kiếm theo họ tên");
        System.out.println("3.Hiện thị danh sách cán bộ");
        System.out.println("4.Thoát");
        int nhap = sc.nextInt();
        switch (nhap) {
            case 1:
                System.out.println("1.Thêm mới Cán bộ");
                System.out.println("Mời bạn chọn chức năng : ");
                System.out.println("1. Thêm Công nhân : ");
                System.out.println("2. Thêm Kỹ Sư : ");
                System.out.println("3.Thêm Nhân Viên : ");

                switch (nhap){

                    case 1:
                        sc.nextLine();
                        addCN();
                        break;
                    case 2:
                        sc.nextLine();
                        addKS();
                        break;
                    case 3:
                        sc.nextLine();
                        addNV();
                        break;
                    default:
                        System.out.println("Chức năng chọn kh tồn tại");
                        break;
                }
                break;

            case 2:
                findCB();
                break;
            case 3:
                listCanBo();
                break;
            case 4:
                System.out.println("Cút");
                System.exit(0);
        }
    }

    private static void listCanBo() {
        if (ls.isEmpty()){
            System.out.println("Dsach đang null");
            return;
        }

        for(CanBo cb : ls){
            cb.showInfo();
        }
    }


    static void findCB() {
        sc.nextLine();
        System.out.println("Nhập ten can bo can tim");
        String nhap = sc.nextLine();
        if (ls.isEmpty()){
            System.out.println("Dsach đang null");
            return;
        }
        for (CanBo x : ls) {
            //neu nguoi dung nhap vao trung voi maSV thi in ra kqua
            if (nhap.equalsIgnoreCase(x.getHoTen())){
                System.out.println("Da tim can bo co ten : "+nhap);
                x.showInfo();
                return;
            }
        }
        System.out.println("Khong tim thay : "+nhap);
    }

    private static void addNV() {
        sc.nextLine();
        System.out.println("Mời bạn nhập họ tên : ");
        String name = sc.nextLine();

        System.out.println("Tuổi : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Gioi tính : ");
        String gender = sc.nextLine();

        System.out.println("Địa chỉ : ");
        String diaChi = sc.nextLine();
        System.out.println("Mời bạn nhập công việc");
        String congViec = sc.nextLine();

        canBo = new NhanVien(name,age,gender,diaChi,congViec);
        ls.add(canBo);
    }

    private static void addKS() {
        sc.nextLine();
        sc.nextLine();
        System.out.println("Mời bạn nhập họ tên : ");
        String name = sc.nextLine();

        System.out.println("Tuổi : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Gioi tính : ");
        String gender = sc.nextLine();

        System.out.println("Địa chỉ : ");
        String diaChi = sc.nextLine();
        System.out.println("Mời bạn nhập ngành đào tạo");
        String nganhDaoTao = sc.nextLine();
        canBo = new KySu(name,age,gender,diaChi,nganhDaoTao);
        ls.add(canBo);
    }

    private static void addCN() {
        sc.nextLine();
        System.out.println("Mời bạn nhập họ tên : ");
        String name = sc.nextLine();

        System.out.println("Tuổi : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Gioi tính : ");
        String gender = sc.nextLine();

        System.out.println("Địa chỉ : ");
        String diaChi = sc.nextLine();
        System.out.println("Mời bạn nhập bậc");
        int bac = sc.nextInt();
        if (bac < 1 || bac > 10 ){
            System.out.println("Bạn đã nhập sai");
            return;
        }
        canBo = new CongNhan(name,age,gender,diaChi,bac);
        ls.add(canBo);

    }
}
