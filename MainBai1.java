package lab5;
import java.util.ArrayList;
public class MainBai1 {
    public static void main(String[] args) {
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

        QuanLy quanLy = new QuanLy("QL001", "Nguyen Van A", "Dai hoc", "Quan tri", 2000000);
        quanLy.setLuongCoBan(5000000);
        quanLy.xuat();
        System.out.println("Luong: " + quanLy.tinhLuong());

        NghienCuu nghienCuu = new NghienCuu("NC001", "Tran Thi B", "Thac si", "Hoa hoc", 1500000);
        nghienCuu.setLuongCoBan(4500000);
        nghienCuu.xuat();
        System.out.println("Luong: " + nghienCuu.tinhLuong());

        PhucVu phucVu = new PhucVu("PV001", "Le Van C", "Trung cap");
        phucVu.setLuongCoBan(3000000);
        phucVu.xuat();
        System.out.println("Luong: " + phucVu.tinhLuong());

        danhSachNhanVien.add(quanLy);
        danhSachNhanVien.add(nghienCuu);
        danhSachNhanVien.add(phucVu);

        System.out.println("\nDanh sach tat ca nhan vien:");
        for (NhanVien nv : danhSachNhanVien) {
            nv.xuat();
            System.out.println("Luong: " + nv.tinhLuong());
        }
    }
}
