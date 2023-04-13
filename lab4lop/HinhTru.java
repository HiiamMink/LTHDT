import java.util.Scanner;
public class HinhTru extends HinhTron{
    public float chieuCao;
    public HinhTru(){
        ten = "Tru";
    }
    public void nhapChieuCao(){
        System.out.println("nhap chieu cao = ");
        Scanner scanner=new Scanner(System.in);
        chieuCao=scanner.nextFloat();
    }
    public void tinhTheTich (){
        theTich = chieuCao * dienTich ;
    }
}
