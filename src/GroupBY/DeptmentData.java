package GroupBY;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DeptmentData {

    static void main(String[] args) {

        List<Employees> list = List.of(new Employees("Sai", "IT", 45000.9),
                new Employees("Harshi", "HR", 30000.9),
                new Employees("Shafi", "IT", 89392.9));

        Map<String, List<String>> ouput = list.stream().
                collect(Collectors.groupingBy(Employees::getDept, Collectors.mapping(Employees :: getName, Collectors.toList())));

        System.out.println(ouput);

    }
}
