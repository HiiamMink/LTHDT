import java.util.ArrayList;

public class DanhSachGiaoDich {
    ArrayList<GiaoDich> dsgd;

    public DanhSachGiaoDich() {
        this.dsgd = new ArrayList<GiaoDich>();
    }

    public DanhSachGiaoDich(ArrayList<GiaoDich> dsgd) {
        this.dsgd = dsgd;
    }

    public void themGD(GiaoDich gd) {
        dsgd.add(gd);
    }

    public void inDS() {
        for (GiaoDich ds : dsgd) {
            System.out.println(dsgd + "\n");
        }
    }
}
