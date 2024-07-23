package assess;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class ArrayRank {

    public static void main(String[] args) {
        int[] array = {40, 10, 20, 30};
        System.out.println("Original Array: " + Arrays.toString(array));
        replaceWithRanks(array);
        System.out.println("Array with Ranks: " + Arrays.toString(array));
    }

    public static void replaceWithRanks(int[] array) {
        // Copy the original array
        int[] sortedArray = array.clone();
        
        // Sort the copied array
        Arrays.sort(sortedArray);
       
        // Create a map to store the ranks
        Map<Integer, Integer> ranks = new HashMap<>();
        for (int i = 0; i < sortedArray.length; i++) {
            // If the element is not already in the map, put it with its rank
            ranks.putIfAbsent(sortedArray[i], i + 1);
        }

        // Replace elements in the original array with their ranks
        for (int i = 0; i < array.length; i++) {
            array[i] = ranks.get(array[i]);
        }
    }
}