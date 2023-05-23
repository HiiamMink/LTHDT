import java.time.LocalDate;
import java.util.Scanner;

public class KhachHang {
    private String makh, hoten;
    private LocalDate ngayrahd;
    private int soluong;
    private double dongia;

    public KhachHang() {

    }

    public KhachHang(String makh, String hoten, LocalDate ngayrahd, int soluong, double dongia) {
        this.makh = makh;
        this.hoten = hoten;
        this.ngayrahd = ngayrahd;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getMakh() {
        return this.makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getHoten() {
        return this.hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public LocalDate getNgayrahd() {
        return this.ngayrahd;
    }

    public void setNgayrahd(LocalDate ngayrahd) {
        this.ngayrahd = ngayrahd;
    }

    public int getSoluong() {
        return this.soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return this.dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma khach hang: ");
        makh = sc.nextLine();
        System.out.println("nhap ho va ten khach hang: ");
        hoten = sc.nextLine();
        int ngay, thang, nam;
        System.out.println("nhap ngay ra don: ");
        ngay = sc.nextInt();
        System.out.println("nhap thang ra don: ");
        thang = sc.nextInt();
        System.out.println("nhap nam ra don: ");
        nam = sc.nextInt();
        ngayrahd = LocalDate.of(nam, thang, ngay);
        System.out.println("nhap so luong: ");
        soluong = sc.nextInt();
        System.out.println("nhap don gia: ");
        dongia = sc.nextDouble();
    }

    public double thanhTien(){
        return 0;
    }

    @Override
    public String toString() {
        return "{" +
                " makh='" + getMakh() + "'" +
                ", hoten='" + getHoten() + "'" +
                ", ngayrahd='" + getNgayrahd() + "'" +
                ", soluong='" + getSoluong() + "'" +
                ", dongia='" + getDongia() + "'" +
                "}";
    }

}
