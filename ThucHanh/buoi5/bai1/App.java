import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DanhSach ds = new DanhSach();
        PhongHoc ph;
        int luachon = 0;
        do {
            ds.menu();
            System.out.println("nhap lua chon: ");
            luachon = sc.nextInt();
            if (luachon == 1) {
                System.out.println("Them phong hoc: ");
                System.out.println("0. Thoat\n" +
                        "1. Them phong hoc ly thuyet\n" +
                        "2. Them phong may tinh\n" +
                        "3. Them phong thi nghiem\n");
                System.out.println("nhap lua chon: ");
                int x = sc.nextInt();
                if (x == 1) {
                    PhongHocLyThuyet lt = new PhongHocLyThuyet();
                    ds.them(lt);
                } else if (x == 2) {
                    PhongMayTinh mt = new PhongMayTinh();
                    ds.them(mt);
                } else if (x == 3) {
                    PhongThiNghiem tn = new PhongThiNghiem();
                    ds.them(tn);
                }
            } else if (luachon == 2) {
                System.out.println("nhap ma phong hoc muon tim: ");
                String maph = sc.nextLine();
                ds.timPhongHoc(maph);
            } else if (luachon == 3) {
                ds.inDSPhongHoc();
            } else if (luachon == 4) {
                ds.inDSPhongHocDatChuan();
            } else if (luachon == 5) {
                ds.sapXepTheoDayNha();
            } else if (luachon == 6) {
                ds.sapXepTheoDienTichGiamDan();
            } else if (luachon == 7) {
                ds.sapXepTheoSoBongDenTangDan();
            } else if (luachon == 8) {
                System.out.println("nhap ma phong hoc muon cap nhat: ");
                String maph = sc.nextLine();
                System.out.println("nhap so luong may tinh: ");
                int somaytinh = sc.nextInt();
                ds.capNhatSoMayTinh(maph, somaytinh);
            } else if (luachon == 9) {
                System.out.println("nhap ma phong hoc muon xoa: ");
                String maph = sc.nextLine();
                System.out.println("ban co muon xoa khong?");
                System.out.println("1. Khong" +
                        "2. Co");
                System.out.println("nhap lua chon: ");
                int x = sc.nextInt();
                do {
                    if (x == 1) {
                        ds.xoaPhongHoc(maph);
                    }
                } while (x != 2);
            } else if (luachon == 10) {
                ds.soLuongPhongHoc();
            } else if (luachon == 11) {
                ds.inPhongMay60May();
            }
        } while (luachon != 0);

    }
}
