import org.junit.BeforeClass;
import org.junit.Test;

public class MainClassTest {
    @Test
  public void testMethod(){
       Man man = new Man(100, 190);
       man.imtManCalcuation();

       Woman woman = new Woman(45, 170);
       woman.imtWomanCalcuation();

       Boy boy = new Boy(35, 120);
       boy.imtManCalcuation();

       Girl girl = new Girl(55, 100);
       girl.imtWomanCalcuation();
   }


}
