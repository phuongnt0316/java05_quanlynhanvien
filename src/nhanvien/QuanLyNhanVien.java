package nhanvien;

import java.util.Scanner;

public class QuanLyNhanVien {
    public static int showMenu() {
        boolean flag = true;
        do {
            System.out.println("---------MENU----------");
            System.out.println("1- Xem danh sách nhân viên");
            System.out.println("2- Thêm mới 1 nhân viên");
            System.out.println("3- Xóa 1 nhân viên truyền vào mã nhân viên");
            System.out.println("4- Chỉnh sửa 1 nhân viên truyền vào mã nhân viên");
            System.out.println("5- Tìm kiếm nhân viên dựa vào mã nhân viên/email/sdt");
            System.out.println("6- Thoát");
            try {
                Scanner sc = new Scanner(System.in);
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập số:");
            }
        } while (flag);
        return 0;
    }


    public static void main(String[] args) {
        ListNhanVien list=new ListNhanVien();
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        do {
            int n=showMenu();
            switch (n) {
                case 1:
                    list.xuatNV();
                    break;
                case 2:
                    list.themNV();
                    list.capNhatDuLieu();
                    break;
                case 3:
                    System.out.println("Nhập ID nhân viên cần xóa:");
                    list.xoaNV(sc.nextLine());
                    list.capNhatDuLieu();
                    break;
                case 4:
                    System.out.println("Nhập ID nhân viên cần sửa:");
                    list.suaNV(sc.nextLine());
                    list.capNhatDuLieu();
                    break;
                case 5:
                    System.out.println("Nhập ID/Email/SDT của nhân viên:");
                    list.timKiemNV(sc.nextLine());
                    break;
                case 6:
                    flag=false;
                    break;
                default:
                    System.out.println("Nhập chức năng 1->6!");
            }
        }while (flag);

    }
}
