public class LandRover extends Car {
    public LandRover (){

    }

    public LandRover(int namsx, String hang, String loaixe){
        super(namsx, hang, loaixe);
    }

    @Override
    public void move (){
        System.out.println("day la xe LandRover, toc do toi da 245km/h");
    }
}
