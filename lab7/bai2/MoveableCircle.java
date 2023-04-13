public class MoveableCircle implements Moveable{
    private int radius;
    MoveablePoint center;

    public MoveableCircle(int radius, MoveablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MoveablePoint getCenter() {
        return this.center;
    }

    public void setCenter(MoveablePoint center) {
        this.center = center;
    }

    @Override
    public void moveUp() {
        System.out.println("di len");
    }

    @Override
    public void moveDown() {
        System.out.println("di xuong");
    }

    @Override
    public void moveLeft() {
        System.out.println("di qua trai");
    }

    @Override
    public void moveRight() {
        System.out.println("di qua phai");
    }

    @Override
    public String toString() {
        return "{" +
            " radius='" + getRadius() + "'" +
            ", center='" + getCenter() + "'" +
            "}";
    }
    
}
