public class App {
    public static void main(String[] args) throws Exception {
        HinhChuNhat hcn1 = new HinhChuNhat(5, 10);
        HinhChuNhat hcn2 = new HinhChuNhat(10.5f, 14.75f);
        HinhTron ht1 = new HinhTron(15);
        DanhSachHinh dsh = new DanhSachHinh();
        dsh.themHinh(ht1);
        dsh.themHinh(hcn1);
        dsh.themHinh(hcn2);
        dsh.inDanhSach();
        System.out.println("dien tich hinh tron 1 = " + ht1.dienTich());
    }
}
