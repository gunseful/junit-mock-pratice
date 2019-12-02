import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.*;

import static org.mockito.Mockito.when;

public class DoublerTest {

    private List<Integer> expected;
    @Mock
    private Fibonacci fibonacci;

    @Before
    public void expectedList() {
        expected = new ArrayList<>(Arrays.asList(2, 2, 4, 6, 10, 16, 26, 42, 68, 110));
    }

    @After
    public void clearList() {
        expected.clear();
    }

    @Test
    public void testDoubleList() {
        Doubler doubler = new Doubler();
        fibonacci = Mockito.mock(Fibonacci.class);
        when(fibonacci.getFibonachi(10)).thenReturn(new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55)));
        List<Integer> actual = doubler.doubleList(fibonacci.getFibonachi(10));
        Assert.assertEquals(expected, actual);
    }
}




