package Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondHighest {

    static void main(String[] args) {

        List<Integer> list = Arrays.asList(34, 65, 3, 25, 264, 24, 64);

        System.out.println("List of numbers");

        int rest = list.stream().sorted((n1, n2) -> n2.compareTo(n1)).skip(1).findFirst().get();
        System.out.println("result  -> " + rest);

    }
}
