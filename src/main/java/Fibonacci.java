import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public List<Integer> list;

    public Integer calc(Integer n) {
        if (n < 2) {
            return 1;
        } else {
            return calc(n - 2) + calc(n - 1);
        }
    }

    public List<Integer> getFibonachi(Integer a) {
        if(a<0){
            throw new IllegalArgumentException();
        }
        int first = 0;
        list = new ArrayList<>();
        while (first < a) {
            list.add(calc(first++));
        }
        return list;
    }
}
