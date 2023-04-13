public class XeNoiThanh extends ChuyenXe {
    private String sotuyen;
    private float sokmdiduoc;

    public XeNoiThanh() {

    }

    public XeNoiThanh(String maso, String hotentaixe, String soxe, String sotuyen, float sokmdiduoc) {
        super(maso, hotentaixe, soxe);
        this.sotuyen = sotuyen;
        this.sokmdiduoc = sokmdiduoc;
    }

    public String getSotuyen() {
        return this.sotuyen;
    }

    public void setSotuyen(String sotuyen) {
        this.sotuyen = sotuyen;
    }

    public float getSokmdiduoc() {
        return this.sokmdiduoc;
    }

    public void setSokmdiduoc(float sokmdiduoc) {
        this.sokmdiduoc = sokmdiduoc;
    }

    @Override
    public String toString() {
        return "{" +
                " sotuyen='" + getSotuyen() + "'" +
                ", sokmdiduoc='" + getSokmdiduoc() + "'" +
                "}";
    }

    @Override
    public double doanhThu() {
        return this.sokmdiduoc * 200;
    }

}
