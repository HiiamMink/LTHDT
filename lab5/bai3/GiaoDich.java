class GiaoDich {
    private String magiaodich, ngaygiaodich;
    private double dongia, soluong;

    public GiaoDich() {

    }

    public GiaoDich(String magiaodich, String ngaygiaodich, double dongia, double soluong) {
        this.magiaodich = magiaodich;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
        this.soluong = soluong;
    }

    public String getMagiaodich() {
        return this.magiaodich;
    }

    public void setMagiaodich(String magiaodich) {
        this.magiaodich = magiaodich;
    }

    public String getNgaygiaodich() {
        return this.ngaygiaodich;
    }

    public void setNgaygiaodich(String ngaygiaodich) {
        this.ngaygiaodich = ngaygiaodich;
    }

    public double getDongia() {
        return this.dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getSoluong() {
        return this.soluong;
    }

    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }

    public double thanhTien() {
        return soluong * dongia;
    }

    @Override
    public String toString() {
        return "{" +
                " magiaodich='" + getMagiaodich() + "'" +
                ", ngaygiaodich='" + getNgaygiaodich() + "'" +
                ", dongia='" + getDongia() + "'" +
                ", soluong='" + getSoluong() + "'" +
                "}";
    }

}