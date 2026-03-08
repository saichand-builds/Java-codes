package Codes;

import java.util.ArrayList;
import java.util.List;

public class CollectionForEach {

    static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("Sai");
        list.add("Shafi");
        list.add("Harshi");

        for (String names : list){
            System.out.println(names);
        }
    }
}
