package tieccuoi;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
////    public int selection;
////    final Scanner s = new Scanner(System.in);
////
////    public void quanLiSanh() throws FileNotFoundException {
////        System.out.println("===QUẢN LÝ SẢNH CƯỚI===");
////        System.out.println("1. Tra cứu sảnh");
////        System.out.println("2. Thêm sảnh mới");
////        System.out.println("3. Xóa sảnh");
////        System.out.println("4. Cập nhật danh sách sảnh");
////        System.out.printf("Bạn chọn: ");
////        selection = s.nextInt();
////
////        switch (selection){
////            case 1:
////                QuanLySanhCuoi qlS = new QuanLySanhCuoi();
////                qlS.docDsSanh();
////                qlS.timKiem();
////        }
////    }
//
//    public static void main(String[] args) throws FileNotFoundException {
////        Main main = new Main();
////        main.quanLiSanh();
//        List<ThucPham> thucPhams = new ArrayList<>();
//        QuanLyThucPham quanLyThucPham = new QuanLyThucPham();
//        quanLyThucPham.docDsThucAn();
//        quanLyThucPham.docDsThucUong();
//        thucPhams = quanLyThucPham.timKiem("Mỳ ý");
////        quanLyThucPham.xuatThucPham(thucPhams);
//        quanLyThucPham.xuatThucPham(quanLyThucPham.getDs());
//    }
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        BuaTiec bt = new BuaTiec();
        QuanLySanhCuoi dssc = new QuanLySanhCuoi();

        bt.nhapNgayThue();
        bt.xuatNgayThue();
    }

}