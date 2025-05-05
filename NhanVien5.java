
package lab5;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class NhanVien5 extends ConNguoi {
    private double luong;
    private Date ngayNhanViec;
    private PhongKhoaBan phongKhoaBan;

    public NhanVien5() {
        super();
        this.luong = 0;
        this.ngayNhanViec = null;
        this.phongKhoaBan = null;
    }

    public NhanVien5(String hoTen, int namSinh, double luong, Date ngayNhanViec, PhongKhoaBan phongKhoaBan) {
        super(hoTen, namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.phongKhoaBan = phongKhoaBan;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public Date getNgayNhanViec() {
        return ngayNhanViec;
    }

    public void setNgayNhanViec(Date ngayNhanViec) {
        this.ngayNhanViec = ngayNhanViec;
    }

    public PhongKhoaBan getPhongKhoaBan() {
        return phongKhoaBan;
    }

    public void setPhongKhoaBan(PhongKhoaBan phongKhoaBan) {
        this.phongKhoaBan = phongKhoaBan;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap luong: ");
        this.luong = scanner.nextDouble();
        scanner.nextLine(); // Clear buffer

        System.out.print("Nhap ngay nhan viec (dd/MM/yyyy): ");
        String ngay = scanner.nextLine();
        try {
            this.ngayNhanViec = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
        } catch (ParseException e) {
            System.out.println("Ngay khong hop le!");
            this.ngayNhanViec = new Date(); // Default to today
        }

        this.phongKhoaBan = new PhongKhoaBan();
        phongKhoaBan.nhap();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Luong: " + luong);
        System.out.println("Ngay nhan viec: " + new SimpleDateFormat("dd/MM/yyyy").format(ngayNhanViec));
        phongKhoaBan.xuat();
    }
}

