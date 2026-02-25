package GroupBY;

public class Employees {

    String Name;
    String Dept;
    Double Salrary;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public Double getSalrary() {
        return Salrary;
    }

    public void setSalrary(Double salrary) {
        Salrary = salrary;
    }

    public Employees(String name, String dept, Double salrary) {
        Name = name;
        Dept = dept;
        Salrary = salrary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "Name='" + Name + '\'' +
                ", Dept='" + Dept + '\'' +
                ", Salrary=" + Salrary +
                '}';
    }
}
