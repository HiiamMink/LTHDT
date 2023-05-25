import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DanhSach {
    private ArrayList<KhachHang> dskh;
    private ArrayList<KhachHang> dsmv;

    public DanhSach() {
        dskh = new ArrayList<>();
    }

    public void themKhachHang(KhachHang kh) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("nhap lan thu " + i);
            kh = new KhachHang();
            kh.nhap();
            dskh.add(kh);
        }

    }

    public void banVe(String cmnd) {
        for (KhachHang kh : dskh) {
            if (kh.getCmnd().equals(cmnd)) {
                System.out.println("ban ve cho khach hang " + kh.getTen() + " thanh cong");
                dskh.remove(kh);
                dsmv.add(kh);
                return;
            }
        }
        System.out.println("khong tim thay khach hang co cmnd " + cmnd + " nay");
    }

    public void inDSKH() {
        if (dskh.isEmpty()) {
            System.out.println("danh sach khach hang trong");
            return;
        }
        System.out.println("danh sach khach hang:");
        for (KhachHang kh : dskh) {
            System.out.println(kh.toString());
        }
    }

    public void huyKhachHang(String cmnd) {
        for (KhachHang kh : dskh) {
            if (kh.getCmnd().equals(cmnd)) {
                dskh.remove(kh);
                System.out.println("huy khach hang " + kh.getTen() + " thanh cong");
                return;
            }
        }
        System.out.println("khong tim thay khach hang co cmnd " + cmnd + " nay");
    }

    public void inDSCacGaChoMuaVe() {
        Set<String> cacgachomuave = new HashSet<>();
        for (KhachHang kh : dskh) {
            cacgachomuave.add(kh.getGaden());
        }

        if (cacgachomuave.isEmpty()) {
            System.out.println("khong co ga nao dang cho mua ve");
        } else {
            System.out.println("danh sach cac ga dang cho ve:");
            for (String ga : cacgachomuave) {
                System.out.println(ga);
            }
        }
    }

    public void thongKe() {
        double tong = 0;
        System.out.println("co " + dskh.size() + " khach hang dang cho nhan ve");
        System.out.println("co " + dsmv.size() + " da nhan duoc ve");
        for (KhachHang kh : dsmv) {
            tong += kh.getGiatien();
        }
        System.out.println("tong doanh thu la: " + tong);
    }

    public void luuDSVaoFile(String tenfile) {
        try {
            FileOutputStream fos = new FileOutputStream(tenfile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dskh);
            oos.close();
            fos.close();
            System.out.println("luu thanh cong");
        } catch (IOException e) {
            System.out.println("loi: " + e.getMessage());
        }
    }

    public void laydulieu() {
        try (BufferedReader br = new BufferedReader(new FileReader("danhsach.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String cmnd = parts[0];
                    String ten = parts[1];
                    String gaden = parts[2];
                    double giatien = Double.parseDouble(parts[4]);
                    KhachHang kh = new KhachHang(cmnd, ten, gaden, giatien);
                    dskh.add(kh);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void menu() {
        System.out.printf("MENU\n" +
                "0. Thoat\n" +
                "1. Them 1 khach hang vao hang doi mua ve\n" +
                "2. Ban 1 ve cho khach hang\n" +
                "3. In danh sach khach hang\n" +
                "4. Huy 1 khach hang ra khoi danh sach\n" +
                "5. Thong ke\n" +
                "6. Luu danh sach vao file\n" +
                "7. Hien thi cac ga dang cho mua ve\n");
    }
}
