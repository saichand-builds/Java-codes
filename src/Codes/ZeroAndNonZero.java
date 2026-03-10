package Codes;

import java.util.List;
import java.util.stream.Stream;

public class ZeroAndNonZero {

    static void main(String[] args) {

        List<Integer> numbers=List.of(1,3,4,5,0,3,0,6,0,0,3,7,0);

        List<Integer> list= Stream.concat
                (numbers.stream().filter(x->x!=0),
                        numbers.stream().filter(x ->x==0)).toList();

        System.out.println(list);
    }
}
