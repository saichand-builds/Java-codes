package Codes.toMapStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionExample {

    static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee(12, "Sai", 324.2),
                new Employee(21, "Harsi", 82378.3),
                new Employee(34, "Shafi", 7373.3));


 /*       Map<Integer, String> IdAndMap = employees
                .stream().
                collect(Collectors.toMap(Employee::getId, Employee::getName));

        System.out.println("ID   and  Get Name");
        IdAndMap.forEach((Id, Name) -> System.out.println(Id + "  " + Name));*/

     /*   List<Employee> emp= IntStream.range(1,4)
                .mapToObj(i-> new Employee(i))
                .collect(Collectors.toList());
        emp.forEach(e-> System.out.println(e.Id));*/
    }
}
