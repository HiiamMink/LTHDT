import java.time.LocalDate;
import java.util.Scanner;

public class KhachHangVN extends KhachHang {
    private String doituong;
    private double dinhmuc;

    public KhachHangVN() {

    }

    public KhachHangVN(String makh, String hoten, LocalDate ngayrahd, int soluong, double dongia, String doituong,
            double dinhmuc) {
        super(makh, hoten, ngayrahd, soluong, dongia);
        this.doituong = doituong;
        this.dinhmuc = dinhmuc;
    }

    public String getDoituong() {
        return this.doituong;
    }

    public void setDoituong(String doituong) {
        this.doituong = doituong;
    }

    public double getDinhmuc() {
        return this.dinhmuc;
    }

    public void setDinhmuc(double dinhmuc) {
        this.dinhmuc = dinhmuc;
    }

    @Override
    public double thanhTien() {
        if (getSoluong() <= dinhmuc) {
            return getSoluong() * getDongia();
        } else {
            double soluongvuot = getSoluong() - getDinhmuc();
            return getSoluong() * getDongia() * dinhmuc + soluongvuot * getDongia() * 2.5;
        }
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("nhap doi tuong: ");
        doituong = sc.nextLine();
        System.out.println("nhap dinh muc: ");
        dinhmuc = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "{" +
                " doituong='" + getDoituong() + "'" +
                ", dinhmuc='" + getDinhmuc() + "'" +
                "}";
    }

}
