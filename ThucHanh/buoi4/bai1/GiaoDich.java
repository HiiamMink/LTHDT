import java.time.LocalDate;
import java.util.Scanner;

public class GiaoDich {
    private String magd;
    private LocalDate ngaygd = LocalDate.now();
    private double dongia, dientich;

    public GiaoDich() {

    }

    public GiaoDich(String magd, LocalDate ngaygd, double dongia, double dientich) {
        this.magd = magd;
        this.ngaygd = ngaygd;
        this.dongia = dongia;
        this.dientich = dientich;
    }

    public String getMagd() {
        return this.magd;
    }

    public void setMagd(String magd) {
        this.magd = magd;
    }

    public LocalDate getNgaygd() {
        return this.ngaygd;
    }

    public void setNgaygd(LocalDate ngaygd) {
        this.ngaygd = LocalDate.now();
    }

    public double getDongia() {
        return this.dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getDientich() {
        return this.dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    public double thanhTien() {
        return 0;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma giao dich: ");
        magd = sc.nextLine();
        int ngay, thang, nam;
        System.out.println("nhap ngay giao dich: ");
        ngay = sc.nextInt();
        System.out.println("nhap thang giao dich: ");
        thang = sc.nextInt();
        System.out.println("nhap nam giao dich: ");
        nam = sc.nextInt();
        ngaygd = LocalDate.of(nam, thang, ngay);
        System.out.println("nhap don gia: ");
        dongia = sc.nextDouble();
        System.out.println("nhap dien tich: ");
        dientich = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "{" +
                " magd='" + getMagd() + "'" +
                ", ngaygd='" + getNgaygd() + "'" +
                ", dongia='" + getDongia() + "'" +
                ", dientich='" + getDientich() + "'" +
                "}";
    }

}
