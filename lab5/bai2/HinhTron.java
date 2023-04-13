public class HinhTron extends Hinh {
    private float r;

    public HinhTron() {

    }

    public HinhTron(float r) {
        super();
        this.r = r;
    }

    public float getR() {
        return this.r;
    }

    public void setR(float r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "{" +
                " r='" + getR() + "'" +
                "}";
    }

    @Override
    public double dienTich() {
        return Math.PI*this.r*this.r;
    }
}
