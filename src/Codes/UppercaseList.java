package Codes;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UppercaseList {

    static void main(String[] args) {

        List<String> list= Arrays.asList("Sai","is" ,"a", "java developer");

        List<String> upperCase=list.stream()
                .filter(Objects::nonNull)
                .map(str ->str.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperCase);
    }
}
