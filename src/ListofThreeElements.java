import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListofThreeElements {

    static void main(String[] args) {

        List<Integer> input = Arrays.asList(1, 3, 4, 5, 6, 7, 8, 9, 10, 13, 3);
        int size = 3;

        java.util.List<List<Integer>> result = IntStream.range(0, input.size() / size)
                .mapToObj(i -> input.subList(i * size, i * size + size))
                .collect(Collectors.toList());

        System.out.println(result);

    }
}