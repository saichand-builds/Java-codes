package Codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindbyPrefix {

    static void main(String[] args) {

        List<String> list= Arrays.asList("apple","banana","avocado","orange");

        String prefix="a";

/*        List<String> result=list.stream()
                .filter(str-> str.toLowerCase().startsWith(prefix.toLowerCase()))
                .collect(Collectors.toList());
        System.out.println(result);*/
/*
                for(String names :list){
                    if(names.startsWith("a")){
                        System.out.println(names);
                    }
                }  */

                for(String names: list){

                    if(names.toLowerCase().startsWith("a",1)){
                        System.out.println(names);
                    }
                }

    }
}
