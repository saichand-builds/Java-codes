package Codes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapExample {

    static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5, 8, 7, 10, 7, 4, 5, 2);

        Map<Integer, Long> result = numbers.stream()
                .collect(
                        Collectors.groupingBy(
                                num -> num,
                                Collectors.counting()
                        )
                );
        System.out.println(result);

    }
}
