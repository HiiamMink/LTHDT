public class XeDap extends PhuongTienDiChuyen{
    public XeDap(String loaiNhienLieu, HangSanXuat hangSanXuat){
        super(loaiNhienLieu, hangSanXuat);
    }
    
    @Override
    public double layVanToc(){
        return 200;
    }

}
