package collections.maps.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {

    public static void main(String[] args) {
        
        Map<Integer , String> map = new LinkedHashMap<>();

        map.put(3, "Angular");
        map.put(1, "Java");
        map.put(2, "Spring boot");
        map.put(4, null);

        System.out.println("linked hash map ==>  " + map);

        map.put(1, "Core Java");
        System.out.println(map);
    }
}
