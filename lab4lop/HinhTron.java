import java.util.Scanner;
public class HinhTron extends HinhHoc{
    public float banKinh;
    public HinhTron(){
        ten = "Tron";
    }
    public void nhapBanKinh (){
        System.out.println("nhap ban kinh = ");
        Scanner scanner= new Scanner(System.in);
        banKinh = scanner.nextFloat();
    }
    public void tinhChuVi(){
        chuVi=2*PI*banKinh;
    }
    public void tinhDienTich(){
        dienTich=PI*banKinh*banKinh;
    }
}
