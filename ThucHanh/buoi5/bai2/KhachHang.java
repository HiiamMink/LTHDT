import java.util.Scanner;

public class KhachHang {
    private String cmnd;
    private String ten;
    private String gaden;
    private double giatien;

    public KhachHang(String cmnd, String ten, String gaden, double giatien) {
        this.cmnd = cmnd;
        this.ten = ten;
        this.gaden = gaden;
        this.giatien = giatien;
    }

    public KhachHang() {

    }

    public String getCmnd() {
        return this.cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGaden() {
        return this.gaden;
    }

    public void setGaden(String gaden) {
        this.gaden = gaden;
    }

    public double getGiatien() {
        return this.giatien;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap cmnd khach hang: ");
        cmnd = sc.nextLine();
        System.out.print("nhap ten khach hang: ");
        ten = sc.nextLine();
        System.out.print("nhap ga den: ");
        gaden = sc.nextLine();
        System.out.print("nhap gia tien: ");
        giatien = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "{" +
                " cmnd='" + getCmnd() + "'" +
                ", ten='" + getTen() + "'" +
                ", gaden='" + getGaden() + "'" +
                ", giatien='" + getGiatien() + "'" +
                "}";
    }

}