package Codes;

import java.util.List;

public class Uppercase {

    static void main(String[] args) {

        List<String> list=List.of("a","b","c","d");

        list.stream()

                .map(s->s.toUpperCase())

                .forEach(System.out::print);
    }
}
