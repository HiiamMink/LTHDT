import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSach {
    ArrayList<Double> ds;

    public DanhSach() {
        ds = new ArrayList<>();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Double x = sc.nextDouble();
            ds.add(x);
            System.out.println("nhap them (Y/N)?");
            if (sc.nextLine().equals("N")) {
                break;
            }
        }
    }

    public void xuat() {
        for (Double i : ds) {
            System.out.println(i + "\t");
        }
    }
}