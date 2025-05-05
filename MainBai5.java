
package lab5;
import java.util.Scanner;

public class MainBai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap thong tin hoc vien:");
        HocVien hocVien = new HocVien();
        hocVien.nhap();

        System.out.println("Nhap thong tin nhan vien:");
        NhanVien5 nhanVien5 = new NhanVien5();
        nhanVien5.nhap();

        System.out.println("\nThong tin hoc vien:");
        hocVien.xuat();

        System.out.println("\nThong tin nhan vien:");
        nhanVien5.xuat();

        scanner.close();
    }
}

