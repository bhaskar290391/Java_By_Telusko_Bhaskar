import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamSorting {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(47, 4, 7, 9, 6, 2);

        Stream<Integer> s1 = nums.stream().filter(n -> n % 2 == 0).sorted();

        s1.forEach(n -> System.out.println(n));

    }
}