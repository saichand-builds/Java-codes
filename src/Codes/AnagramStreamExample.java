package Codes;

import java.util.stream.Collectors;

public class AnagramStreamExample {

    static void main(String[] args) {
        String s1 = "earth";
        String s2 = "heart";

        System.out.println(isAnagram(s1, s2));
    }

    static boolean isAnagram(String s1, String s2) {

        if (s1 == null || s2 == null || s1.length() != s2.length()) {
            return false;
        }

        String sorted1 = s1.toLowerCase()
                .chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        String sorted2 = s2.toLowerCase()
                .chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        return sorted1.equals(sorted2);

    }

}
