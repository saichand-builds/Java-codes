package Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {
    static void main(String[] args) {

        List<Integer> salary = Arrays.asList(1000, 50000, 80000, 40000, 2498921, 7813327, 78227891, 998829192, 228287);

        java.lang.Integer SecondhighestSalary = salary.stream()
                                                 .distinct()
                                                 .sorted(Comparator.reverseOrder())
                                                  .skip(1)
                                                  .findFirst()
                                                   .orElse(null);

        System.out.println("Second highest salary " + SecondhighestSalary);
    }
}
