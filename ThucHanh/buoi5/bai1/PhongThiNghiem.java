import java.util.Scanner;

public class PhongThiNghiem extends PhongHoc {
    private String thongtin;
    private int succhua;
    private boolean bonrua;

    public PhongThiNghiem() {

    }

    public PhongThiNghiem(String maphong, int sodaynha, int bongden, double dientich, String thongtin, int succhua,
            boolean bonrua) {
        super(maphong, sodaynha, bongden, dientich);
        this.thongtin = thongtin;
        this.succhua = succhua;
        this.bonrua = bonrua;
    }

    public String getThongtin() {
        return this.thongtin;
    }

    public void setThongtin(String thongtin) {
        this.thongtin = thongtin;
    }

    public boolean isBonrua() {
        return this.bonrua;
    }

    public boolean getBonrua() {
        return this.bonrua;
    }

    public void setBonrua(boolean bonrua) {
        this.bonrua = bonrua;
    }

    public int getSucchua() {
        return this.succhua;
    }

    public void setSucchua(int succhua) {
        this.succhua = succhua;
    }

    @Override
    public boolean datChuan() {
        return super.datChuan() && isBonrua();
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap thong tin chuyen nganh: ");
        thongtin = sc.nextLine();
        System.out.println("nhap suc chua: ");
        succhua = sc.nextInt();
    }

    @Override
    public String toString() {
        return "{" +
            " thongtin='" + getThongtin() + "'" +
            ", succhua='" + getSucchua() + "'" +
            ", bonrua='" + isBonrua() + "'" +
            "}";
    }

   

}
