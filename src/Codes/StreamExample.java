package Codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 4, 5, 7, 3, 1, 2, 6, 8, 80);

        List<Integer> evenNumbers = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);

    }
}
