import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        DanhSach ds = new DanhSach();
        SinhVien sv;
        int luachon = 0;
        Scanner sc = new Scanner(System.in);
        do {
            ds.menu();
            System.out.println("nhap lua chon: ");
            luachon = sc.nextInt();
            if (luachon == 1) {
                ds.them();
            } else if (luachon == 2) {
                ds.hienDS();
            } else if (luachon == 3) {
                ds.xoa();
            } else if (luachon == 4) {
                System.out.println("nhap ma sinh vien can sua thong tin: ");
                String masv = sc.nextLine();
                ds.sua(masv);
            } else if (luachon == 5) {
                ds.tim();
            }
        } while (luachon != 0);
    }
}
