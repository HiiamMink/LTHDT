public class ICICI extends Bank {
    public ICICI(){

    }

    public ICICI(double laisuat, String ten){
        super(laisuat, ten);
    }

    @Override
    public void xemThongTin(){
        System.out.println("ngan hang ICICI co lai suat la 7%");
    }
}
