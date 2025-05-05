
package lab5;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong hinh: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Xoa bo dem

        Hinh[] ds = new Hinh[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap hinh thu " + (i + 1));
            System.out.println("1: Hinh vuong");
            System.out.println("2: Hinh chu nhat");
            System.out.println("3: Hinh tron");
            System.out.print("Chon loai hinh: ");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    ds[i] = new HinhVuong();
                    break;
                case 2:
                    ds[i] = new HinhChuNhat();
                    break;
                case 3:
                    ds[i] = new HinhTron();
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Mac dinh chon hinh vuong.");
                    ds[i] = new HinhVuong();
            }

            ds[i].nhap();
        }

        System.out.println("\nDanh sach cac hinh:");
        for (Hinh h : ds) {
            h.xuat();
        }

        Hinh max = ds[0];
        for (int i = 1; i < n; i++) {
            if (ds[i].dienTich() > max.dienTich()) {
                max = ds[i];
            }
        }

        System.out.println("\nHinh co dien tich lon nhat:");
        max.xuat();
    }
}

