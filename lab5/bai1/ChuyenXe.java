public class ChuyenXe {
    private String maso;
    private String hotentaixe;
    private String soxe;

    public ChuyenXe() {

    }

    public ChuyenXe(String maso, String hotentaixe, String soxe) {
        this.maso = maso;
        this.hotentaixe = hotentaixe;
        this.soxe = soxe;
    }

    public String getMaso() {
        return this.maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHotentaixe() {
        return this.hotentaixe;
    }

    public void setHotentaixe(String hotentaixe) {
        this.hotentaixe = hotentaixe;
    }

    public String getSoxe() {
        return this.soxe;
    }

    public void setSoxe(String soxe) {
        this.soxe = soxe;
    }

    public double doanhThu() {
        return 0;
    }

    @Override
    public String toString() {
        return "{" +
                " maso='" + getMaso() + "'" +
                ", hotentaixe='" + getHotentaixe() + "'" +
                ", soxe='" + getSoxe() + "'" +
                "}";
    }

}