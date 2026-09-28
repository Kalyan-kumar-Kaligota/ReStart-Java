package collections.maps.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {

    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        map.put(3, "Angular");
        map.put(1, "Java");
        map.put(2, "Spring boot");
        map.put(4, "React");

        System.out.println("map values ==>" + map);
        System.out.println("contains key ==> " + map.containsKey(2));
        System.out.println(map);
        System.out.println("remove ==> " + map.remove(2));
        System.out.println(map);
        System.out.println("size ==> " + map.size());
        System.out.println(" get ==> " + map.get(3));
        System.out.println("final map ==> " + map);

        TreeMap<Integer, String> map2 = new TreeMap<>();

        map2.put(10, "Java");
        map2.put(20, "Spring");
        map2.put(30, "Angular");
        map2.put(40, "React");
        map2.put(50, "TypeScript");

        System.out.println("first key ==> " + map2.firstKey());
        System.out.println(" last Key ==> " + map2.lastKey());

        System.out.println("Higher key ==>  " + map2.higherKey(30) + "  ==   and  ===  "+ map2.higherEntry(30));
        System.out.println("lower key  ==>  " + map2.lowerKey(30) + "  ==   and  ===  " + map2.lowerEntry(30));

        System.out.println("celling key ==> " + map2.ceilingKey(30) + "  ==  and  ==  " + map2.ceilingEntry(30));
        System.out.println("flore key  ==>  " + map2.floorKey(30) + " ==  and  == " + map2.floorEntry(30));

        // map2.put(null, "Angular"); null pointer exception
        map2.put(10, "Core Java");
        System.out.println(map2);
    }
}
