package collections.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Angular");
        set.add("Java");
        set.add("React");
        set.add(null);

        System.out.println("print hashset data === >  " + set);

        System.out.println("add one data  =>" + set.add("Hibernate"));
        System.out.println("try to add duplicate  ===  " + set.add("Java"));
        System.out.println("try to add null one more   ===  " + set.add(null));

        System.out.println(" print second data " + set);

        System.out.println("try to find the size   === " + set.size());

        System.out.println("try to remove the data  ==== ---- " + set.remove("React"));

        System.out.println(" print third data " + set);

        System.out.println(" last trial remove null" + set.remove(null));
        System.out.println(" print last data " + set);
        System.out.println("now try to add null   " + set.add(null));
        System.out.println(" last one  " + set);

        System.out.println("contails data   ====    " + set.contains("Angular"));

        // checking Employee Details
        Set<Employee> employee = new HashSet<>();

        Employee e1 = new Employee(1, "Kalyan");
        Employee e2 = new Employee(1, "Kalyan");

        Employee e = new Employee(1, "Kalyan");
        Employee e4 = new Employee(1, "Kumar");
        Employee e3 = new Employee(2, "Kalyan");

        System.out.println("check e hashcode  ==>" +e.hashCode());
        System.out.println("check e4 hashcode  ==>" +e4.hashCode());
        System.out.println("check e3 hashcode  ==>" +e3.hashCode());

        System.out.println("check e == e3   ==>  "+ (e == e3));
        System.out.println("check e.equals(e3)  ==> " + e.equals(e3));

        System.out.println("add e  ==>  "+ employee.add(e));
        System.out.println("add e3  ==>  "+ employee.add(e3));
        System.out.println("add e4  ==>  "+ employee.add(e4));

        System.out.println("HashSet checks hashCode first and then equals() for duplicates.");
        System.out.println("e1 hashCode ==> " + e1.hashCode());
        System.out.println("e2 hashCode ==> " + e2.hashCode());
        System.out.println("e1 == e2 ==> " + (e1 == e2));
        System.out.println("e1.equals(e2) ==> " + e1.equals(e2));

        System.out.println("add e1 ==> " + employee.add(e1));
        System.out.println("add e2 ==> " + employee.add(e2));

        System.out.println("employees ==> " + employee);
        System.out.println("size ==> " + employee.size());
        System.out.println(
                "Because hashCode() matches and equals() returns true, the second employee is treated as duplicate.");

    }
}
