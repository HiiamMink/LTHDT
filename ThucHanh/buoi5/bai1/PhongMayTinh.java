import java.util.Scanner;

public class PhongMayTinh extends PhongHoc {
    private int somaytinh;

    public PhongMayTinh() {

    }

    public PhongMayTinh(String maphong, int sodaynha, int bongden, double dientich, int somaytinh) {
        super(maphong, sodaynha, bongden, dientich);
        this.somaytinh = somaytinh;
    }

    public int getSomaytinh() {
        return this.somaytinh;
    }

    public void setSomaytinh(int somaytinh) {
        this.somaytinh = somaytinh;
    }

    @Override
    public boolean datChuan() {
        return super.datChuan() && (getDientich() / somaytinh >= 1.5);
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("nhap so may tinh: ");
        somaytinh = sc.nextInt();
    }

    @Override
    public String toString() {
        return "{" +
                " somaytinh='" + getSomaytinh() + "'" +
                "}";
    }

}
