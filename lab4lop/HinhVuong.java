import java.util.Scanner;

import javax.security.sasl.SaslClientFactory;

import java.util.Scanner;
public class HinhVuong extends HinhChuNhat{
    public HinhVuong(){
        ten = "Vuong";
    }
    public void nhapCanh(){
        System.out.println("nhap canh = ");
        Scanner scanner= new Scanner(System.in);
        dai = rong = scanner.nextFloat();
    }
}
