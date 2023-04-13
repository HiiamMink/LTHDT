public class MoveablePoint implements Moveable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getXSpeed() {
        return this.xSpeed;
    }

    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getYSpeed() {
        return this.ySpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
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
                " x='" + getX() + "'" +
                ", y='" + getY() + "'" +
                ", xSpeed='" + getXSpeed() + "'" +
                ", ySpeed='" + getYSpeed() + "'" +
                "}";
    }

}
