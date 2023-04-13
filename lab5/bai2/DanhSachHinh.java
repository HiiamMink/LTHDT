import java.util.ArrayList;

public class DanhSachHinh {
    ArrayList<Hinh> h;

    public DanhSachHinh() {
        this.h = new ArrayList<Hinh>();
    }

    public DanhSachHinh(ArrayList<Hinh> h) {
        this.h = h;
    }

    public void themHinh(Hinh hinh) {
        h.add(hinh);
    }

    public void inDanhSach() {
        for (Hinh h : h)
            System.out.println(h + "\n");
    }
}
