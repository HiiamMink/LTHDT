import java.time.LocalDate;
import java.util.Scanner;

public class GiaoDichNha extends GiaoDich {
    private String diachi, loainha;

    public GiaoDichNha() {

    }

    public GiaoDichNha(String magd, LocalDate ngaygd, double dongia, double dientich, String diachi, String loainha) {
        super(magd, ngaygd, dongia, dientich);
        this.diachi = diachi;
        this.loainha = loainha;
    }

    public String getDiachi() {
        return this.diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getLoainha() {
        return this.loainha;
    }

    public void setLoainha(String loainha) {
        this.loainha = loainha;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("nhap dia chi: ");
        diachi = sc.nextLine();
        System.out.println("nhap loai nha (cao cap/thuong): ");
        loainha = sc.nextLine();
    }

    @Override
    public double thanhTien() {
        if (loainha.equalsIgnoreCase("cao cap")) {
            return getDientich() * getDongia();
        } else if (loainha.equalsIgnoreCase("thuong")) {
            return getDientich() * getDongia() * 0.9;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "{" +
                " diachi='" + getDiachi() + "'" +
                ", loainha='" + getLoainha() + "'" +
                "}";
    }

}
