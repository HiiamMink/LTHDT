import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private int count;
    ArrayList<OrderDetail> lineItems;

    public Order(){
        lineItems = new ArrayList<OrderDetail>();
    }

    public LocalDate inNgay(){
        return LocalDate.now();    
    }

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    public int getOrderID() {
        return this.orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public LocalDate getOrderDate() {
        return this.orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<OrderDetail> getLineItems() {
        return this.lineItems;
    }


    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "{" +
                " orderID='" + getOrderID() + "'" +
                ", orderDate='" + getOrderDate() + "'" +
                ", lineItems='" + getLineItems() + "'" +
                ", count='" + getCount() + "'" +
                "}";
    }

    public void addLineItem(Product p, int x) {
        lineItems.add(new OrderDetail(p, x));
    }

    public double calcTotalCharge() {
        double tongtien = 0;
        for (OrderDetail od : lineItems) {
            tongtien += od.calcTotalPrice();
        }
        return tongtien;
    }

    public void xuatDS(){
        System.out.format("%-5s %-10s %-15s %-15s %-15s %-15s\n",
        "STT |",
        "Ma SP |",
        "Mo ta |",
        "Don gia |",
        "So luong |",
        "Thanh tien");
        for(OrderDetail i:lineItems){
            System.out.format("%-5s %-10s %-15s %-15s %-15s %-15s\n",
                lineItems.indexOf(i)+1,
                i.product.getProductID(),
                i.product.getDescription(),
                i.product.getPrice()+" VND",
                i.getQuantity(),
                i.calcTotalPrice() +" VND");
        }
    }
}