package Codes;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumbers {

    static void main(String[] args) {

        int [] arr={1,2,2,5,6,8,2,10,14,17};

        int MissingNumbers= IntStream.rangeClosed(1,20)
                .filter(num -> Arrays.stream(arr)
                        .noneMatch(a->a==num))
                .findFirst()
                .orElse(-1);
        System.out.println(MissingNumbers);
    }
}
