import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        DanhSach ds = new DanhSach();
        Vehicle xe ;
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap lua chon: ");
        n = sc.nextInt();
        do {
            ds.MENU();
            if (n == 1) {
                xe = new Vehicle();
                ds.them(xe);
            }
            if (n == 2) {
                ds.inDanhSach();
            }
        } while (n != 0);
    }
}
