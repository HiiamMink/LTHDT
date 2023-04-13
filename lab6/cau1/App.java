public class App {
    public static void main(String[] args) throws Exception {
        NhanVien nhanvien = new NhanVien("Cao Duc Minh");
        NhanVienFullTime nvft = new NhanVienFullTime("Nguyen Van A", 1, 2);
        nvft.xuatThongTin();
        nhanvien = new NhanVienPartTime("Tran Thi B", 50);
        nhanvien = new NhanVienFullTime("Son Tung", 3, 4);
        nhanvien.xuatThongTin();
    }
}
