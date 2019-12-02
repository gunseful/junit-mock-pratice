import org.junit.Test;
import junit.framework.Assert;

public class MathTest {

    @Test
    public void testEquals() {
        Assert.assertEquals(4, 2 + 2);
        Assert.assertTrue(4 == 2 + 2);
    }

    @Test(timeout = 1000)
    public void testTimeOut() throws InterruptedException {
        while (true){
            System.out.println("something");
            Thread.sleep(500);
            return;
        }
    }
    //should be failed
    @Test(timeout = 1000)
    public void testTimeOutTwo() throws InterruptedException {
        while (true){
            System.out.println("something");
            Thread.sleep(1500);
            return;
        }
    }
}

