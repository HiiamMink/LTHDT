public class AXIS extends Bank{
    public AXIS(){

    }

    public AXIS(double laisuat, String ten){
        super(laisuat, ten);
    }

    @Override
    public void xemThongTin(){
        System.out.println("ngan hang AXIS co lai suat la 8%");
    }
    
}
