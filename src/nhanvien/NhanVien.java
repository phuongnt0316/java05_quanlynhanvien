package nhanvien;
import java.util.Scanner;

public class NhanVien {
    private String ID;
    private String hoTen;
    private String SDT;
    private String email;
    private String gioiTinh;
    private int namSinh;
    private String queQuan;

    public NhanVien() {

    }

    public NhanVien(String ID, String hoTen, String SDT, String email, String gioiTinh, int namSinh, String queQuan) {
        this.ID = ID;
        this.hoTen = hoTen;
        this.SDT = SDT;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public void nhapNV(){
        Scanner sc=new Scanner(System.in);
        System.out.print("ID: ");
        ID=sc.nextLine();
        System.out.print("Họ tên:");
        hoTen=sc.nextLine();
        System.out.print("Số điện thoại:");
        SDT=sc.nextLine();
        System.out.print("Email:");
        email=sc.nextLine();
        System.out.print("Giới tính:");
        gioiTinh=sc.nextLine();
        System.out.println("Năm sinh:");
        namSinh=Integer.parseInt(sc.nextLine());
        System.out.println("Quê quán:");
        queQuan=sc.nextLine();
    }
    public void capNhapNV(String ID){
        this.ID=ID;
        Scanner sc=new Scanner(System.in);
        System.out.print("Họ tên:");
        this.hoTen=sc.nextLine();
        System.out.print("Số điện thoại:");
        this.SDT=sc.nextLine();
        System.out.print("Email:");
        this.email=sc.nextLine();
        System.out.print("Giới tính:");
        this.gioiTinh=sc.nextLine();
        System.out.println("Năm sinh:");
        this.namSinh=Integer.parseInt(sc.nextLine());
        System.out.println("Quê quán:");
        this.queQuan=sc.nextLine();

    }
    public void xuatNV(){
        System.out.println("ID: "+ID);
        System.out.println("Họ tên: "+hoTen);
        System.out.println("SDT: "+SDT);
        System.out.println("Email: "+email);
        System.out.println("Giới tính: "+gioiTinh);
        System.out.println("Năm sinh: "+namSinh);
        System.out.println("Quê quán: "+queQuan);
    }

    @Override
    public String toString() {
        return ID+","+hoTen+","+SDT+","+email+","+gioiTinh+","+namSinh+","+queQuan;
    }
}
