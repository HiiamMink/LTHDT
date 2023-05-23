import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSach {
    ArrayList<GiaoDich> ds;

    public DanhSach() {
        ds = new ArrayList<>();
    }

    public void them(GiaoDich gd) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Lan nhap thu " + i + ": ");
            if (gd instanceof GiaoDichDat) {
                gd = new GiaoDichDat();
                gd.nhap();
            } else if (gd instanceof GiaoDichNha) {
                gd = new GiaoDichNha();
                gd.nhap();
            }
            ds.add(gd);
        }
    }

    public void xuatDS() {
        for (GiaoDich gd : ds) {
            System.out.println(gd.toString());
            System.out.println("Thanh tien: " + gd.thanhTien());
        }
    }

    public void xuatDSHienTai() {
        for (GiaoDich gd : ds) {
            if (gd.getNgaygd().equals(LocalDate.now())) {
                System.out.println(gd.toString());
                System.out.println("Thanh tien: " + gd.thanhTien());
            }
        }
    }

    public int soLuong(String loai) {
        int dem = 0;
        for (GiaoDich gd : ds) {
            if (gd instanceof GiaoDichDat && loai.equals("dat")) {
                dem++;
            } else if (gd instanceof GiaoDichNha && loai.equals("nha")) {
                dem++;
            }
        }
        return dem;
    }

    public double tbThanhTien() {
        double tiendat = 0, tiennha = 0, tbtien = 0;
        int demdat = 0, demnha = 0;
        for (GiaoDich gd : ds) {
            if (gd instanceof GiaoDichDat) {
                tiendat += gd.thanhTien();
                demdat++;
            } else if (gd instanceof GiaoDichDat) {
                tiennha += gd.thanhTien();
                demnha++;
            }
            tbtien = (tiendat + tiennha) / (demdat + demnha);
        }
        return tbtien;
    }

    public void menu(){
        System.out.printf("MENU\n" +
                    "0.Thoat\n" +
                    "1.Them giao dich\n" +
                    "2.Xuat giao dich\n" +
                    "3.Tong so luong tung loai\n" +
                    "4.Tinh trung binh thanh tien cua giao dich dat\n" +
                    "5.Xuat cac giao dich ngay hom nay\n");
    }

    public void menuThem(){
        System.out.println("MENU\n"+
        "1. Them giao dich dat\n"+
        "2. Them giao dich nha");
    }
}
