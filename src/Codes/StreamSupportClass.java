package Codes;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class StreamSupportClass {

    static void main(String[] args) {

        List<String> names = Arrays.asList("Sai", "harshi", "Shafi","s");

        Iterable<String> namesIterable = names;

        List<String> namesList = StreamSupport.stream(namesIterable.spliterator(), false).collect(Collectors.toList());

        System.out.println(namesList);
    }
}
