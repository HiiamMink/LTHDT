public class GiaoDichVang extends GiaoDich {
    private String loaivang;

    public GiaoDichVang() {
    }

    public String getLoaivang() {
        return this.loaivang;
    }

    public void setLoaivang(String loaivang) {
        this.loaivang = loaivang;
    }

    public GiaoDichVang(String magiaodich, String ngaygiaodich, double dongia, double soluong, String loaivang) {
        super(magiaodich, ngaygiaodich, dongia, soluong);
        this.loaivang = loaivang;
    }

    @Override
    public double thanhTien() {
        return super.thanhTien();
    }

    @Override
    public String toString() {
        return "{" +
                " loaivang='" + getLoaivang() + "'" +
                "}";
    }

}
