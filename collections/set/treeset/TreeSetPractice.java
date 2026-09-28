package collections.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args) {

        // ================= TREESET BASIC =================

        Set<String> set = new TreeSet<>();

        set.add("Java");
        set.add("Angular");
        set.add("Spring");
        set.add("React");
        set.add("Java"); // duplicate

        System.out.println("TreeSet ==> " + set);

        System.out.println("Contains Java ==> " + set.contains("Java"));

        System.out.println("Remove Spring ==> " + set.remove("Spring"));

        System.out.println("Final Set ==> " + set);

        System.out.println("Size ==> " + set.size());

        // null is not supported with natural ordering
        // System.out.println("Add null ==> " + set.add(null));


        // ================= TREESET INTEGER =================

        Set<Integer> set2 = new TreeSet<>();

        set2.add(10);
        set2.add(20);
        set2.add(30);
        set2.add(40);
        set2.add(50);

        System.out.println();
        System.out.println("Integer TreeSet ==> " + set2);

        // TreeSet navigation methods

        System.out.println("first ==> " + ((TreeSet<Integer>) set2).first());
        System.out.println("last ==> " + ((TreeSet<Integer>) set2).last());

        System.out.println("higher(30) ==> " + ((TreeSet<Integer>) set2).higher(30));
        System.out.println("lower(30) ==> " + ((TreeSet<Integer>) set2).lower(30));

        System.out.println("ceiling(30) ==> " + ((TreeSet<Integer>) set2).ceiling(30));
        System.out.println("floor(30) ==> " + ((TreeSet<Integer>) set2).floor(30));


        // ================= TEST WITH 35 =================

        System.out.println();
        System.out.println("----- Testing with 35 -----");

        System.out.println("higher(35) ==> " + ((TreeSet<Integer>) set2).higher(35));
        System.out.println("lower(35) ==> " + ((TreeSet<Integer>) set2).lower(35));

        System.out.println("ceiling(35) ==> " + ((TreeSet<Integer>) set2).ceiling(35));
        System.out.println("floor(35) ==> " + ((TreeSet<Integer>) set2).floor(35));
    }
}