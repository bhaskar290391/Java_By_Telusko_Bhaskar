import java.util.Arrays;
import java.util.List;

class Student {

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class ConstructorReference {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Bhaskar", "Mudaliyar", "Kanishk");

        List<Student> students = data.stream().map(Student::new).toList();

        System.out.println(students);
    }
}
