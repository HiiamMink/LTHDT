public class HinhChuNhat extends Hinh {
    private float cd;
    private float cr;

    public HinhChuNhat(float cd, float cr) {
        super();
        this.cd = cd;
        this.cr = cr;
    }

    public float getCd() {
        return this.cd;
    }

    public void setCd(float cd) {
        this.cd = cd;
    }

    public float getCr() {
        return this.cr;
    }

    public void setCr(float cr) {
        this.cr = cr;
    }

    @Override
    public String toString() {
        return "{" +
                " cd='" + getCd() + "'" +
                ", cr='" + getCr() + "'" +
                "}";
    }

    @Override
    public double dienTich() {
        return this.cr * this.cd;
    }
}
