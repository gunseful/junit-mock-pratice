import java.util.List;
import java.util.stream.Collectors;

public class Doubler {
    public int doubleInt(int i){
        return i*2;
    }
    public List<Integer> doubleList(List<Integer> list){
        return list.stream().map(this::doubleInt).collect(Collectors.toList());
    }
}
