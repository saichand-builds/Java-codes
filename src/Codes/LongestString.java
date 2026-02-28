package Codes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {

    static void main(String[] args) {

        List<String> StringList = Arrays.asList("Saichand", "JavaDeveloper", "FullstackDeveloper", "backed");

        System.out.println(StringList);

        String rev = StringList.stream()
                .max(Comparator.comparingInt(s -> s.length()))
                .orElse(null);
        System.out.println(rev + " "+rev.length());
    }
}
