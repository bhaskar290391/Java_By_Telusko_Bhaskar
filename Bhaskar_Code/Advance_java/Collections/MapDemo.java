import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, Integer> data = new HashMap<>();
        data.put("Bhaskar", 56);
        data.put("Babu", 89);
        data.put("kanishk", 45);
        data.put("sammy", 78);

        System.out.println("The Map Object : " + data);

        for (String key : data.keySet()) {
            System.out.println(key + " value is ==> " + data.get(key));
        }
    }
}
