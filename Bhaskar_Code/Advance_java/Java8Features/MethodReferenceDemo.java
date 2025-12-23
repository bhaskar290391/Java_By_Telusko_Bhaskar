import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {

        List<String> data = Arrays.asList("Bhaskar", "Mudaliyar", "Kanishk");

        List<String> upperData = data.stream().map(String::toUpperCase).toList();

        upperData.forEach(System.out::println);
    }
}
