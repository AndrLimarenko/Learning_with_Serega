import org.junit.Test;

public class MainClassTest {
    @Test
    public void testMethod(){
        Man man = new Man(100, 190);
        man.imtCalcuation();

        Woman woman = new Woman(75, 205);
        woman.imtCalcuation();

        Boy boy = new Boy(35, 130);
        boy.imtCalcuation();

        Girl girl = new Girl(55, 110);
        girl.imtCalcuation();
    }


}