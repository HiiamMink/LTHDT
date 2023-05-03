import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSach {
    ArrayList<Vehicle> dsx;

    public DanhSach() {
        this.dsx = new ArrayList<Vehicle>();
    }

    public void them(Vehicle xe) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Lan nhap thu " + i + ": ");
            xe.nhap();
            dsx.add(xe);
        }
    }

    public void inDanhSach() {
        for (Vehicle i : dsx) {
           i.hien(); 
        }
    }

    public void MENU() {
        System.out.println("MENU");
        System.out.println("0. Thoat.");
        System.out.println("1. Nhap thong tin.");
        System.out.println("2. Xuat bang ke khai tien thue.");
    }
}
