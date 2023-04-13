import java.util.ArrayList;


public class DanhSachChuyenXe {
    ArrayList<ChuyenXe> dscx;

    public DanhSachChuyenXe(){
        this.dscx= new ArrayList<ChuyenXe>();
    }
    
    public DanhSachChuyenXe( ArrayList<ChuyenXe> dscx){
        this.dscx=dscx;
    }

    public void themCX( ChuyenXe chuyenxe){
        dscx.add(chuyenxe);
    }

    public void inDSCX(){
        for (ChuyenXe dscx : dscx);
            System.out.printf(dscx+"\n");
    }
}
