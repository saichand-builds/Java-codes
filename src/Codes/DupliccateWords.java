package Codes;

import java.util.HashMap;
import java.util.Map;

public class DupliccateWords {

    static void main(String[] args) {
        String text = "Java is great and java is powerful";

        fingduplicate(text);
    }

    public static void fingduplicate(String sts) {

        String[] words = sts.toLowerCase().split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0)+ 1);
        }
        System.out.println("Duplicate Words are");

        for (Map.Entry<String, Integer> entry : map.entrySet())
        {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
