import org.junit.Test;

public class ClassTest {
    @Test
    public void testMeth(){
        PassengerCar litecar = new PassengerCar(2);
        litecar.priсePer100Km();

        Track eurotrask = new Track(12);
        eurotrask.priсePer100Km();

        ElectroCar electroCar = new ElectroCar(0.1, 150);
        electroCar.priсePer100Km();

    }
}
