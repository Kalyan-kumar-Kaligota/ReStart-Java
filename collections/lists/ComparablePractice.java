package collections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparablePractice {

    public static void main(String[] args) {
        List<Employees> li = new ArrayList<>();

        li.add(new Employees(3, "Kaligota", 124000));
        li.add(new Employees(1, "kalyan", 68000));
        li.add(new Employees(2, "kumar", 103000));

        System.out.println("Befor sorting ==============         " + li);

        Collections.sort(li);

        System.out.println("After sorting ==========        " + li);

        li.sort(new EmployeeListComparator());

        // Collections.sort(li);
        li.sort(new EmployeeSalaryDecComparator());

        System.out.println("print here" + li);

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Spring");
        list.add("Angular");

        for( String l: list) {
            System.out.println("l" + l);
        }

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
