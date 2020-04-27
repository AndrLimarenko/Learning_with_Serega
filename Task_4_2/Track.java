public class Track extends Car {

    public  Track(double size){
        this.size=size;
    }

    @Override
    void priсePer100Km() {
        double priсe;
        priсe=size*1.2*27;
        System.out.println(priсe);
    }
}
