package Codes;

import java.util.List;

public class ForEach1 {

    static void main(String[] args) {

        List<Integer> list=List.of(1,3212,2,53,2);

        list.stream().parallel().forEachOrdered(

              numbers->System.out.println(numbers +" "));

    }
}
