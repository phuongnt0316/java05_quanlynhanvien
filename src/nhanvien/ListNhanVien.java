package nhanvien;

import java.util.ArrayList;

public class ListNhanVien {
    ArrayList<NhanVien> arrNhanVien=new FileIO().docFile();

    public void themNV(){
        NhanVien nv=new NhanVien();
        nv.nhapNV();
        arrNhanVien.add(nv);
    }
    public void xuatNV(){
        for(NhanVien nv:arrNhanVien){
            nv.xuatNV();
        }
    }
    public void suaNV(String id){
        for(NhanVien nv:arrNhanVien){
            if(nv.getID().equals(id)){
                nv.capNhapNV(id);
            }
        }
    }
    public void timKiemNV(String key){
        boolean flag=false;
        for(NhanVien nv:arrNhanVien){
            if(nv.getSDT().equals(key)||nv.getEmail().equals(key)||nv.getID().equals(key)){
                System.out.println("Kết quả:");
                nv.xuatNV();
                flag=true;
            }
        }
        if (!flag){
            System.out.println("Không tìm thấy!");
        }
    }
    public void xoaNV(String id){ //Xoa nhan vien theo ID
//        for (int i=0;i<arrNhanVien.size();i++){
//            if(arrNhanVien.get(i).getID().equals(id)){
//                arrNhanVien.remove(arrNhanVien.get(i));
//                i--;
//            }
//        }
        arrNhanVien.removeIf((NhanVien nv)->nv.getID().equals(id));
    }
    public void capNhat(){
    FileIO file=new FileIO();
    file.update(arrNhanVien);

    }

}
