import java.time.LocalDate;
import java.util.Scanner;

public class GiaoDichDat extends GiaoDich {
    private String loaidat;

    public GiaoDichDat() {

    }

    public GiaoDichDat(String magd, LocalDate ngaygd, double dongia, double dientich, String loaidat) {
        super(magd, ngaygd, dongia, dientich);
        this.loaidat = loaidat;
    }

    public String getLoaidat() {
        return this.loaidat;
    }

    public void setLoaidat(String loaidat) {
        this.loaidat = loaidat;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("nhap loai dat (A/B/C): ");
        loaidat = sc.nextLine();
    }

    @Override
    public double thanhTien() {
        if (loaidat.equalsIgnoreCase("A")) {
            return getDientich() * getDongia() * 1.5;
        } else if (loaidat.equalsIgnoreCase("B") && loaidat.equalsIgnoreCase("C")) {
            return getDientich() * getDongia();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "{" +
                " loaidat='" + getLoaidat() + "'" +
                "}";
    }

}
