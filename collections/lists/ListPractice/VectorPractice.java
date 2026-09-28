package collections.lists.ListPractice;

import java.util.Vector;

public class VectorPractice {

    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();

        vec.add("Angular");
        vec.add("React");
        vec.add("Java");
        vec.add("Spring boot");
        vec.add("next js");

        for(String v : vec) {
            System.out.println("print vector list :  ------>   "+ v);
        }

        System.out.println("size of vector =---->   "+vec.size());


        System.out.println("-----------------------------------------------");

        System.out.println("capacity of vector --------->  "+ vec.capacity());

        System.out.println("-----------------------------------------------");
        System.out.println("get 2 element ----->  "+ vec.get(2));

        System.out.println("-----------------------------------------------");

        System.out.println("replaced value at index 4 -----------> " + vec.set(4, "Core java"));
        System.out.println("vector after set -----------> " + vec);
        System.out.println("-----------------------------------------------");
        System.out.println("remove java from the vecor-------->   " +vec.remove(String.valueOf("Java")));
        System.out.println("-----------------------------------------------");
        
        System.out.println("again over all list -------->" + vec);

        System.out.println("-----------------------------------------------");

        System.out.println("spring contains check --------->  "+ vec.contains("Spring boot"));



        
    }
}
