package Codes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Wordlength {

    static void main(String[] args) {

        List<String> words = Arrays.asList("Spring", "Springmvc", "SpringDataJPA");

        System.out.println(words);

        words.stream()
                .sorted(Comparator.comparingInt(word -> word.length()))
                .forEach(word -> System.out.println(word + " " + word.length()));
    }
}
