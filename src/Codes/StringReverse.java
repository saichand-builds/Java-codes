package Codes;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringReverse {

    static void main(String[] args) {

        String str= "Saichand Java Backend Developer";

        String rev= Arrays.stream(str.split( " "))
                .map(n->new StringBuilder(n).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("rev " + rev);

    }
}
