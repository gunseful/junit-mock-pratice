import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;


public class FibonacciTest {

    private List<Integer> expected;
    private Fibonacci fibonacci = new Fibonacci();


    @Before
    public void expectedList() {
        expected = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55));
    }

    @After
    public void clearList() {
        expected.clear();
    }

    @Test
    public void testFibonacci() {
        List<Integer> actual = fibonacci.getFibonachi(10);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegative() {
        fibonacci = new Fibonacci();
        fibonacci.getFibonachi(-1);
    }
}




