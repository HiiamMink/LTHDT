import java.util.Scanner;

public class Account {
    private double sotien;
    private int sotk;
    private String tentk, trangthai;
    double laisuat = 0.035;

    public Account() {
        this.sotk = 0;
        this.tentk = null;
        this.sotien = 0;
    }

    public Account(int sotk, String tentk) {
        this.sotk = sotk;
        this.tentk = tentk;
        this.sotien = 50;
    }

    public Account(int sotk, String tentk, double sotien) {
        this.sotk = sotk;
        this.tentk = tentk;
        this.sotien = sotien;
    }

    public double getSotien() {
        return this.sotien;
    }

    public void setSotien(double sotien) {
        this.sotien = sotien;
    }

    public int getSotk() {
        return this.sotk;
    }

    public void setSotk(int sotk) {
        this.sotk = sotk;
    }

    public String getTentk() {
        return this.tentk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }

    public String getTrangthai() {
        return this.trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "so tai khoan: " + sotk + "ten tai khoan: " + tentk + "so tien: " + sotien + "trang thai: " + trangthai;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap so tai khoan: ");
            sotk = sc.nextInt();
            if (sotk < 0) {
                System.out.println("khong hop le! nhap lai:\n");
            }
        } while (sotk < 0);
        do {
            System.out.println("nhap ten tai khoan: ");
            tentk = sc.nextLine();
            if (tentk == "")
                System.out.println("Ten bi trong! Nhap lai:");
        } while (tentk == "");
        do {
            System.out.println("nhap so tien: ");
            sotien = sc.nextDouble();
            if (sotien < 50) {
                System.out.println("khong hop le! nhap lai:\n");
            }
        } while (sotien < 50);
        System.out.println("nhap trang thai: ");
        trangthai = sc.nextLine();
    }

}