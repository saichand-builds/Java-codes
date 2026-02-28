package Codes.toMapStream;

public class Employee {

      int Id;
      String Name;
      double Salry;

    public Employee(int id, String name, double salry) {
        Id = id;
        Name = name;
        Salry = salry;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSalry() {
        return Salry;
    }

    public void setSalry(double salry) {
        Salry = salry;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Salry=" + Salry +
                '}';
    }
}
