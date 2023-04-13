public class Ford extends Car {
    public Ford(){

    }

    public Ford(int namsx, String hang, String loaixe){
        super(namsx, hang, loaixe);
    }

    @Override
    public void move(){
        System.out.println("day la xe Ford, toc do chay toi da la 200km/h");
    }
}
