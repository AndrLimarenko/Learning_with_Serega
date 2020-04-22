public class ElectroCar extends PassengerCar {
    double power;
    public ElectroCar(double size, double power) {
        super(size);
        this.power=power;
    }
@Override
    public void priсePer100Km(){
        double priсe;
        priсe=size*power*2.5;
        System.out.println(priсe);
    }
}
