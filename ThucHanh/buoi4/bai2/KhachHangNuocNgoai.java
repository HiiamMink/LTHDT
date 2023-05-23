import java.time.LocalDate;
import java.util.Scanner;

public class KhachHangNuocNgoai extends KhachHang {
    private String quoctich;

    public KhachHangNuocNgoai() {

    }

    public KhachHangNuocNgoai(String makh, String hoten, LocalDate ngayrahd, int soluong, double dongia,
            String quoctich) {
        super(makh, hoten, ngayrahd, soluong, dongia);
        this.quoctich = quoctich;
    }

    public String getQuoctich() {
        return this.quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    @Override
    public double thanhTien() {
        return getSoluong() * getDongia();
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("nhap quoc tich: ");
        quoctich = sc.nextLine();
    }

    @Override
    public String toString() {
        return "{" +
                " quoctich='" + getQuoctich() + "'" +
                "}";
    }

}
