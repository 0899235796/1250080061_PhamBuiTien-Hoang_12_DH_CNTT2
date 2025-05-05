package lab5;
class PhucVu extends NhanVien {
    public PhucVu() {
        super();
    }

    public PhucVu(String maNhanVien, String tenNhanVien, String trinhDo) {
        super(maNhanVien, tenNhanVien, trinhDo);
    }

    @Override
    public void nhap() {
        super.nhap();
    }

    @Override
    public void xuat() {
        super.xuat();
    }

    @Override
    public double tinhLuong() {
        return luongCoBan;
    }
}

