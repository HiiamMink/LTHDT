public class SinhVien {
    private String masv;
    private String hoten;

    public SinhVien() {

    }

    public SinhVien(String masv, String hoten) {
        this.masv = masv;
        this.hoten = hoten;
    }

    public String getMasv() {
        return this.masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return this.hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Override
    public String toString() {
        return "{" +
                " masv='" + getMasv() + "'" +
                ", hoten='" + getHoten() + "'" +
                "}";
    }

}
