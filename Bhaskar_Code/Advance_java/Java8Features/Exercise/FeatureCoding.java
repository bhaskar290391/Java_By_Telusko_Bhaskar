package Exercise;

import java.util.Arrays;
import java.util.List;

/*

You are given a list of product names. Your task is to:

Use Java Stream API to:

Filter product names that are longer than 5 characters.

Convert the filtered names to uppercase.

Sort them alphabetically.

Print:

The original list of product names.

The filtered, uppercased, and sorted list.



Instructions:

Use filter, map, sorted, and collect with Stream.

Use method references where appropriate.

Keep the solution simple and readable.



Expected Output:

Original List:  [Laptop, Pen, Notebook, Headphones, Smartphone]

  Filtered Products:  [HEADPHONES, LAPTOP, NOTEBOOK, SMARTPHONE]

*/

public class FeatureCoding {
    public static void main(String[] args) {

        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");

        System.out.println("Original List: " + products);

        List<String> filtersData = products.stream().filter(str -> str.length() > 5).map(String::toUpperCase).sorted()
                .toList();

        System.out.println("Filtered Products: " + filtersData);

    }

}
