package assess;

import java.util.*;

public class CRUDOperationsExample {

    public static void main(String[] args) {
        // ArrayList example
        List<String> arrayList = new ArrayList<>();
        performCRUDAndSort(arrayList, "ArrayList");

        // LinkedList example
        List<String> linkedList = new LinkedList<>();
        performCRUDAndSort(linkedList, "LinkedList");

        // HashSet example
        Set<String> hashSet = new HashSet<>();
        performCRUDAndSort(hashSet, "HashSet");

        // HashMap example
        Map<Integer, String> hashMap = new HashMap<>();
        performMapCRUDAndSort(hashMap, "HashMap");
    }

    public static void performCRUDAndSort(Collection<String> collection, String collectionType) {
        System.out.println("---- " + collectionType + " Operations ----");

        // Add elements
        collection.add("Purna");
        collection.add("Hema");
        collection.add("Anusha");
        collection.add("Neha");
        System.out.println("After adding elements: " + collection);

        // Remove element
        collection.remove("Hema");
        System.out.println("After removing element 'Hema': " + collection);

        // Update element
        if (collection instanceof List) {
            List<String> list = (List<String>) collection;
            int index = list.indexOf("Neha");
            if (index != -1) {
                list.set(index, "K.Neha");
            }
        } else if (collection instanceof Set) {
            Set<String> set = (Set<String>) collection;
            if (set.contains("Neha")) {
                set.remove("Neha");
                set.add("K.Neha");
            }
        }

        // Sorting (if applicable)
        if (collection instanceof List) {
            Collections.sort((List<String>) collection);
            System.out.println("Sorted " + collectionType + ": " + collection);
        } else if (collection instanceof Set) {
            Set<String> sortedSet = new TreeSet<>(collection);
            System.out.println("Sorted " + collectionType + ": " + sortedSet);
        }

        System.out.println();
    }

    public static void performMapCRUDAndSort(Map<Integer, String> map, String mapType) {
        System.out.println("---- " + mapType + " Operations ----");

        // Add elements
        map.put(1, "Purna");
        map.put(2, "Hema");
        map.put(3, "Anusha");
        map.put(4, "Neha");
        System.out.println("After adding elements: " + map);

        // Remove element
        map.remove(2);
        System.out.println("After removing element with key 2: " + map);

        // Update element 
        if (map.containsKey(1)) {
            map.put(1, "A.Purna");
        }
        System.out.println("After updating element with key 1: " + map);

        // Sort
        Map<Integer, String> sortedMap = new TreeMap<>(map);
        System.out.println("Sorted " + mapType + ": " + sortedMap);

        System.out.println();
    }
}
