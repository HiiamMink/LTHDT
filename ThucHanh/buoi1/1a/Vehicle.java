import java.util.Scanner;

public class Vehicle {
    private String tenchuxe;
    private String loaixe;
    private double dungtich, trigia;

    public Vehicle() {
        this.tenchuxe = null;
        this.loaixe = null;
        this.dungtich = 0;
        this.trigia = 0;
    }

    public Vehicle(String tenchuxe, String loaixe, double dungtich, double trigia) {
        this.tenchuxe = tenchuxe;
        this.loaixe = loaixe;
        this.dungtich = dungtich;
        this.trigia = trigia;
    }

    public String getTenchuxe() {
        return this.tenchuxe;
    }

    public void setTenchuxe(String tenchuxe) {
        this.tenchuxe = tenchuxe;
    }

    public String getLoaixe() {
        return this.loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public double getDungtich() {
        return this.dungtich;
    }

    public void setDungtich(double dungtich) {
        this.dungtich = dungtich;
    }

    public double getTrigia() {
        return this.trigia;
    }

    public void setTrigia(double trigia) {
        this.trigia = trigia;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten chu xe: ");
        tenchuxe = sc.nextLine();
        System.out.print("Nhap loai xe: ");
        loaixe = sc.nextLine();
        do {
            System.out.print("Nhap dung tich: ");
            dungtich = sc.nextDouble();
        } while (dungtich < 0 || dungtich > 200);
        do {
            System.out.println("Nhap tri gia xe:");
            trigia = sc.nextDouble();
        } while (trigia < 0);
    }

    public double tinhThue() {
        if (this.dungtich < 100) {
            return 1 * this.trigia / 100;
        } else if (this.dungtich >= 100 || this.dungtich <= 200) {
            return 3 * this.trigia / 100;
        } else {
            return 5 * this.trigia / 100;
        }
    }

    public void hien() {
        System.out.format("%-26s %-26s %-26f %-26f %-26f", "ten chu xe", "the loai", "dung tich", "tri gia","thue phai nop");
        System.out.println("=========================================================================================================");
        System.out.format("%-26s %-26s %-26f %-26f %-26f", tenchuxe, loaixe, dungtich, trigia, tinhThue());
    }

    @Override
    public String toString() {
        return "{" +
                " tenchuxe='" + getTenchuxe() + "'" +
                ", loaixe='" + getLoaixe() + "'" +
                ", dungtich='" + getDungtich() + "'" +
                ", trigia='" + getTrigia() + "'" +
                "}";
    }

}