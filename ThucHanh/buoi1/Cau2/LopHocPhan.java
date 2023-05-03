import java.util.ArrayList;

public class LopHocPhan {
    ArrayList<SinhVien> dssv;
    private String malh, tenlh, tengv, thongtinlh;

    public LopHocPhan() {
        dssv = new ArrayList<>();
    }

    public LopHocPhan(ArrayList<SinhVien> sv) {
        this.dssv = sv;
    }

    public LopHocPhan(String malh, String tenlh, String tengv, String thongtinlh) {
        this.malh = malh;
        this.tenlh = tengv;
        this.tengv = tengv;
        this.thongtinlh = thongtinlh;
    }

    public ArrayList<SinhVien> getDssv() {
        return this.dssv;
    }

    public void setDssv(ArrayList<SinhVien> dssv) {
        this.dssv = dssv;
    }

    public String getMalh() {
        return this.malh;
    }

    public void setMalh(String malh) {
        this.malh = malh;
    }

    public String getTenlh() {
        return this.tenlh;
    }

    public void setTenlh(String tenlh) {
        this.tenlh = tenlh;
    }

    public String getTengv() {
        return this.tengv;
    }

    public void setTengv(String tengv) {
        this.tengv = tengv;
    }

    public String getThongtinlh() {
        return this.thongtinlh;
    }

    public void setThongtinlh(String thongtinlh) {
        this.thongtinlh = thongtinlh;
    }

    public void themSV(SinhVien sv) {
        dssv.add(sv);
    }

    @Override
    public String toString() {
        return "Ma LHP: " + malh + "\n" +
                "Ten LHP: " + tenlh + "\n" +
                "GV giang day: " + tengv + "\n" +
                "Thong tin buoi hoc: " + thongtinlh + "\n";
    }

    public int soLuong() {
        return dssv.size();
    }

    public void xuatDS() {
        System.out.println("Danh sach sinh vien");
        for (SinhVien sv : dssv) {
            System.out.format("%-10s %-20s\n",
                    sv.getMasv() + "|",
                    sv.getHoten());
        }

    }
}