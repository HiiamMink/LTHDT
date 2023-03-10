import java.util.Scanner;
public class HinhChuNhat extends HinhHoc{
    public float dai;
    public float rong;
    public HinhChuNhat(){
        ten = "Chu Nhat";
    }
    public void nhapChieuDai (){
        System.out.println("nhap chieu dai = ");
        Scanner scanner=new Scanner(System.in);
        dai=scanner.nextFloat();
    }
    public void nhapChieuRong(){
        System.out.println("nhap chieu rong = ");
        Scanner scanner=new Scanner(System.in);
        rong=scanner.nextFloat();
    }
    public void tinhChuVi(){
        chuVi=(dai+rong)*2;
    }
    public void tinhDienTich(){
        dienTich=dai*rong;
    }
}
