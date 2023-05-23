import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DanhSach ds = new DanhSach();
        KhachHang kh = new KhachHang();
        int luachon = 0;
        do {
            ds.menu();
            System.out.println("nhap lua chon: ");
            int n = sc.nextInt();
            if (luachon == 1) {
                int x;
                do {
                    ds.menuThem();
                    System.out.println("nhap lua chon: ");
                    x = sc.nextInt();
                    if (x == 1) {
                        KhachHangNuocNgoai khnn = new KhachHangNuocNgoai();
                        ds.them(khnn);
                    } else if (x == 2) {
                        KhachHangVN khvn = new KhachHangVN();
                        ds.them(khvn);
                    }
                } while (x != 0);
            } else if (luachon == 2) {
                ds.xuatDS();
            } else if (luachon == 3) {
                System.out.println("nhap doi tuong can dem (viet nam/nuoc ngoai): ");
                String loai = sc.nextLine();
                System.out.println("so luong: " + ds.soLuong(loai));
            } else if (luachon == 4) {
                System.out.println("trung binh thanh tien: " + ds.tbThanhTien());
            } else if (luachon == 5) {
                ds.xuatDSHienTai();
            }
        } while (luachon != 0);
    }
}
