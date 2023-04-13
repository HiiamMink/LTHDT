public class GiaoDichTienTe extends GiaoDich {
    private double tigia;
    private String loaitien;

    public GiaoDichTienTe() {

    }

    public GiaoDichTienTe(String magiaodich, String ngaygiaodich, double dongia, double soluong, double tigia,
            String loaitien) {
        super(magiaodich, ngaygiaodich, dongia, soluong);
        this.tigia = tigia;
        this.loaitien = loaitien;
    }

    public double getTigia() {
        return this.tigia;
    }

    public void setTigia(double tigia) {
        this.tigia = tigia;
    }

    public String getLoaitien() {
        return this.loaitien;
    }

    public void setLoaitien(String loaitien) {
        this.loaitien = loaitien;
    }

    @Override
    public double thanhTien() {
        if (this.loaitien == "vietnam") {
            return getDongia() * getSoluong();
        } else {
            return getSoluong() * getDongia() * tigia;
        }
    }

    @Override
    public String toString() {
        return "{" +
                " tigia='" + getTigia() + "'" +
                ", loaitien='" + getLoaitien() + "'" +
                "}";
    }

}
