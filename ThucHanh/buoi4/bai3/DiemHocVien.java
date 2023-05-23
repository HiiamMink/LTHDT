public class DiemHocVien {
    private String hoten;
    private double diem1, diem2, diem3, diem4, diem5;
    private int namsinh;

    public DiemHocVien() {

    }

    public DiemHocVien(String hoten, double diem1, double diem2, double diem3, double diem4, double diem5,
            int namsinh) {
        this.hoten = hoten;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.diem4 = diem4;
        this.diem5 = diem5;
        this.namsinh = namsinh;
    }

    public String getHoten() {
        return this.hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public double getDiem1() {
        return this.diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return this.diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double getDiem3() {
        return this.diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }

    public double getDiem4() {
        return this.diem4;
    }

    public void setDiem4(double diem4) {
        this.diem4 = diem4;
    }

    public double getDiem5() {
        return this.diem5;
    }

    public void setDiem5(double diem5) {
        this.diem5 = diem5;
    }

    public int getNamsinh() {
        return this.namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public double diemTB() {
        return (diem1 + diem2 + diem3 + diem4 + diem5) / 5;
    }

    public void danhGia() {
        if (diemTB() >= 7) {
            if (diem1 >= 5 && diem2 >= 5 && diem3 >= 5 && diem4 >= 5 && diem5 >= 5) {
                System.out.println("duoc lam luan van");
            } else if (diem1 < 5 || diem2 < 5 || diem3 < 5 || diem4 < 5 || diem5 < 5) {
                System.out.println("thi lai");
            }
        }
        if (diemTB() < 7) {
            if (diem1 >= 5 && diem2 >= 5 && diem3 >= 5 && diem4 >= 5 && diem5 >= 5) {
                System.out.println("duoc thi tot nghiep");
            }
            if (diem1 < 5 || diem2 < 5 || diem3 < 5 || diem4 < 5 || diem5 < 5) {
                System.out.println("thi lai");
            }
        }
    }

    @Override
    public String toString() {
        return "{" +
                " hoten='" + getHoten() + "'" +
                ", diem1='" + getDiem1() + "'" +
                ", diem2='" + getDiem2() + "'" +
                ", diem3='" + getDiem3() + "'" +
                ", diem4='" + getDiem4() + "'" +
                ", diem5='" + getDiem5() + "'" +
                ", namsinh='" + getNamsinh() + "'" +
                "}";
    }

}