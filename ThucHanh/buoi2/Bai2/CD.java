import java.util.Scanner;

public class CD {
    private int macd, soluong;
    private double giaban;
    private String tencd;

    public CD() {

    }

    public CD(int macd, String tencd, double giaban, int soluong) {
        this.macd = macd;
        this.tencd = tencd;
        this.giaban = giaban;
        this.soluong = soluong;
    }

    public int getMacd() {
        return this.macd;
    }

    public void setMacd(int macd) {
        if (macd > 0) {
            this.macd = macd;
        } else {
            this.macd = 999999;
        }
    }

    public int getSoluong() {
        return this.soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGiaban() {
        return this.giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public String getTencd() {
        return this.tencd;
    }

    public void setTencd(String tencd) {
        if (tencd != "") {
            this.tencd = tencd;
        } else {
            this.tencd = "chua xac dinh";
        }
    }

    @Override
    public String toString() {
        return "{" +
                " macd='" + getMacd() + "'" +
                ", soluong='" + getSoluong() + "'" +
                ", giaban='" + getGiaban() + "'" +
                ", tencd='" + getTencd() + "'" +
                "}";
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma cd: ");
        macd = sc.nextInt();
        System.out.println("nhap ten cd: ");
        tencd = sc.nextLine();
        do {
            System.out.println("nhap gia ban: ");
            giaban = sc.nextDouble();
            if (giaban < 0) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (giaban < 0);
        do {
            System.out.println("nhap so luong: ");
            soluong = sc.nextInt();
            if (soluong < 0) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (soluong < 0);
    }

}