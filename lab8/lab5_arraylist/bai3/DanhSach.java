import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSach {
    double gia;
    String ten;
    ArrayList<DanhSach> ds;

    public DanhSach() {
        ds = new ArrayList<>();
    }

    public DanhSach(String ten, double gia) {
        this.gia = gia;
        this.ten = ten;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap ten san pham: ");
            String ten = sc.nextLine();
            System.out.println("Nhap gia: ");
            Double gia = sc.nextDouble();
            DanhSach sp = new DanhSach(ten, gia);
            ds.add(sp);
            System.out.println("Nhap them (y/n)?");
            sc.nextLine();
            if (sc.nextLine().equals("n")) {
                break;
            }
        }
    }

    public void xuat() {
        for (DanhSach i : ds) {
            System.out.println(i);
        }
    }

    public void sapXep() {
        Collections.sort(this.ds, new Comparator<DanhSach>() {
            @Override
            public int compare(DanhSach o1, DanhSach o2) {
                return Double.compare(o1.gia, o2.gia);
            }
        });
        Collections.reverse(ds);
    }

    @Override
    public String toString() {
        return "gia=" + gia + ", ten=" + ten;
    }

    public void timVaXoa(String ten) {
        for (DanhSach i : ds) {
            if (i.equals(ten)) {
                ds.remove(i);
                break;
            }
        }
    }

    public void giaTB() {
        double gtb = 0;
        for (DanhSach i : ds) {
            gtb = gtb + i.gia;
        }
        System.out.println("Gia trung binh: " + gtb / ds.size());
    }

    public void menu() {
        int luachon = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("1.Nhap \n"
                + "2.Sap xep giam dan va xuat \n"
                + "3.Tim va xoa \n"
                + "4.Xuat gia trung binh \n");
        do {
            System.out.printf("Nhap lua chon: ");
            luachon = sc.nextInt();
            if (luachon == 1) {
                nhap();
            } else if (luachon == 2) {
                sapXep();
                xuat();
            } else if (luachon == 3) {
                System.out.println("Nhap ten: ");
                sc.nextLine();
                String ten = sc.nextLine();
                timVaXoa(ten);
            } else if (luachon == 4) {
                giaTB();
            }
        } while (luachon != 4);
    }
}