package Codes;

import java.util.Arrays;
import java.util.List;

public class reduceEx {

    static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5);
        int sum=list.stream()
                       // o  initial value

                .reduce(0, (a , b ) -> a + b);

        System.out.println(sum);
    }
}
