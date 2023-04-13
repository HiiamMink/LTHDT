public class Bank {
    private String ten;
    private double laisuat;

    public Bank() {

    }

    public Bank(double laisuat, String ten) {
        this.laisuat = laisuat;
        this.ten = ten;
    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getLaisuat() {
        return this.laisuat;
    }

    public void setLaisuat(double laisuat) {
        this.laisuat = laisuat;
    }

    public void xemThongTin(){
        System.out.println("moi ngan hang deu co lai suat rieng");       
    }

}