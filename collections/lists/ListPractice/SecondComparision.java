import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class SecondComparision {

    public static void main(String[] args) {

        List<String> ali = new ArrayList<>(Arrays.asList("java", "spring", "hibernate", "angular"));
        List<String> llista = new LinkedList<>(Arrays.asList("java", "spring", "hibernate", "angular"));

        System.out.println("array list data ==>  " + ali);
        System.out.println("linked list data ==>  " + llista);

        System.out.println("get 2 print==> " + ali.get(2) + "   and liked list ==>" + llista.get(2));
        System.out.println("==============================");
        ali.add("React");
        llista.add(0, null);
        System.out.println("insert 2nd index react=== array   " + ali + "  linked list ===  " + llista);
        System.out.println("===============--------------------");

        System.out.println("array list data ==>  " + ali);
        System.out.println("linked list data ==>  " + llista);

        System.out.println("remove Spring  ===" + ali.remove(String.valueOf("spring")));
        System.out.println("remove Spring in linked  ===" + llista.remove(String.valueOf("spring")));

        System.out.println("array list data ==>  " + ali);
        System.out.println("linked list data ==>  " + llista);

        ListIterator<String> listit = llista.listIterator();

        while (listit.hasNext()) {

            String value = listit.next();
   
            System.out.println("current value ==> " + value);

            if ("java".equals(value)) {
                listit.remove();
            }
        }

        System.out.println("final list ==> " + llista);
    }
}
