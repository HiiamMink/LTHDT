import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        DanhSach ds = new DanhSach();
        KhachHang kh;
        ds.laydulieu();
        Scanner sc = new Scanner(System.in);
        int luachon = 0;
        do {
            ds.menu();
            System.out.print("nhap lua chon: ");
            luachon = sc.nextInt();
            sc.nextLine();
            if (luachon == 1) {
                kh = new KhachHang();
                ds.themKhachHang(kh);
            } else if (luachon == 2) {
                System.out.print("nhap cmnd khach hang: ");
                String cmnd = sc.nextLine();
                ds.banVe(cmnd);
            } else if (luachon == 3) {
                ds.inDSKH();
            } else if (luachon == 4) {
                System.out.print("nhap cmnd khach hang: ");
                String cmnd = sc.nextLine();
                ds.huyKhachHang(cmnd);
            } else if (luachon == 5) {
                ds.thongKe();
            } else if (luachon == 6) {
                System.out.print("nhap ten file: ");
                String tenfile = sc.nextLine();
                ds.luuDSVaoFile(tenfile);
            } else if (luachon == 7) {
                ds.inDSCacGaChoMuaVe();
            }
        } while (luachon != 0);
    }
}