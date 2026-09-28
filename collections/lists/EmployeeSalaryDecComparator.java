package collections.lists;

import java.util.Comparator;

public class EmployeeSalaryDecComparator implements Comparator<Employees> {

    @Override 
    public int compare(Employees e1, Employees e2) {
        return Double.compare(e2.salary, e1.salary);
    }
}
