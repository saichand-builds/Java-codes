package Codes;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {

    int id;
    String name;
    String Dept;
    int salary;

    public Employee(int id, String name, String dept, int salary) {
        this.id = id;
        this.name = name;
        Dept = dept;
        this.salary = salary;
    }
}

public class SalaryStatsManual {

    static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Sai", "IT", 32887),
                new Employee(2, "Harshi", "HR", 329237),
                new Employee(8, "Shafi", "IT", 23762)
        );

        Map<String, Integer> MaxSalryDept = new HashMap<>();
        Map<String, Integer> MinSalaryDept = new HashMap<>();


        for (Employee emp : employees) {
           String Dept = emp.Dept;
            int Salary = emp.salary;


            if (!MaxSalryDept.containsKey(Dept) || Salary > MaxSalryDept.get(Dept)) {
                MaxSalryDept.put(Dept, Salary);
            }
            if (!MinSalaryDept.containsKey(Dept) || Salary < MinSalaryDept.get(Dept)) {
                MinSalaryDept.put(Dept, Salary);
            }
        }

        System.out.println("Max Salary for the Dept");
        MaxSalryDept.forEach((dept, salary) -> System.out.println(dept + " ->" + salary));
        System.out.println("Min Salary of the Dept");
        MinSalaryDept.forEach((dept, salary) -> System.out.println(dept + " -> " + salary));
    }
}

