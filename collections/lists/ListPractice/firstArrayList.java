package collections.lists.ListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class firstArrayList {

    public static void main(String [] args) {
        List<String> li = new ArrayList<>();
        li.add("kalyan");
        li.add("kalyan1");
        li.add("kalyan2");
        li.add("kalyan3");
        li.add("kalyan4");
        li.add("kalya5");
        li.add("kalyan6");

        for(String list: li) {
            System.out.println("list of data =====>"+list);
        }

        System.out.println("li 2nd index   ==   "+ li.get(2));
        System.out.println("replaced value at index 2   ==   " + li.set(2, "Kalyan2"));
        System.out.println("list after set   ==   " + li);
        System.out.println("remove kalyan1   ==   "+ li.remove(1));
        System.out.println("check contains   ==   "+ li.contains("kalyan3"));
        System.out.println("list size  ==  "+ li.size());


       List<Character> chare = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e'));

        System.out.println("check first array   ==  >>"+ chare);
        // System.out.println("remove element c"+ chare.remove(Character.valueOf('c')));
        Iterator<Character> it = chare.iterator();

        while( it.hasNext()) {
            Character c = it.next();
            if(c.equals('c')) {
                it.remove();
            }
        }
        System.out.println("after removing C in the list   ====>"+ chare);
    }

    

}
