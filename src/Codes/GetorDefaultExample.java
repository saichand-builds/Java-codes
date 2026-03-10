package Codes;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetorDefaultExample {

    static void main(String[] args) {

        String message = "A journey of a thousand miles begins with a single step";

        char arr[] = message.toCharArray();

        LinkedHashMap<Character, Integer> fc = new LinkedHashMap<>();

        for (char ch : arr) {
            fc.put(ch, fc.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : fc.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}
