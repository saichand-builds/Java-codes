package Codes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicatelement {

    static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 6, 3, 5, 6, 8, 1, 8);

        System.out.println("list of Numbers");

        Set<Integer> dup = new HashSet<>();
        list.stream().filter(n -> !dup.add(n)).
                forEach(n -> System.out.println("Duplicat elements in list" + n));

    }
}
