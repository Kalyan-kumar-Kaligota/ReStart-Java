package collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorPractice {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Angular", "Java", "Spring boot", "React"));

        System.out.println("Original list ==> " + list);

        ListIterator<String> listIterator = list.listIterator();

        System.out.println("----- FORWARD -----");
        while (listIterator.hasNext()) {
            System.out.println("next => " + listIterator.next());
        }

        System.out.println("----- BACKWARD -----");
        while (listIterator.hasPrevious()) {
            System.out.println("previous => " + listIterator.previous());
        }

        System.out.println("----- set() example -----");
        listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String value = listIterator.next();
            if ("Angular".equals(value)) {
                listIterator.set("TypeScript");
                break;
            }
        }
        System.out.println("After set() => " + list);

        System.out.println("----- add() example -----");
        listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String value = listIterator.next();
            if ("Java".equals(value)) {
                listIterator.add("Hibernate");
                break;
            }
        }
        System.out.println("After add() => " + list);

        System.out.println("----- remove() example -----");
        listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String value = listIterator.next();
            if ("React".equals(value)) {
                listIterator.remove();
                break;
            }
        }
        System.out.println("After remove() => " + list);

        System.out.println("---------=============**************============-------------");

        List<String> list2 = new ArrayList<>(Arrays.asList("Angular", "Java", "Spring", "React"));
        ListIterator<String> it2 = list2.listIterator();

        System.out.println("Initial ==> " + list2);

        System.out.println("show the next === " + it2.next());
        while (it2.hasNext()) {
            System.out.println("next value again ==== " + it2.next());
        }

        System.out.println("----- set() on Angular to TypeScript -----");
        it2 = list2.listIterator();
        while (it2.hasNext()) {
            String value = it2.next();
            if ("Angular".equals(value)) {
                it2.set("TypeScript");
                break;
            }
        }
        System.out.println("After set() => " + list2);

        System.out.println("----- add() Hibernate before Spring -----");
        it2 = list2.listIterator();
        while (it2.hasNext()) {
            String value = it2.next();
            if ("Spring".equals(value)) {
                it2.add("Hibernate");
                break;
            }
        }
        System.out.println("After add() => " + list2);

        System.out.println("----- remove() React -----");
        it2 = list2.listIterator();
        while (it2.hasNext()) {
            String value = it2.next();
            if ("React".equals(value)) {
                it2.remove();
                break;
            }
        }
        System.out.println("Final list print => " + list2);
    }
}
