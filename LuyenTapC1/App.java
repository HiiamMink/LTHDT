public class App {
    public static void main(String[] args) throws Exception {
        CamCaoPhong ccp = new CamCaoPhong();
        ccp.setGia(20.000);
        ccp.setSoluong(3);
        ccp.setNguon("Viet Nam");
        System.out.println("cam cao phong nay nhap tu "+ccp.getNguon());
        System.out.println(ccp.getSoluong()+"kg cam cao phong la "+ccp.tinhTien()+" ngan dong");
    }
}
