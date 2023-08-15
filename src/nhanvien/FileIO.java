package nhanvien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIO {
    private final static String FILE_URL = "product.txt";
    public void ghiFile(String data) {//ghi một dòng mới
        try{
            File file = new File(FILE_URL);
            OutputStream outputStream = new FileOutputStream(file,true);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            outputStreamWriter.write(data);
            outputStreamWriter.write("\n");
            outputStreamWriter.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void update(ArrayList<NhanVien> arrayList){//ghi mảng đã cập nhật
        try{
            File file = new File(FILE_URL);
            OutputStream outputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            for(NhanVien nv:arrayList){
            outputStreamWriter.write(nv.toString());
            outputStreamWriter.write("\n");
            outputStreamWriter.flush();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<NhanVien> docFile() {//Đọc file->array
        ArrayList<NhanVien> list = new ArrayList<>();
        List<String> myList = new ArrayList<String>();
        BufferedReader in = null;
//
        try {
            in = new BufferedReader(new FileReader(FILE_URL));
            String str;
            while ((str = in.readLine()) != null) {
                myList.add(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        for(String str:myList){
            String[] arr= str.split(",");
//                for (String s:arr){
//                    System.out.println(s);
//                }
                NhanVien nhanVien=new NhanVien(arr[0].toString(),arr[1].toString(),arr[2].toString(),arr[3].toString(),arr[4].toString(),Integer.parseInt(arr[5].toString().trim()),arr[6].toString());
                list.add(nhanVien);
//                for (NhanVien nv:list){
//                    nv.xuatNV();
//                }
        }
        return list;

    }
//    public static void main(String[] args)  {
//        FileIO file=new FileIO();
//        System.out.println("-----------");
//       ArrayList<NhanVien> arr= file.Output();
//       for(NhanVien nv:arr){
//           nv.xuatNV();
//       }
//        System.out.println("---------------------------");
//       NhanVien nhanVien=new NhanVien();
//       nhanVien.nhapNV();
//       arr.add(nhanVien);
//       arr.remove(0);
//       file.update(arr);
//
//    }
}
