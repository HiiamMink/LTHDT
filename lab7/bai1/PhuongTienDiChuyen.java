abstract class PhuongTienDiChuyen{
    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;
    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat){
        this.loaiPhuongTien=loaiPhuongTien;
        this.hangSanXuat=hangSanXuat;
    }
    public String layTenHangSanXuat(){
        return "ten hang san xuat";
    }
    public void batDau(){
        System.out.println("bat dau di chuyen");
    }
    public void tangToc(){
        System.out.println("tang toc");
    }
    public void dungLai(){
        System.out.println("dung lai");
    }
    abstract double layVanToc();

    @Override
    public String toString() {
        return "{" +
            " loaiPhuongTien='" + loaiPhuongTien + "'" +
            ", tenHangSanXuat='" + hangSanXuat.getTenHangSanXuat() + "'" + 
            ", tenHangSanXuat='" + hangSanXuat.getTenQuocGia() +
            "}";
    }

}