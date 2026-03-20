package Codes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Maxium3 {

    static void main(String[] args) {

        List<Integer>  list= Arrays.asList(1,3,55,22,3,2,7);

        List<Integer> result=list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());


        System.out.println(result);
    }
}
