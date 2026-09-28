package collections.CollectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class jav {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6));

        Collections.sort(list);
        System.out.println("sort ==> " + list);

        Collections.reverse(list);
        System.out.println("reverse ==> " + list);

        Collections.shuffle(list);
        System.out.println("shuffle ==> " + list);

        System.out.println("max ==> " + Collections.max(list));

        System.out.println("min ==> " + Collections.min(list));

        System.out.println("frequency of 3 ==> "
                + Collections.frequency(list, 3));

        Collections.swap(list, 0, 2);
        System.out.println("after swap ==> " + list);

        List<Integer> unmodifiable = Collections.unmodifiableList(list);
        // unmodifiable.add(8); unsupported excpetion only reading purpose
        System.out.println("unmodified ==>  " + unmodifiable);
    }
}
