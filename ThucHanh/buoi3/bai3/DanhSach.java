import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class DanhSach {
    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> dssv;

    public DanhSach() {
        dssv = new ArrayList<>();
    }

    public void them() {
        SinhVien sv = new SinhVien();
        sv.nhap();
        boolean kt = false;
        for (SinhVien sv1 : dssv) {
            if (sv1.getMasv() == sv.getMasv()) {
                kt = true;
                break;
            }
        }
        if (kt) {
            System.out.println("ma CD da ton tai!");
        } else {
            dssv.add(sv);
            System.out.println("them thanh cong");
        }
    }

    public void hienDS() {
        System.out.println(
                "|---------------|------------------------------|------------------------------|--------------------|--------------------|--------------------|--------------------|");
        System.out.format("%-15s %-30s %-30s \n",
                "| Ma SV",
                "| Ten SV",
                "| Ngay Sinh",
                "|");
        System.out.println(
                "|---------------|------------------------------|------------------------------|--------------------|--------------------|--------------------|--------------------|");
        for (SinhVien sv : dssv) {
            if (sv instanceof SinhVien) {
                System.out.format("%-15s %-30s %-30s\n",
                        "| " + sv.getMasv(),
                        "| " + sv.getHoten(),
                        "| " + sv.getNgaysinh(),
                        "|");
                System.out.println(
                        "|---------------|------------------------------|------------------------------|--------------------|--------------------|--------------------|--------------------|");
            }
        }
    }

    public void xoa() {
        int n;
        do {
            menuXoa();
            n = sc.nextInt();
            if (n == 1) {
                System.out.println("nhap ma sinh vien can xoa: ");
                String masv = sc.nextLine();
                xoaTheoMasv(masv);
            } else if (n == 2) {
                xoaHet();
            }
        } while (n != 0);
    }

    public void xoaTheoMasv(String masv) {
        Iterator<SinhVien> iterator = dssv.iterator();
        while (iterator.hasNext()) {
            SinhVien sv = iterator.next();
            if (sv.getMasv().equalsIgnoreCase(masv)) {
                iterator.remove();
                System.out.println("Da xoa ma sinh vien: " + masv);
                return;
            }
        }
        System.out.println("Khong tim thay ma sinh vien: " + masv);
    }

    public void xoaHet() {
        dssv.clear();
        System.out.println("Da xoa tat ca");
    }

    public void sua(String masv) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        Iterator<SinhVien> iterator = dssv.iterator();
        while (iterator.hasNext()) {
            SinhVien sv = iterator.next();
            if (sv.getMasv().equalsIgnoreCase(masv)) {
                if (sv instanceof SinhVien) {
                    SinhVien sv1 = (SinhVien) sv;
                    String hoten;
                    System.out.println("nhap ho ten sinh vien: ");
                    hoten = sc.nextLine();
                    sv1.setHoten(hoten);
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
                    LocalDate ngaysinh = LocalDate.of(ngay, thang, nam);
                    sv1.setNgaysinh(ngaysinh);
                    found = true;
                    System.out.println("Sua thong tin thanh cong!");
                }
            }
        }
        if (!found) {
            System.out.println("Khong tim thay masv can sua!");
        }
    }

    public void tim() {
        int n;
        do {
            menuTim();
            n = sc.nextInt();
            if (n == 1) {
                System.out.println("nhap ma sinh vien can tim: ");
                String masv = sc.nextLine();
                timTheoMaSV(masv);
            } else if (n == 2) {
                System.out.println("nhap ho va ten sinh vien can tim: ");
                String hoten = sc.nextLine();
                timTheoHoTenSV(hoten);
            }
        } while (n != 0);
    }

    public void timTheoMaSV(String masv) {
        System.out.println(
                "|------------------------------|------------------------------|--------------------|--------------------|--------------------|---------------|");
        System.out.format("%-30s %-30s %-20s\n",
                "| Ma SV",
                "| Ten SV",
                "| Ngay Sinh",
                "|");
        System.out.println(
                "|------------------------------|------------------------------|--------------------|--------------------|--------------------|---------------|");

        for (SinhVien sv : dssv) {
            if (sv.getMasv().contains(masv)) {
                System.out.format("%-30s %-30s %-20s \n",
                        "| " + sv.getMasv(),
                        "| " + sv.getHoten(),
                        "| " + sv.getNgaysinh(),
                        "|");
                System.out.println(
                        "|------------------------------|------------------------------|--------------------|--------------------|--------------------|---------------|");
            }
        }
    }

    public void timTheoHoTenSV(String hoten) {
        System.out.println(
                "|------------------------------|------------------------------|--------------------|--------------------|--------------------|---------------|");
        System.out.format("%-30s %-30s %-20s\n",
                "| Ma SV",
                "| Ten SV",
                "| Ngay Sinh",
                "|");
        System.out.println(
                "|------------------------------|------------------------------|--------------------|--------------------|--------------------|---------------|");

        for (SinhVien sv : dssv) {
            if (sv.getHoten().contains(hoten)) {
                System.out.format("%-30s %-30s %-20s \n",
                        "| " + sv.getMasv(),
                        "| " + sv.getHoten(),
                        "| " + sv.getNgaysinh(),
                        "|");
                System.out.println(
                        "|------------------------------|------------------------------|--------------------|--------------------|--------------------|---------------|");
            }
        }
    }

    public void sapXepTheoMaSV() {
        Collections.sort(this.dssv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                int i = o1.getMasv().compareTo(o2.getMasv());
                if (i < 0) {
                    return 1;
                } else if (i == 0) {
                    return 0;
                }
                return -1;
            }
        });
    }

    public void menuXoa() {
        System.out.print("MENU\n" +
                "0. Thoat\n" +
                "1. Xoa theo masv\n" +
                "2. Xoa het" +
                "Nhap lua chon: ");
    }

    public void menuTim() {
        System.out.print("MENU\n" +
                "0. Thoat\n" +
                "1. Tim kiem theo masv\n" +
                "2. Tim kiem theo tensv" +
                "Nhap lua chon: ");
    }

    public void menu() {
        System.out.println("MENU\n"
                + "0. Thoat\n"
                + "1. Them sinh vien\n"
                + "2. Hien danh sach\n"
                + "3. Xoa\n"
                + "4. Sua\n"
                + "5. Tim\n");
    }

}