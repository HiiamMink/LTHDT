public class Circle {
    private double r;
    private String color;

    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public double getR() {
        return this.r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return "{" +
                " r='" + getR() + "'" +
                ", color='" + getColor() + "'" +
                "}";
    }
}
