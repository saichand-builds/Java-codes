package Codes;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharaters {

    static void main(String[] args) {

        String input = "JavaPrograming";

        Map<Character, Long> result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        result.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(System.out::println);

    }
}
