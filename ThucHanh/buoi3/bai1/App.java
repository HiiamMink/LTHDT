import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Product p1 = new Product("nuoc tuong", "sp4", 8000);
        Product p2 =new Product("gao", "sp1", 18000);
        Product p3 =new Product("duong", "sp3", 10000);
        Product p4 =new Product("gao", "sp1", 18000);
        OrderDetail o1 = new OrderDetail(p1, 10);
        OrderDetail o2 = new OrderDetail(p2, 5);
        OrderDetail o3 = new OrderDetail(p3, 1);
        OrderDetail o4 = new OrderDetail(p4, 1);
        Order o = new Order();
        o.addLineItem(p1, 10);
        o.addLineItem(p2, 5);
        o.addLineItem(p3, 1);
        o.addLineItem(p4, 1);
        System.out.println("Ma HD: "+o.getOrderID());
        System.out.println("Ngay lap hoa don: "+o.inNgay());
        o.xuatDS();
        System.out.println("Tong tien thanh toan: "+o.calcTotalCharge()+" VND");
    }
}
