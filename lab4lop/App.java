public class App {
    public static void main(String[] args) throws Exception {
        //HinhTron
        HinhTron ht= new HinhTron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhDienTich();
        ht.tinhChuVi();
        ht.inDienTich();
        ht.inChuVi();
        //HinhVuong
        HinhVuong hv= new HinhVuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhDienTich();
        hv.tinhChuVi();
        hv.inChuVi();
        hv.inDienTich();
    }
}
