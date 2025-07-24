import java.util.*;

public class CountDistinctInWindow {
    public static void main(String[] args) {
        // Input array and window size
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        // HashMap to count frequencies in the current window
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Step 1: Process the first window
        for (int i = 0; i < k; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        result.add(hm.size());

        // Step 2: Slide the window
        for (int i = k; i < arr.length; i++) {
            // Remove the element going out of the window
            int toRemove = arr[i - k];
            hm.put(toRemove, hm.get(toRemove) - 1);
            if (hm.get(toRemove) == 0) {
                hm.remove(toRemove);
            }

            // Add the new element coming into the window
            int toAdd = arr[i];
            hm.put(toAdd, hm.getOrDefault(toAdd, 0) + 1);

            // Store the count of distinct elements
            result.add(hm.size());
        }

        // Print the result
        System.out.println("Distinct element count in each window of size " + k + ": " + result);
    }
}
