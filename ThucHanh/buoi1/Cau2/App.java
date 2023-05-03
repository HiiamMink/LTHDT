public class App {
    public static void main(String[] args) throws Exception {
        SinhVien sv1 = new SinhVien("123", "Nguyen Van A");
        SinhVien sv2 = new SinhVien("543", "Le Thi B");
        SinhVien sv3 = new SinhVien("321", "Luong Van C");
        LopHocPhan lhp = new LopHocPhan("123465", "LT Huong doi tuong", "Nguyen Van A", "Thu 7, tiet 4-6, phong A1.1");
        LopHocPhan ds = new LopHocPhan();
        ds.themSV(sv1);
        ds.themSV(sv2);
        ds.themSV(sv3);
        System.out.println(lhp.toString());
        ds.xuatDS();
        System.out.println("Tong so sinh vien: " + ds.soLuong());
    }
}
