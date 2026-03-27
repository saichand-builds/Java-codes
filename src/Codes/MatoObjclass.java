package Codes;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatoObjclass {

    static void main(String[] args) {

        Stream<String> result= IntStream.range(0,5)

                .mapToObj(i->"Number :"+i);

        result.forEach(System.out::println);
    }
}
