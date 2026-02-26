package Codes;

import java.util.Map;
import java.util.stream.Collectors;

public class CharsFrequency {

    static void main(String[] args) {

        String Str="Hello WWorld";
                    // chars()  convert IntStream
        Map<Character, Long> freq = Str.chars()
                .mapToObj(c-> (char)c)
                        .collect(Collectors.groupingBy(
                                c->c ,Collectors.counting()
                        ));
        System.out.println(freq);


    }
}
