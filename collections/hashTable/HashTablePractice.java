package collections.hashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTablePractice {

    public static void main(String[] args) {
        Hashtable<Integer, String> t = new Hashtable<>();
        t.put(1, "Angular");
        t.put(2, "Java");
        t.put(3, "Spring boot");
        t.put(4, "Angular");

        System.out.println("table ==> " + t);

        System.out.println("get method  ==> " + t.get(2));
        System.out.println(" contains key  ==>  " + t.containsKey(3));
        System.out.println("contains value  ==>  " + t.containsValue("Angular"));
        System.out.println("remove value ==> " + t.remove(1, "Angular"));
        System.out.println("table  ==> " + t);
        System.out.println("size " + t.size());

        // t.put(null, "React"); null pointer both
        // t.put(5, null);
        System.out.println("table  ==> " + t);

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");

        System.out.println("before ==> " + map);

        map.computeIfAbsent(2, key -> "Spring");

        System.out.println("after new key ==> " + map);

        map.computeIfAbsent(1, key -> "Hibernate");
      

        System.out.println("after existing key ==> " + map);

        map.computeIfPresent(1, (key, value) -> value + " Spring");
        System.out.println(map);
        map.computeIfPresent(10, (key, value) -> "React");
        System.out.println(map);

        map.merge(2, "TypeScript", (oldValue, newValue) -> oldValue + " " + newValue);
        System.out.println(map);

        map.compute(4, (key, value) -> "Angular");
        System.out.println("map last ==>  " + map);
    }
}
