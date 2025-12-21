package Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
Working with Collections in Java: Remove Duplicates and Display in Order

Instructions:
You are provided with a list of names in the starter file. Your task is to:

Use the given list of names stored in a List<String>.

Remove duplicates using a Set.

Print the original list and the list after removing duplicates.



Expected Output (order may vary for Set):

  Original List:  [Alice, Bob, Alice, David, Bob] 

  Unique Names:  [Alice, Bob, David]
*/
public class CollectionCodingExercise {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");

        Set<String> uniqueName = new TreeSet<>();

        for (String data : names) {
            uniqueName.add(data);
        }

        System.out.println("Original List: " + names);
        System.out.println("Unique Names: " + uniqueName);
    }
}
