import java.util.ArrayList;
import java.util.List;

class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> datas = new ArrayList<>();
        datas.add(8);
        datas.add(5);
        datas.add(16);
        datas.add(1);

        System.out.println("The value at index 2 ==> " + datas.get(2));

        System.out.println("Check the index value of 5 ==> " + datas.indexOf(5));

        for (Integer data : datas) {
            System.out.println("The Data is " + data);
        }
    }
}