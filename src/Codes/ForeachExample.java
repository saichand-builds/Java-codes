package Codes;

import java.util.Arrays;
import java.util.List;

public class ForeachExample {

    static void main(String[] args) {
        // collection of Array elements
        List<String> names = Arrays.asList("Sai", "harshi", "Shafi");

       // Lambda Expression
        names.forEach(name -> System.out.println(name));

        // Method Reference
        names.forEach(System.out::println);
    }
}
