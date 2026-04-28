package Codes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateExample1 {

    static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 4, 5, 6, 4, 3, 5, 6, 7, 8, 8, 9);

        // Hasset is store the Unique elements
        Set<Integer> set = new HashSet<>();
        // filer the elements
        numbers.stream().filter(
                ///  add return type is boolean if second time element added
                ///it becomes to the false. after notequals to comes it chages to true and it move to the print
                n -> !set.add(n)
                // printing the elements
        ).forEach(System.out::println);
/*
        List<Integer> duplite= numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(duplite);*/

    }
}
