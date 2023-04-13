public class SBI extends Bank {
    public SBI(){

    }

    public SBI(double laisuat, String ten){
        super(laisuat, ten);
    }

    @Override
    public void xemThongTin(){
        System.out.println("ngan hang SBI co lai suat la 6%");
    }
}
