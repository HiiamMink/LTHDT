import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class DanhSach {
    ArrayList<String> ds;

    public DanhSach() {
        ds = new ArrayList<>();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap ho va ten: ");
            String ten = sc.nextLine();
            ds.add(ten);
            System.out.println("Nhap them (y/n)?");
            if (sc.nextLine().equals("n")) {
                break;
            }
        }
    }

    public void xuat() {
        for (String i : ds) {
            System.out.println(i);
        }
    }

    public void xuatNgauNhien() {
        Collections.shuffle(ds);
        xuat();
    }

    public void sapXep() {
        Collections.sort(ds);
        Collections.reverse(ds);
        xuat();
    }

    public void timVaXoa(String ten) {
        for (String i : ds) {
            if (i.equals(ten)) {
                ds.remove(i);
                break;
            }
        }
    }

    public void menu() {
        int luachon = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("1.Nhap \n"
                + "2.Xuat danh sach vua nhap \n"
                + "3.Xuat danh sach ngau nhien \n"
                + "4.Sap xep giam dan va xuat danh sach \n"
                + "5.Tim va xoa ho ten nhap tu ban phim \n"
                + "6.Ket thuc \n");
        do {
            System.out.printf("Nhap lua chon: ");
            luachon = sc.nextInt();
            if (luachon == 1) {
                nhap();
            } else if (luachon == 2) {
                xuat();
            } else if (luachon == 3) {
                xuatNgauNhien();
            } else if (luachon == 4) {
                sapXep();
            } else if (luachon == 5) {
                System.out.println("Nhap ten: ");
                sc.nextLine();
                String ten = sc.nextLine();
                timVaXoa(ten);
            }
        } while (luachon != 6);
    }
}