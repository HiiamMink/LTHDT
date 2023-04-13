public class NhanVienFullTime extends NhanVien {
    private int loaiChucVu;
    private int ngayLamThem;

    public NhanVienFullTime(String ten, int loaiChucVu, int ngayLamThem) {
        super(ten);
        this.loaiChucVu = loaiChucVu;
        this.ngayLamThem = ngayLamThem;
    }

    @Override
    public String loaiNhanVien() {
        return "nhan vien full time";
    }

    @Override
    public void tinhLuong() {

    }

}
