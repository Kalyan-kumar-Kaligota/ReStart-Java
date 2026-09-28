package collections.maps.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Spring");
        map.put(3, "Angular");
        map.put(4, "TypeScript");
        map.put(4, "Hibernate");

        System.out.println(" show the map data  ==>  " + map);

        System.out.println(" remove one key ==> " + map.remove(4));
        System.out.println("show after remove  ==> " + map);
        System.out.println("contains key ==> " + map.containsKey(2));
        System.out.println("contains value  ==> " + map.containsValue("Java"));
        System.out.println("size of the map data  ==> " + map.size());

        System.out.println("check is empty ==> " + map.isEmpty());

        map.put(5, null);
        map.put(6, null);

        System.out.println("show after null == > " + map);

        // try to add duplicate key
        map.put(5, null);
        System.out.println("after adding duplicate key  ==>  " + map);

        System.out.println("get null ==> " + map.get(null));
        map.put(null, null);
        map.put(null, null);
        map.put(null, null);
        System.out.println("contains null ==> " + map.containsKey(null));
        System.out.println("contains null value ==> " + map.containsValue(null));

        System.out.println("last and final ==> " + map);

        // key sets

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        // value set
        for (String value : map.values()) {
            System.out.println(value);
        }

        // entry set
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(
                    "key ==>" + entry.getKey() +
                            "value ==> " + entry.getValue());
        }

        map.put(2, "Hibernate");
        System.out.println(map);

        // set another value
        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            if (Integer.valueOf(3).equals(entry.getKey())) {
                entry.setValue("React");
            }
        }

        // get or default
        System.out.println(map.getOrDefault(2, "Not Found"));

        map.putIfAbsent(4, "React");
        System.out.println(" show after put if absent map  ==> " + map);

        map.replace(4, "React js");
        System.out.println(" show after replace map  ==> " + map);
    }
}
