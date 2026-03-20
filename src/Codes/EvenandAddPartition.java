package Codes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenandAddPartition {

    static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

/*
        Map<Boolean, List<Integer>> result=list.stream()
            .collect(Collectors.partitioningBy(x->x%2==0));
*/


        Map<String , List<Integer>> result=list.stream()
                        .collect(Collectors.groupingBy(
                                x->x % 2 == 0? "Even" :"Odd"
                        ));

        System.out.println(result);
    }
}
