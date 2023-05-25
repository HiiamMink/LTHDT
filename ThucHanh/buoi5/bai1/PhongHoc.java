import java.util.Scanner;

public class PhongHoc {
    private String maphong;
    private int sodaynha, bongden;
    private double dientich;

    public PhongHoc() {

    }

    public PhongHoc(String maphong, int sodaynha, int bongden, double dientich) {
        this.maphong = maphong;
        this.sodaynha = sodaynha;
        this.bongden = bongden;
        this.dientich = dientich;
    }

    public String getMaphong() {
        return this.maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public int getSodaynha() {
        return this.sodaynha;
    }

    public void setSodaynha(int sodaynha) {
        this.sodaynha = sodaynha;
    }

    public int getBongden() {
        return this.bongden;
    }

    public void setBongden(int bongden) {
        this.bongden = bongden;
    }

    public double getDientich() {
        return this.dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    public boolean datChuan() {
        return true;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma phong: ");
        maphong = sc.nextLine();
        System.out.println("nhap so day nha: ");
        sodaynha = sc.nextInt();
        System.out.println("nhap so bong den: ");
        bongden = sc.nextInt();
        System.out.println("nhap dien tich (m2): ");
        dientich = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "{" +
                " maphong='" + getMaphong() + "'" +
                ", sodaynha='" + getSodaynha() + "'" +
                ", bongden='" + getBongden() + "'" +
                ", dientich='" + getDientich() + "'" +
                "}";
    }

}