import java.util.ArrayList;

public class DanhSach {
    ArrayList<DiemHocVien> ds;

    public DanhSach() {
        ds = new ArrayList<>();
    }

    public void them(DiemHocVien dhv) {
        ds.add(dhv);
    }

    public void demSoLuong() {
        int luanvan = 0, totnghiep = 0, thilai = 0;
        for (DiemHocVien dhv : ds) {
            if (dhv.diemTB() >= 7 && dhv.getDiem1() >= 5 && dhv.getDiem2() >= 5 && dhv.getDiem3() >= 5
                    && dhv.getDiem4() >= 5 && dhv.getDiem5() >= 5) {
                luanvan++;
            }
            if (dhv.diemTB() < 7 && dhv.getDiem1() >= 5 && dhv.getDiem2() >= 5 && dhv.getDiem3() >= 5
                    && dhv.getDiem4() >= 5 && dhv.getDiem5() >= 5) {
                totnghiep++;
            }
            if (dhv.getDiem1() < 5 || dhv.getDiem2() < 5 || dhv.getDiem3() < 5 || dhv.getDiem4() < 5
                    || dhv.getDiem5() < 5) {
                thilai++;
            }
        }
        System.out.println("co " + luanvan + " hoc vien duoc lam luan van");
        System.out.println("co " + totnghiep + " hoc vien duoc thi tot nghiep");
        System.out.println("co " + thilai + " hoc vien thi lai");
    }
}
