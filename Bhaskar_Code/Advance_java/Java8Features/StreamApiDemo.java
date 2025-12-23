import java.util.Arrays;
import java.util.List;

class StreamApiDemo {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(47, 4, 7, 9, 6, 2);

        int result = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (a, b) -> a + b);
        System.out.println("The result ==> " + result);
    }
}