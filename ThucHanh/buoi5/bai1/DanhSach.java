import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSach {
    ArrayList<PhongHoc> ds;

    public DanhSach() {
        ds = new ArrayList<>();
    }

    public void them(PhongHoc ph) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Lan nhap thu " + i + ": ");
            if (ph instanceof PhongHocLyThuyet) {
                ph = new PhongHocLyThuyet();
                ph.nhap();
            } else if (ph instanceof PhongMayTinh) {
                ph = new PhongMayTinh();
                ph.nhap();
            } else if (ph instanceof PhongThiNghiem) {
                ph = new PhongThiNghiem();
                ph.nhap();
            }
            ds.add(ph);
        }
    }

    public void inDSPhongHoc() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach rong!");
        } else {
            System.out.println("Danh sach phong hoc: ");
            for (PhongHoc ph : ds) {
                System.out.println(ph);
            }
        }
    }

    public void inPhongMay60May() {
        boolean phongco60may = false;
        System.out.println("Danh sach phong co 60 may: ");
        for (PhongHoc ph : ds) {
            if (ph instanceof PhongMayTinh && ((PhongMayTinh) ph).getSomaytinh() == 60) {
                System.out.println(ph);
                phongco60may = true;
            }
        }
        if (!phongco60may) {
            System.out.println("khong co phong nao co 60 may");
        }
    }

    public void inDSPhongHocDatChuan() {
        boolean phonghocdatchuan = false;
        System.out.println("danh sach phong hoc dat chuan: ");
        for (PhongHoc ph : ds) {
            if (ph.datChuan()) {
                System.out.println(ph);
                phonghocdatchuan = true;
            }
        }
        if (!phonghocdatchuan) {
            System.out.println("khong co phong hoc nao dat tieu chuan");
        }
    }

    public void sapXepTheoDayNha() {
        Collections.sort(this.ds, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc ph1, PhongHoc ph2) {
                int i = ph1.getSodaynha() - ph2.getSodaynha();
                if (i < 0) {
                    return -1;
                } else if (i == 0) {
                    return 0;
                }
                return 1;
            }
        });
    }

    public void sapXepTheoDienTichGiamDan() {
        Collections.sort(this.ds, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc ph1, PhongHoc ph2) {
                int i = (int) ph1.getDientich() - (int) ph2.getDientich();
                if (i < 0) {
                    return 1;
                } else if (i == 0) {
                    return 0;
                }
                return -1;
            }
        });
    }

    public void sapXepTheoSoBongDenTangDan() {
        Collections.sort(this.ds, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc ph1, PhongHoc ph2) {
                int i = ph1.getBongden() - ph2.getBongden();
                if (i < 0) {
                    return -1;
                } else if (i == 0) {
                    return 0;
                }
                return 1;
            }
        });
    }

    public void capNhatSoMayTinh(String maph, int somaytinh) {
        PhongHoc ph = timPhongHoc(maph);
        if (ph != null && ph instanceof PhongMayTinh) {
            ((PhongMayTinh) ph).setSomaytinh(somaytinh);
            System.out.println("cap nhat thanh cong");
        } else {
            System.out.println("khong tim thay ma phong tuong ung");
        }
    }

    public void xoaPhongHoc(String maph) {
        PhongHoc ph = timPhongHoc(maph);
        if (ph != null) {
            ds.remove(ph);
            System.out.println("Xoa thanh cong");
        } else {
            System.out.println("Khong tim thay phong hoc nay");
        }
    }

    public int soLuongPhongHoc() {
        return ds.size();
    }

    public PhongHoc timPhongHoc(String maph) {
        for (PhongHoc ph : ds) {
            if (ph.getMaphong() == maph) {
                return ph;
            }
        }
        System.out.println("khong tim thay phong hoc nay");
        return null;
    }

    public void menu() {
        System.out.println("MENU\n" +
                "0. Thoat\n " +
                "1. Them phong hoc\n " +
                "2. Tim kiem phong hoc\n " +
                "3. In danh sach\n " +
                "4. In danh sach cac phong dat chuan\n " +
                "5. Sap xep tang dan theo day nha\n " +
                "6. Sap xep giam dan theo dien tich\n " +
                "7. Sap xep tang dan theo so bong den\n " +
                "8. Cap nhat so may tinh cho phong may\n " +
                "9. Xoa phong hoc\n " +
                "10. In tong so phong hoc\n " +
                "11. In danh sach cac phong may co 60 may\n");
    }
}
