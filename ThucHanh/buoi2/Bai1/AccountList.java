import java.util.ArrayList;
import java.util.Scanner;

public class AccountList {
    Scanner sc = new Scanner(System.in);
    private int count;
    ArrayList<Account> dsa;

    public AccountList() {
        count = 0;
        System.out.println("nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        if (n > 0) {
            dsa = new ArrayList<>(n);
        } else {
            dsa = new ArrayList<>(10);
        }
    }

    public void themTK(Account acc) {
        System.out.println("nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("lan nhap thu " + i + ": ");
            acc = new Account();
            acc.nhap();
            dsa.add(acc);
        }
    }

    public void xoaTK() {
        System.out.println("nhap so tai khoan muon xoa: ");
        int sotk = sc.nextInt();
        for (int i = 0; i < dsa.size(); i++) {
            Account acc = dsa.get(i);
            if (acc.getSotk() == sotk) {
                dsa.remove(i);
                System.out.println("da xoa tai khoan " + acc.toString());
            }
        }
        System.out.println("khong tim thay so tai khoan nay");
    }

    public void timTK() {
        System.out.println("nhap so tai khoan muon tim: ");
        int sotk = sc.nextInt();
        for (int i = 0; i < dsa.size(); i++) {
            Account acc = dsa.get(i);
            if (acc.getSotk() == sotk) {
                System.out.println("tai khoan can tim: " + acc.toString());
            }
        }
        System.out.println("khong tim thay so tai khoan nay");
    }

    public int soLuong() {
        return dsa.size();
    }

    public void inDS() {
        for (Account acc : dsa) {
            System.out.println(acc.toString());
        }
    }

    public void napTien() {
        Scanner sc = new Scanner(System.in);
        double tiennap;
        System.out.println("nhap so tai khoan: ");
        int sotk = sc.nextInt();
        System.out.println("nhap so tien muon nap: ");
        do {
            tiennap = sc.nextDouble();
            if (tiennap < 0) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (tiennap < 0);
        for (int i = 0; i < dsa.size(); i++) {
            Account acc = dsa.get(i);
            if (acc.getSotk() == sotk) {
                acc.setSotien(acc.getSotien() + tiennap);
                System.out.println("nap tien thanh cong");
            }
        }
        System.out.println("khong tim thay so tai khoan nay");
    }

    public void rutTien() {
        Scanner sc = new Scanner(System.in);
        double tienrut;
        System.out.println("nhap so tai khoan:");
        int sotk = sc.nextInt();
        System.out.println("nhap so tien muon rut: ");
        do {
            tienrut = sc.nextDouble();
            if (tienrut < 0) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (tienrut < 0);
        for (int i = 0; i < dsa.size(); i++) {
            Account acc = dsa.get(i);
            if (acc.getSotk() == sotk) {
                acc.setSotien(acc.getSotien() + tienrut);
                System.out.println("rut tien thanh cong");
            }
        }
        System.out.println("khong tim thay so tai khoan nay");
    }

    public void chuyenKhoan() {
        double tienchuyen;
        System.out.println("nhap so tai khoan: ");
        int sotk1 = sc.nextInt();
        System.out.println("nhap so tai khoan can chuyen tien: ");
        int sotk2 = sc.nextInt();
        System.out.println("nhap so tien muon chuyen: ");
        do {
            tienchuyen = sc.nextDouble();
            if (tienchuyen < 0) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (tienchuyen < 0);
        for (int i = 0; i < dsa.size(); i++) {
            Account acc = dsa.get(i);
            if (acc.getSotk() == sotk1) {
                acc.setSotien(acc.getSotien() - tienchuyen);
                System.out.println("chuyen tien thanh cong");
            }
        }
        for (int i = 0; i < dsa.size(); i++) {
            Account acc = dsa.get(i);
            if (acc.getSotk() == sotk2) {
                acc.setSotien(acc.getSotien() + tienchuyen);
                System.out.println("da nhan tien");
            }
        }
        System.out.println("khong tim thay so tai khoan nay");
    }

    public void daoHan() {
        System.out.println("nhap so tai khoan: ");
        int sotk = sc.nextInt();
        for (int i = 0; i < dsa.size(); i++) {
            Account acc = dsa.get(i);
            if (acc.getSotk() == sotk) {
                acc.setSotien(acc.getSotien() + acc.getSotien() * acc.laisuat);
                System.out.println("dao han thanh cong");
            }
        }
        System.out.println("khong tim thay so tai khoan nay");
    }

    public void menu() {
        System.out.println("MENU");
        System.out.println("0. Thoat");
        System.out.println("1. Them tai khoan");
        System.out.println("2. In danh sach");
        System.out.println("3. So luong tai khoan trong danh sach");
        System.out.println("4. Nap tien");
        System.out.println("5. Rut tien");
        System.out.println("6. Chuyen khoan");
    }
}
