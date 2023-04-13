
public class App {
    public static void main(String[] args) throws Exception {
        Circle ht1= new Circle(4,"red");
        Cylinder c1= new Cylinder(5, "blue", 9);
        System.out.println(c1.getVolume());
        System.out.println(ht1.getArea());
    }
}
