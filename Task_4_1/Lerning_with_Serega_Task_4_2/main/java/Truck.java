public class Truck extends Car {
    public  Truck(double size){
        this.size=size;
    }

    public void priсePer100Km(){
        double priсe;
        priсe=size*1.2*27;
        System.out.println(priсe);
    }
}
