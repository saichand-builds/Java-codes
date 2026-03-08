package Codes;

import java.util.Arrays;

public class ArrayDuplicateRemove {

    static void main(String[] args) {

        int[] arr = {12, 35, 35, 40, 59, 78, 3, 4, 5, 6, 5, 7, 8, 7, 5};

        int[] distinct = Arrays.stream(arr).distinct().sorted().toArray();
        System.out.println(Arrays.toString(distinct));

    }
}
