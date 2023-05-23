import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DanhSach ds = new DanhSach();
        GiaoDich gd = new GiaoDich();
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
                        GiaoDichDat gdd = new GiaoDichDat();
                        ds.them(gdd);
                    } else if (x == 2) {
                        GiaoDichNha gdn = new GiaoDichNha();
                        ds.them(gdn);
                    }
                } while (x != 0);
            } else if (luachon == 2) {
                ds.xuatDS();
            } else if (luachon == 3) {
                System.out.println("nhap loai can dem (dat/nha): ");
                String loai = sc.nextLine();
                System.out.println("so luong: " + ds.soLuong(loai));
            } else if (luachon == 4) {
                System.out.println("Trung binh thanh tien: " + ds.tbThanhTien());
            } else if (luachon == 5) {
                ds.xuatDSHienTai();
            }
        } while (luachon != 0);
    }
}
