public class HoaQua {
    private float khoiluong;
    private double gia;
    private String ngaynhap;
    private int soluong;
    private String nguon;

    public HoaQua() {

    }

    public HoaQua(float khoiluong, double gia, String ngaynhap, int soluong, String nguon) {
        this.khoiluong = khoiluong;
        this.gia = gia;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
        this.nguon = nguon;
    }

    public float getKhoiluong() {
        return this.khoiluong;
    }

    public void setKhoiluong(float khoiluong) {
        this.khoiluong = khoiluong;
    }

    public double getGia() {
        return this.gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getNgaynhap() {
        return this.ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public int getSoluong() {
        return this.soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getNguon() {
        return this.nguon;
    }

    public void setNguon(String nguon) {
        this.nguon = nguon;
    }

    public double tinhTien() {
        return this.soluong * this.gia;
    }

    @Override
    public String toString() {
        return "{" +
                " khoiluong='" + getKhoiluong() + "'" +
                ", gia='" + getGia() + "'" +
                ", ngaynhap='" + getNgaynhap() + "'" +
                ", soluong='" + getSoluong() + "'" +
                ", nguon='" + getNguon() + "'" +
                "}";
    }

}