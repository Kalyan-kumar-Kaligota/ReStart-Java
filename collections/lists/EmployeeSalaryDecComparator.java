package collections.lists;

import java.util.Comparator;

public class EmployeeSalaryDecComparator implements Comparator<Employees> {

    @Override 
    public int compare(Employees e1, Employees e2) {
        return Double.compare(e1.salary, e2.salary);
    }
}
