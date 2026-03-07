package Codes;

import java.util.stream.IntStream;

public class ThirdIndex {

    static void main(String[] args) {

        String name = "Saachand";
        int index = IntStream.range(0, name.length())
                .filter(i -> name.charAt(i) == 'a' || name.charAt(i) == 'A')
                .skip(2)
                .findFirst()
                .orElse(-1);
        System.out.println(index);

    }
}
