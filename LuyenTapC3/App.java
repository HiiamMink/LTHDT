public class App {
    public static void main(String[] args) throws Exception {
        Square hv=new Square();
        hv.setSide(10);
        System.out.println("canh hinh vuong = "+ hv.getSide());
        Rectangle hcn =new Rectangle();
        hcn.setLength(15);
        hcn.setWidth(7);
        System.out.println("dien tich hinh chu nhat la "+hcn.getArea());
    }
}
