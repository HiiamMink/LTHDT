import java.util.Scanner;

public class SanPham {
    private String tensp;
    private double dongia, giamgia;

    public SanPham(String tensp, double dongia, double giamgia) {
        this.tensp = tensp;
        this.dongia = dongia;
        this.giamgia = giamgia;
    }

    public SanPham(String tensp, double dongia) {
        this.tensp = tensp;
        this.dongia = dongia;
    }

    public String getTensp() {
        return this.tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public double getDongia() {
        return this.dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getGiamgia() {
        return this.giamgia;
    }

    public void setGiamgia(double giamgia) {
        this.giamgia = giamgia;
    }

    public double thueNhapKhau() {
        return 0.1 * dongia;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        tensp = sc.nextLine();
        dongia = sc.nextDouble();
        giamgia = sc.nextDouble();
    }

    public void xuat() {
        System.out.println("ten san pham: " + tensp + " don gia: " + dongia + " giam gia: " + giamgia);
    }
}