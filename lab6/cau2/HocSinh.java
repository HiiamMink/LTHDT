public class HocSinh {
    private String hoTen;
    private String lop;
    private double toan;
    private double ly;
    private double hoa;

    public HocSinh() {
        this.hoTen = null;
        this.lop = null;
        this.toan = 0;
        this.ly = 0;
        this.hoa = 0;
    }

    public HocSinh(String hoTen, String lop, double toan, double ly, double hoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return this.lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getToan() {
        return this.toan;
    }

    public void setToan(Double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return this.ly;
    }

    public void setLy(Double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return this.hoa;
    }

    public void setHoa(Double hoa) {
        this.hoa = hoa;
    }

    public double diemTrungBinh() {
        return (this.toan + this.ly + this.hoa) / 3;
    }

}