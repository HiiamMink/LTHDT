import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSach {
    ArrayList<KhachHang> dskh;

    public DanhSach() {
        dskh = new ArrayList<>();
    }

    public void them(KhachHang kh) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Lan nhap thu " + i + ": ");
            if (kh instanceof KhachHangNuocNgoai) {
                kh = new KhachHangNuocNgoai();
                kh.nhap();
            } else if (kh instanceof KhachHangVN) {
                kh = new KhachHangVN();
                kh.nhap();
            }
            dskh.add(kh);
        }
    }

    public void xuatDS() {
        for (KhachHang kh : dskh) {
            System.out.println(kh.toString());
            System.out.println("thanh tien: " + kh.thanhTien());
        }
    }

    public int soLuong(String loai) {
        int dem = 0;
        for (KhachHang kh : dskh) {
            if (kh instanceof KhachHangNuocNgoai && loai.equals("nuoc ngoai")) {
                dem++;
            } else if (kh instanceof KhachHangVN && loai.equals("viet nam")) {
                dem++;
            }
        }
        return dem;
    }

    public double tbThanhTien() {
        double tiennn = 0, tienvn = 0, tbtien = 0;
        int demnn = 0, demvn = 0;
        for (KhachHang kh : dskh) {
            if (kh instanceof KhachHangNuocNgoai) {
                tiennn += kh.thanhTien();
                demnn++;
            } else if (kh instanceof KhachHangVN) {
                tienvn += kh.thanhTien();
                demvn++;
            }
            tbtien = (tiennn + tienvn) / (demnn + demvn);
        }
        return tbtien;
    }

    public void xuatDSHienTai() {
        for (KhachHang kh : dskh) {
            if (kh.getNgayrahd().equals(LocalDate.now())) {
                System.out.println(kh.toString());
                System.out.println("thanh tien: " + kh.thanhTien());
            }
        }
    }

    public void menu() {
        System.out.printf("MENU\n" +
                "0.Thoat\n" +
                "1.Them giao dich\n" +
                "2.Xuat giao dich\n" +
                "3.Tong so luong tung loai\n" +
                "4.Tinh trung binh thanh tien\n" +
                "5.Xuat cac giao dich ngay hom nay\n");
    }

    public void menuThem() {
        System.out.println("MENU\n" +
                "1. Them giao dich dat\n" +
                "2. Them giao dich nha");
    }
}
