import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<Integer> datas = new TreeSet<>();
        datas.add(8);
        datas.add(5);
        datas.add(7);
        datas.add(16);
        datas.add(1);

        Iterator iterator = datas.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(datas);
    }
}
