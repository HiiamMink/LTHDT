import java.time.LocalDate;
import java.util.Scanner;

public class SinhVien {
    private String masv, hoten;
    private LocalDate ngaysinh;

    public SinhVien() {

    }

    public SinhVien(String masv, String hoten, LocalDate ngaysinh) {
        this.masv = masv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
    }

    public String getMasv() {
        return this.masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return this.hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public LocalDate getNgaysinh() {
        return this.ngaysinh;
    }

    public void setNgaysinh(LocalDate ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma sinh vien: ");
        masv = sc.nextLine();
        System.out.println("nhap ho va ten sinh vien: ");
        hoten = sc.nextLine();
        int ngay, thang, nam;
        do {
            System.out.println("nhap ngay sinh: ");
            ngay = sc.nextInt();
            if (ngay < 0 || ngay > 31) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (ngay < 1 || ngay > 31);
        do {
            System.out.println("nhap thang sinh: ");
            thang = sc.nextInt();
            if (thang < 1 || thang > 12) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (thang < 1 || thang > 12);
        do {
            System.out.println("nhap nam sinh: ");
            nam = sc.nextInt();
            if (nam < 1940 || nam > 2050) {
                System.out.println("khong hop le! nhap lai");
            }
        } while (nam < 1940 || nam > 2050);
        ngaysinh = LocalDate.of(ngay, thang, nam);
    }

    @Override
    public String toString() {
        return "masv: " + getMasv() + ", tensv: "+ getHoten()+ ", ngay sinh: " + getNgaysinh();
    }

}
