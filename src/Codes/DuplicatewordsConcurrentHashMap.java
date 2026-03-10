package Codes;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DuplicatewordsConcurrentHashMap {

    static void main(String[] args) {

        String str = "java is a Special and java is a powerful";

        findduplicatewords(str);
    }

    public static void findduplicatewords(String str) {

        String[] words = str.toLowerCase().split(" ");


        Map<String, Integer> map = new ConcurrentHashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("duplicate words are");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print("  "+ entry.getKey());
            }
        }
    }
}
