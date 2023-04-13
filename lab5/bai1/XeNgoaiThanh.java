public class XeNgoaiThanh extends ChuyenXe {
    private String noiden;
    private int songaydiduoc;

    public XeNgoaiThanh() {

    }

    public XeNgoaiThanh(String maso, String hotentaixe, String soxe, String noiden, int songaydiduoc) {
        super(maso, hotentaixe, soxe);
        this.noiden = noiden;
        this.songaydiduoc = songaydiduoc;
    }

    public String getNoiden() {
        return this.noiden;
    }

    public void setNoiden(String noiden) {
        this.noiden = noiden;
    }

    public int getSongaydiduoc() {
        return this.songaydiduoc;
    }

    public void setSongaydiduoc(int songaydiduoc) {
        this.songaydiduoc = songaydiduoc;
    }

    @Override
    public double doanhThu() {
        return this.songaydiduoc * 200;
    }

    @Override
    public String toString() {
        return "{" +
                " noiden='" + getNoiden() + "'" +
                ", songaydiduoc='" + getSongaydiduoc() + "'" +
                "}";
    }

}
