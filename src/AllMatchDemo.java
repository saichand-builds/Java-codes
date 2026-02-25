import java.util.List;

public class AllMatchDemo {

    static void main(String[] args) {

        List<Integer> numbers = List.of(2, 3, 4, 5, 7, 6, 8, 9);
        boolean Alleven = numbers.stream().allMatch(number -> number % 2 == 0);

        System.out.println("All the Even Numbers  ->" + Alleven);

    }
}
