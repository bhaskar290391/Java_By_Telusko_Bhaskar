import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    private int age;
    private String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student[age:" + age + ", name: " + name + "]";
    }

    @Override
    public int compareTo(Student o) {

        if (this.age > o.age) {
            return 1;
        } else {
            return -1;
        }
    }

}

public class ComparatorDemo1 {
    public static void main(String[] args) {

        Comparator<Integer> myComp = (a, b) -> {

            if (a % 10 > b % 10) {
                return 1;
            } else {
                return -1;
            }
        };

        List<Integer> data = new ArrayList<>();
        data.add(43);
        data.add(21);
        data.add(74);
        data.add(32);

        Collections.sort(data, myComp);

        System.out.println(data);

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(29, "Bhaskar"));
        studs.add(new Student(10, "Kanishk"));
        studs.add(new Student(20, "Sammy"));
        studs.add(new Student(27, "Soni"));

        Collections.sort(studs);
        System.out.println(studs);

    }
}
