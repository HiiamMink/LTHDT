public class App {
    public static void main(String[] args) throws Exception {
        MoveableCircle mc = new MoveableCircle(4, new MoveablePoint(2, 3, 10, 15));
        System.out.println(mc.toString());
        mc.moveUp();
        mc.moveDown();
        mc.moveLeft();
        mc.moveRight();
    }
}
