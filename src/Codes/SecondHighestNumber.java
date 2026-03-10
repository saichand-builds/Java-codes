package Codes;

import java.util.Arrays;
import java.util.List;

public class SecondHighestNumber {

    static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(10,30,20,50,60,40);

        /**
         *
         * A comparator must return:
         *
         * Return value	Meaning
         * Negative	    a comes before b
         * Zero	        a and b are equal
         * Positive	    a comes after b
         *
         *
         */


        int SecondHighestNumber=numbers.stream()
                .sorted((a,b) ->b-a)
                .skip(1)
                .findFirst()
                .get();

        System.out.println(SecondHighestNumber);
    }

}
