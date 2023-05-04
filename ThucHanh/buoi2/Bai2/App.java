import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        DanhSachCD dscd = new DanhSachCD();
        CD cd = new CD();
        int luachon = 0;
        Scanner sc = new Scanner(System.in);
        do {
            dscd.menu();
            System.out.printf("Nhap lua chon: ");
            luachon = sc.nextInt();
            if (luachon == 1) {
                cd = new CD();
                dscd.themCD(cd);
            } else if (luachon == 2) {
                dscd.inDSCD();
            } else if (luachon == 3) {
                System.out.println("So tai khoan hien co la: " + dscd.soLuong());
            } else if (luachon == 4) {
                System.out.println("Tong gia thanh CD la: " + dscd.tongGia());
            } else if (luachon == 5) {
                dscd.sapXepCDTheoGia();
                dscd.inDSCD();
            } else if (luachon == 6) {
                dscd.sapXepCDTheoTen();
                dscd.inDSCD();
            }
        } while (luachon != 0);
    }
}
