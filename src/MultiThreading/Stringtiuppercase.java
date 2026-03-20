package MultiThreading;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stringtiuppercase {

    static void main(String[] args) {

        List<String> names= Arrays.asList("Sai","Harshi","shafi");

       List<String> Uppercase =names.stream().map(String :: toUpperCase)
                                .collect(Collectors.toList());

        System.out.println(Uppercase);
    }
}
