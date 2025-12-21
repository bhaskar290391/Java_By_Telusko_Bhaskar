import java.util.Arrays;
import java.util.List;

class ForEachDemo {
    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(47, 4, 7, 9, 6, 2);

        data.forEach(n -> System.out.println(n));
    }
}