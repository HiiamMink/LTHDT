import java.util.Scanner;

public class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;

    public MayBay(String loaiPhuongTien, HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super(loaiPhuongTien, hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh() {
        System.out.println("cat canh");
    }

    public void haCanh() {
        System.out.println("ha canh");
    }

    @Override
    public double layVanToc() {
        return 300;
    }

}
