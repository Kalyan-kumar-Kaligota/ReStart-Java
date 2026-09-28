package collections.lists;


public class Employees implements Comparable<Employees> {

    int id;
    String name;
    double salary;

    public Employees(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employees other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}
