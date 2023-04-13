public class App {
    public static void main(String[] args) throws Exception {
        XeNgoaiThanh xout= new XeNgoaiThanh("A1", "Cao Duc Minh", "51-A7 8769", "Thanh Hoa",15);
        XeNoiThanh xin1 = new XeNoiThanh("A1", "Nguyen Minh Thuan", "51-B7 8562", "A45", 150);
        XeNoiThanh xin2 = new XeNoiThanh("A2", "Pham The Anh", "51-C8 8972", "A45", 200);
        DanhSachChuyenXe dscx = new DanhSachChuyenXe();
        dscx.themCX(xout);
        dscx.themCX(xin1);
        dscx.themCX(xin2);
        dscx.inDSCX();

    }
}
