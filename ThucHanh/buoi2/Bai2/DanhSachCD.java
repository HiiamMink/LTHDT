import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class DanhSachCD {
    ArrayList<CD> dscd;

    public DanhSachCD() {
        dscd = new ArrayList<>();
    }

    public void themCD(CD cd) {
        cd = new CD();
        cd.nhap();
        boolean kt = false;
        for (CD cd1 : dscd) {
            if (cd1.getMacd() == cd.getMacd()) {
                kt = true;
                break;
            }
        }
        if (kt) {
            System.out.println("ma CD da ton tai!");
        } else {
            dscd.add(cd);
            System.out.println("them thanh cong");
        }
    }

    public int soLuong() {
        return dscd.size();
    }

    public double tongGia() {
        double tong = 0;
        for (CD cd : dscd) {
            tong += cd.getGiaban();
        }
        return tong;
    }

    public void sapXepCDTheoGia() {
        Collections.sort(this.dscd, new Comparator<CD>() {
            @Override
            public int compare(CD o1, CD o2) {
                int i = (int) (o1.getGiaban() - o2.getGiaban());
                if (i < 0) {
                    return -1;
                } else if (i == 0) {
                    return 0;
                }
                return 1;
            }
        });
    }

    public void sapXepCDTheoTen() {
        Collections.sort(this.dscd, new Comparator<CD>() {
            @Override
            public int compare(CD o1, CD o2) {
                int i = o1.getTencd().compareTo(o2.getTencd());
                if (i < 0) {
                    return 1;
                } else if (i == 0) {
                    return 0;
                }
                return -1;
            }
        });
    }

    public void inDSCD() {
        for (CD cd : dscd) {
            System.out.println(cd.toString());
        }
    }

    public void menu() {
        System.out.printf("MENU\n" +
                "0. Thoat\n" +
                "1. Them cd\n" +
                "2. In DSCD\n" +
                "3. So cd hien co\n" +
                "4. Tinh tong gia thanh\n" +
                "5. Sap xep theo gia\n" +
                "6. Sap xep theo ten\n");
    }

}
