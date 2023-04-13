public class App {
    public static void main(String[] args) throws Exception {
        HocSinh hs1 = new HocSinh("Cao Duc Minh", "CNTT2", 8.5, 7.0, 3.25);
        System.out.println("dtb: " + hs1.diemTrungBinh());
        HocSinhChuyenToan hst = new HocSinhChuyenToan("Cao Duc Minh", "CNTT2", 7.0, 6.5, 6.25);
        hst.diemTrungBinh();
        System.out.println("dtb hs chuyen toan: " + hst.diemTrungBinh());
    }
}
