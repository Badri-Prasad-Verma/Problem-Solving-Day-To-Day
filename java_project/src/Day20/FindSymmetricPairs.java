package Day20;

import java.util.HashMap;

public class FindSymmetricPairs {
    public static void main(String[] args) {
        int[][] pairs = {
            {11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}, {20, 11}
        };

        System.out.println("Symmetric pairs:");
        findSymmetricPairs(pairs);
    }

    static void findSymmetricPairs(int[][] pairs) {
        // Use a HashMap to store each pair
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int[] pair : pairs) {
            int first = pair[0];
            int second = pair[1];

            // Check if the reverse pair (second, first) exists in the map
            if (map.containsKey(second) && map.get(second) == first) {
                System.out.println("(" + first + ", " + second + ")");
            } else {
                // Store the pair in the map
                map.put(first, second);
            }
        }
    }
}

