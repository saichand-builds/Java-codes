package Codes;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Range {

    static void main(String[] args) {

        List<String> list = IntStream.rangeClosed(80, 100)

                /// mapToObj  is  a Method in java stream api used
                ///  to convert the primitive stream to an object stream

                ///  valueOf  is used inside the mapToObj to convert
                ///  primitve into wrapper objects or string

                .mapToObj(String::valueOf)
                .collect(Collectors.toList());
                System.out.println(list);
    }
}
