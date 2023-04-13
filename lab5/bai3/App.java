public class App {
    public static void main(String[] args) throws Exception {
        GiaoDichTienTe gdtt = new GiaoDichTienTe("tt01", "20/12/2002", 10, 7, 24, "vietnam");
        GiaoDichVang gdv1 = new GiaoDichVang("v01", "11/2/2003", 7, 10, "4k");
        GiaoDichVang gdv2 = new GiaoDichVang("v02", "7/1/2003", 10, 15, "k24");
        DanhSachGiaoDich dsgd = new DanhSachGiaoDich();
        dsgd.themGD(gdtt);
        dsgd.themGD(gdv1);
        dsgd.themGD(gdv2);
        dsgd.inDS();
        System.out.println("tinh tien gdtt: "+ gdtt.thanhTien());
        System.out.println("tinh tien gdv1: "+ gdv1.thanhTien());
        System.out.println("tinh tien gdv2: "+ gdv2.thanhTien());

    }
}
