public class HocSinhChuyenToan extends HocSinh {
    public HocSinhChuyenToan() {

    }

    public HocSinhChuyenToan(String hoTen, String lop, double toan, double ly, double hoa) {
        super(hoTen, lop, toan, ly, hoa);
    }

    @Override
    public double diemTrungBinh() {
        return (getToan() * 2 + getLy() + getHoa()) / 4;
    }

}
