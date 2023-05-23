public class App {
    public static void main(String[] args) throws Exception {
        DanhSach ds = new DanhSach();
        DiemHocVien hv1 = new DiemHocVien("minh", 7, 5, 8, 9, 7.5, 2003);
        DiemHocVien hv2 = new DiemHocVien("trung", 7, 8, 7.5, 5, 6, 2003);
        DiemHocVien hv3 = new DiemHocVien("canh", 4.5, 5, 2.3, 9, 8, 2001);
        DiemHocVien hv4 = new DiemHocVien("khanh", 8, 8.5, 9, 3, 7.5, 2003);
        ds.them(hv1);
        ds.them(hv2);
        ds.them(hv3);
        ds.them(hv4);
        System.out.println("diem trung binh cua hv1: " + hv1.diemTB());
        System.out.println("diem trung binh cua hv2: " + hv2.diemTB());
        System.out.println("diem trung binh cua hv3: " + hv3.diemTB());
        System.out.println("diem trung binh cua hv4: " + hv4.diemTB());
        System.out.println(" ");
        System.out.println("test ham if");
        hv1.danhGia();
        hv2.danhGia();
        hv3.danhGia();
        hv4.danhGia();
        System.out.println(" ");
        ds.demSoLuong();
    }
}
