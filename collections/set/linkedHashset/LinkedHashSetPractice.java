package collections.set.linkedHashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPractice {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add(null);
        set.add("Angular");
        set.add("Java");
        set.add("Spring boot");
        set.add("core Java");

        System.out.println("show set  ==>  " + set);

        System.out.println("Contains Angular  ==> " + set.contains("Angular"));
        System.out.println("remove Spring  ==> " + set.removeIf(s -> "Spring boot".equals(s)));
        System.out.println("size of array == >" + set.size()  + "    ===    and set    ===  " + set);

        System.out.println(" alredy null exist try to add another   ===   " + set.add(null));
        System.out.println(" final set  " + set);

    }
}
