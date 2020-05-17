import org.junit.Assert;
import org.junit.Test;

public class TestClass_x_o {
    @Test
    public void testMethod(){
        boolean res = Task_5_X_O_game.checkIncorrectStringFormat("XOX---mox");
        Assert.assertTrue("incorrect format", res);
    }
}
