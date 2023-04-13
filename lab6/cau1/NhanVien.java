public class NhanVien {
    private String ten;
    private long luong;

    public NhanVien() {

    }

    public NhanVien(String ten) {
        this.ten = ten;
    }

    public String loaiNhanVien() {
        return "Nhan Vien";
    }

    public void tinhLuong() {

    }

    public void xuatThongTin() {
        System.out.println("ten: " + ten + ", luong: " + luong);
    }
}