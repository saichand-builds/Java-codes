package Codes;

import java.util.HashSet;

public class DuplicateArray {

    static void main(String[] args) {

        int [] arr={1,2,1,3,5,4,3,6,2,4};

        HashSet<Integer> set= new HashSet<>();

        for(int num :arr){
            if(!set.add(num))
            {
                System.out.println("Duplicate elements "+num);
            }
        }
    }
}
