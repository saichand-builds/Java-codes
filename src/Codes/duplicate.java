package Codes;

import java.util.*;
import java.util.stream.Collectors;

public class duplicate {

    static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,1,2,5,8);

        Set<Integer> set= new HashSet<>();

        List<Integer> duplicate=list.stream()
                .filter(s -> !set.add(s))
                .collect(Collectors.toList());

        System.out.println(duplicate);
    }
}
