import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.BlockElement;

public class PhongHocLyThuyet extends PhongHoc {
    private boolean comaychieu;

    public PhongHocLyThuyet() {

    }

    public PhongHocLyThuyet(String maphong, int sodaynha, int bongden, double dientich, Boolean comaychieu) {
        super(maphong, sodaynha, bongden, dientich);
        this.comaychieu = comaychieu;
    }

    public boolean isComaychieu() {
        return this.comaychieu;
    }

    public boolean getComaychieu() {
        return this.comaychieu;
    }

    public void setComaychieu(boolean comaychieu) {
        this.comaychieu = comaychieu;
    }

    @Override
    public boolean datChuan() {
        return super.datChuan() && isComaychieu();
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
    }

    @Override
    public String toString() {
        return "{" +
            " comaychieu='" + getComaychieu() + "'" +
            "}";
    }

}
