import java.util.Arrays;
import java.util.List;

public class OptionalDemo {
    public static void main(String[] args) {

        List<String> data = Arrays.asList("Bhaskar", "Lakshmi", "Soni", "Sammy");

        String result = data.stream().filter(str -> str.contains("x")).findFirst().orElse("Not Found");

        System.out.println("The result ==>" + result);
    }
}
