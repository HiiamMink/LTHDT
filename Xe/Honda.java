public class Honda extends Car {
    public Honda(){

    }

    public Honda(int namsx, String hang, String loaixe){
        super(namsx, hang, loaixe);
    }
    
    @Override
    public void move(){
        System.out.println("day la xe Honda, toc do chay toi da 125km/h");
    }
}
