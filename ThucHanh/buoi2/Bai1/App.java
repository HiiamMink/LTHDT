import java.nio.channels.DatagramChannel;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        AccountList dsa = new AccountList();
        Account acc = new Account();
        int luachon = 0;
        Scanner sc = new Scanner(System.in);
        do {
            dsa.menu();
            System.out.println("nhap lua chon: ");
            luachon = sc.nextInt();
            if (luachon == 1) {
                dsa.themTK(acc);
            } else if (luachon == 2) {
                dsa.inDS();
            } else if (luachon == 3) {
                dsa.soLuong();
            } else if (luachon == 2) {
                dsa.napTien();
            } else if (luachon == 2) {
                dsa.rutTien();
            } else if (luachon == 2) {
                dsa.chuyenKhoan();
            }
        } while (luachon != 0);
    }
}